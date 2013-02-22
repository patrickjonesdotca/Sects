package ca.pjones.sects;

public class Combat {
	private Tile attacker;
	private Tile defender;
	
	public Combat(Tile tile1, Tile tile2) {
		this.attacker = tile1;
		this.defender = tile2;
	}
	
	public Combat() {}
	
	
	//TODO: Add in special attack and special defense modifiers
	public void battle() {
		int _attacker_damage = attacker.getAttackStrength() - defender.getDefenseStrength();
		int _defender_hp = defender.getHitPoints() - _attacker_damage;
		
		int _defender_damage = defender.getAttackStrength() - attacker.getDefenseStrength();
		int _attacker_hp = attacker.getHitPoints() - _defender_damage;
		
		defender.setHitPoints(_defender_hp);
		if(defender.getHitPoints() <= 0) {
			defender.setAlive(false);
		}
		if(_defender_damage > 0) {
			attacker.setHitPoints(_attacker_hp);
			if(attacker.getHitPoints() <= 0) {
				attacker.setAlive(false);
			}
		}
	}

}
