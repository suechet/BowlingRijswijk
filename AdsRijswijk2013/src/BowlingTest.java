import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class BowlingTest {

	@Test
	public void allGutterBallsScoresZero() {
		int rolls[] = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
		BowlingGame aGame = new BowlingGame(rolls);
		assertEquals(0, aGame.score());
	}
	
	@Test
	public void someOpenFramesScores90() {
		int rolls[] = {5,4, 5,4, 5,4, 5,4, 5,4, 5,4, 5,4, 5,4, 5,4, 5,4};
		BowlingGame aGame = new BowlingGame(rolls);
		assertEquals(90, aGame.score());
	}
	
	@Test
	public void aSpareScores23() {
		int rolls[] = {5,5, 5,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
		BowlingGame aGame = new BowlingGame(rolls);
		assertEquals(23, aGame.score());
	}
	
	@Test
	public void twoSparesScores36() {
		int rolls[] = {5,5, 5,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 5,5,3};
		BowlingGame aGame = new BowlingGame(rolls);
		assertEquals(36, aGame.score());
	}
	
	@Test
	public void aStrikeScores22() {
		int rolls[] = {10, 5,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
		BowlingGame aGame = new BowlingGame(rolls);
		assertEquals(22, aGame.score());
	}
	
	@Test
	public void allStrikesScores300() {
		int rolls[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		BowlingGame aGame = new BowlingGame(rolls);
		assertEquals(300, aGame.score());
	}
	
	@Test
	public void alternatingStrikeSpareScores200() {
		int rolls[] = {10, 5,5, 10, 6,4, 10, 3,7, 10, 1,9, 10, 8,2, 10};
		BowlingGame aGame = new BowlingGame(rolls);
		assertEquals(200, aGame.score());
	}
}
