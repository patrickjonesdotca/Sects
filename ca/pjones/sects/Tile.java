package ca.pjones.sects;

public class Tile {
	
	private int hitPoints;
	private String name;
	private boolean canMove;
	private boolean canAttack;
	private boolean hasSpecialAttack;
	private boolean isAlive;
	
	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	private int attackStrength;
	private int defenseStrength; 
	private int SpecialAttackStrength;
	private int unitSpawnCost;
	
	public int getUnitSpawnCost() {
		return unitSpawnCost;
	}

	public void setUnitSpawnCost(int unitSpawnCost) {
		this.unitSpawnCost = unitSpawnCost;
	}

	public int getSpecialAttackStrength() {
		return SpecialAttackStrength;
	}

	public void setSpecialAttackStrength(int specialAttackStrength) {
		SpecialAttackStrength = specialAttackStrength;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCanMove() {
		return canMove;
	}

	public void setCanMove(boolean canMove) {
		this.canMove = canMove;
	}

	public boolean isCanAttack() {
		return canAttack;
	}

	public void setCanAttack(boolean canAttack) {
		this.canAttack = canAttack;
	}

	public boolean isHasSpecialAttack() {
		return hasSpecialAttack;
	}

	public void setHasSpecialAttack(boolean hasSpecialAttack) {
		this.hasSpecialAttack = hasSpecialAttack;
	}

	public int getAttackStrength() {
		return attackStrength;
	}

	public void setAttackStrength(int attackStrength) {
		this.attackStrength = attackStrength;
	}

	public int getDefenseStrength() {
		return defenseStrength;
	}

	public void setDefenseStrength(int defenseStrength) {
		this.defenseStrength = defenseStrength;
	}

	public Tile(String name) {
		this.name = name;
	}
	
	public Tile() {}

}
