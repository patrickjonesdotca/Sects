package test;

import static org.junit.Assert.*;
import ca.pjones.sects.Player;
import org.junit.Test;

public class PlayerTest extends Player {

	@Test
	public void testPoints() {
		Player player1 = new Player();
		player1.setPoints(10);
		Integer iPoints = player1.getPoints();
		assertEquals("10", iPoints.toString());
	}

}
