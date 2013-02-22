package ca.pjones.sects;

public class Location {
	
	private int pointX;
	private int pointY;
	private int movementCost;
	private Location eastLocation;
	private Location westLocation;
	private Location southLocation;
	private Location northLocation;
	
	public Location getEastLocation() {
		return eastLocation;
	}

	public void setEastLocation(Location eastLocation) {
		this.eastLocation = eastLocation;
	}

	public Location getWestLocation() {
		return westLocation;
	}

	public void setWestLocation(Location westLocation) {
		this.westLocation = westLocation;
	}

	public Location getSouthLocation() {
		return southLocation;
	}

	public void setSouthLocation(Location southLocation) {
		this.southLocation = southLocation;
	}

	public Location getNorthLocation() {
		return northLocation;
	}

	public void setNorthLocation(Location northLocation) {
		this.northLocation = northLocation;
	}

	public int getMovementCost() {
		return movementCost;
	}

	public void setMovementCost(int movementCost) {
		this.movementCost = movementCost;
	}

	public Location(int pointx, int pointy) {
		this.pointX = pointx;
		this.pointY = pointy;
	}

	public int getPointX() {
		return pointX;
	}

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public int getPointY() {
		return pointY;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}
	
	public Location() {}

}
