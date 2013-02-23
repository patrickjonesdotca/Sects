package ca.pjones.sects;

import java.util.ArrayList;

public class DiscardPile {
	
	private ArrayList<Tile> tiles;
	
	public void addToDiscard(Tile tile) {
		this.tiles.add(tile);
	}
	
	public ArrayList<Tile> getTiles() {
		return tiles;
	}

	public void setTiles(ArrayList<Tile> tiles) {
		this.tiles = tiles;
	}

	public DiscardPile() {}

}
