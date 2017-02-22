package TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import FsssPackage.machinetype;

public class MachineTypeTest {

	@Test
	public void testmachinetypeStringInt() {
		machinetype obj = new machinetype("Lathe",100);
		assertEquals(100, obj.getMTTF());
		assertEquals("Lathe",obj.getName());
	}

	@Test
	public void testmachinetype() {
		machinetype obj = new machinetype();
		assertEquals(0, obj.getMTTF());
		assertEquals("", obj.getName());
	}

	@Test
	public void testGetName() {
		machinetype obj = new machinetype();
		obj.setName("Lathe");
		assertEquals("Lathe", obj.getName());
	}

	@Test
	public void testSetName() {
		machinetype obj = new machinetype();
		obj.setName("Lathe");
		assertEquals("Lathe", obj.getName());		
	}

	@Test
	public void testGetMTTF() {
		machinetype obj = new machinetype();
		obj.setMTTF(100);
		assertEquals(100, obj.getMTTF());
	}

	@Test
	public void testSetMTTF() {
		machinetype obj = new machinetype();
		obj.setMTTF(100);
		assertEquals(100, obj.getMTTF());
	}

}