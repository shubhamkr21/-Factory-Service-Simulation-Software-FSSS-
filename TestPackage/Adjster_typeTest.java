package TestPackage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import FsssPackage.adjuster_type;

public class Adjster_typeTest {
	@Test
	public void testAdjusterGroupStringIntArrayListOfStringArrayListOfInteger() {
		ArrayList<String> Types = new ArrayList<String>();
		Types.add("Lathe");Types.add("Drill");
		
		adjuster_type obj = new adjuster_type("A1",50,Types);
		assertEquals(50, obj.noofAdj);
		assertEquals("A1", obj.id);
		assertEquals(Types, obj.machine_name);	
	}

	@Test
	public void testAdjusterGroup() {
		adjuster_type obj = new adjuster_type();
		assertEquals(0, obj.noofAdj);
		assertEquals(null, obj.id);
		assertEquals(null, obj.machine_name);
	}
}
