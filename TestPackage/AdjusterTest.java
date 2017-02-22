package TestPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import FsssPackage.adjuster;

public class AdjusterTest {
	@Test
	public void testAdjuster() {
		adjuster obj = new adjuster();
		assertEquals("", obj.getId());
		assertEquals(0,obj.getDaysWorked());
	}

	@Test
	public void testGetID() {
		adjuster obj = new adjuster();
		obj.setId("Lathe");
		assertEquals("Lathe", obj.getId());
	}

	@Test
	public void testSetID() {
		adjuster obj = new adjuster();
		obj.setId("Lathe");
		assertEquals("Lathe", obj.getId());
	}

	@Test
	public void testAddDays() {
		adjuster obj = new adjuster();
		int days = obj.getDays(); 
		obj.AddDays(100);
		assertEquals(days+100, obj.getDays());
	}

	@Test
	public void testGetDays() {
		adjuster obj = new adjuster();
		int days = obj.getDays(); 
		obj.AddDays(100);
		assertEquals(days+100, obj.getDays());
	}

}
