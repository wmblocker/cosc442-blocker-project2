/**
 * 
 */
package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wblock1
 *
 */
public class VendingMachineItemTest {

	VendingMachineItem item;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		item = new VendingMachineItem("Chocolate", 1.25);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#VendingMachineItem(java.lang.String, double)}.
	 */
	@Test
	public void testVendingMachineItem() {
		assertNotNull(item);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#getName()}.
	 */
	@Test
	public void testGetName() {
		assertEquals("Chocolate", item.getName());
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#getPrice()}.
	 */
	@Test
	public void testGetPrice() {
		assertEquals(1.25, item.getPrice(), 0.001);
	}

}
