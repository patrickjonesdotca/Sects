package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ca.pjones.sects.Combat;
import ca.pjones.sects.Tile;

public class CombatTest extends Combat {

	@Test
	public void testAttack() {
		Tile attacker = new Tile("attacker");
		attacker.setAttackStrength(10);
		attacker.setDefenseStrength(6);
		attacker.setHitPoints(2);
		
		Tile defender = new Tile("defender");
		defender.setDefenseStrength(5);
		defender.setAttackStrength(5);
		defender.setHitPoints(1);
		
		Combat combat = new Combat(attacker, defender);
		combat.battle();
		
		assertTrue(defender.getHitPoints() < 2);
		assertTrue(defender.isAlive() == false);
		assertTrue(attacker.getHitPoints() == 2);
	}


}
