package test;
import ca.pjones.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PlayerTest.class, 
				BoardTest.class, 
				TileTest.class, 
				GameTest.class,
				MoveTest.class,
				CombatTest.class,
				LocationTest.class})
public class TestSuite {

}
