package ca.pjones.sects;

public class SpawnPoint extends Location {
	
	private Player ownedBy;

	public Player getOwnedBy() {
		return ownedBy;
	}

	public void setOwnedBy(Player ownedBy) {
		this.ownedBy = ownedBy;
	}

}
