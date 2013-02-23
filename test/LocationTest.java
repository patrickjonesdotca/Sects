package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ca.pjones.sects.Location;
import ca.pjones.sects.Player;
import ca.pjones.sects.Tile;

public class LocationTest extends Location {

	@Test
	public void creationTest() {
		Location location = new Location(1, 1);
	}
	
	@Test
	public void captureEmptyLocationTest() {
		Player player1 = new Player();
		Location location1 = new Location();
		Tile tile1 = new Tile();
		tile1.setName("grunt");
		player1.addTile(tile1);
		tile1.capture(location1);
		location1.setOwnedBy(player1);
	}
}
