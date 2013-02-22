package ca.pjones.sects;

public class Move {
	private Player player;
	private Tile tile;
	private Location startLocation;
	private Location endLocation;
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Tile getTile() {
		return tile;
	}
	public void setTile(Tile tile) {
		this.tile = tile;
	}
	public Location getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(Location startLocation) {
		this.startLocation = startLocation;
	}
	public Location getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(Location endLocation) {
		this.endLocation = endLocation;
	}
	
}
