
public class BowlingGame {

	private int[] rolls;

	public  BowlingGame(int[] rolls) {
		this.rolls = rolls;
	}
	
	public int score() {
		int sum = 0;
		int frameStart = 0;
		for(int frame = 0; frame < 10; frame++) {
			int frameScore = 0;
			if ( isStrike(frameStart) ) {
				frameScore = 10 + rolls[frameStart+1] + rolls[frameStart+2];
				frameStart++;
			} else if ( isSpare(frameStart) ) {
				frameScore = 10 + rolls[frameStart+2];
				frameStart+= 2;
			} else {
				frameScore = rolls[frameStart] + rolls[frameStart + 1];
				frameStart += 2;
			}
			sum += frameScore;
		}
		
		return sum;
	}

	private boolean isSpare(int frameStart) {
		if ( isStrike(frameStart) ) return false;
		return rolls[frameStart] + rolls[frameStart+1] == 10;
	}

	private boolean isStrike(int frameStart) {
		return rolls[frameStart] == 10;
	}

}
