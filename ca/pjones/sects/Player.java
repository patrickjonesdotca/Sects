package ca.pjones.sects;

import java.util.ArrayList;

public class Player {
	
	private int points;
	private ArrayList<Tile> tiles;
	private DiscardPile discardPile;
	
	public DiscardPile getDiscardPile() {
		return discardPile;
	}

	public void setDiscardPile(DiscardPile discardPile) {
		this.discardPile = discardPile;
	}

	public ArrayList<Tile> getTiles() {
		return tiles;
	}

	public void setTiles(ArrayList<Tile> tiles) {
		this.tiles = tiles;
	}
	
	public void addTile(Tile tile) {
		this.tiles.add(tile);
	}

	public Player() {
		this.tiles = new ArrayList<Tile>();
		this.points = 0;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	

}
