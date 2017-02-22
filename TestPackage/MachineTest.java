package TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import FsssPackage.machine;

public class MachineTest {

	@Test
	public void testmachineStringInt() {
		machine obj = new machine("Lathe",100);
		assertEquals("Lathe", obj.getName());
		assertEquals(100, obj.getMTTF());
		assertEquals(0, obj.getRunningDays());
	}

	@Test
	public void testmachine() {
		machine obj = new machine();
		assertEquals("", obj.getName());
		assertEquals(0, obj.getMTTF());
		assertEquals(0, obj.getRunningDays());
	}

	@Test
	public void testSetData() {
		machine obj = new machine();
		obj.setData("Lathe", 100);
		assertEquals(100, obj.getMTTF());
		assertEquals("Lathe", obj.getName());
		assertEquals(0, obj.getRunningDays());
	}

	@Test
	public void testSetRunningDays() {
		machine obj = new machine();
		obj.setRunningDays(100);
		assertEquals(100, obj.getRunningDays());
	}

	@Test
	public void testResetRunningDays() {
		machine obj = new machine();
		obj.resetRunningDays();
		assertEquals(0, obj.getRunningDays());
	}

	@Test
	public void testAddRunningDays() {
		machine obj = new machine();
		int days = obj.getRunningDays();
		obj.addRunningDays(200);
		assertEquals(days+200,obj.getRunningDays());
	}

	@Test
	public void testGetRunningDays() {
		machine obj = new machine();
		obj.setRunningDays(100);
		assertEquals(100,obj.getRunningDays());
	}

}
