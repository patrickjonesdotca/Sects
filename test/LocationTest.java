package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ca.pjones.sects.Location;

public class LocationTest extends Location {

	@Test
	public void creationTest() {
		Location location = new Location(1, 1);
	}

}
