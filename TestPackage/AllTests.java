package TestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Adjster_typeTest.class, AdjusterTest.class,
		  MachineTest.class, MachineTypeTest.class })
public class AllTests {

}