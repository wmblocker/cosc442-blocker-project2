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
public class VendingMachineTest {
	
	VendingMachine vending;
	VendingMachineItem item;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		vending = new VendingMachine();
		item = new VendingMachineItem("Chocolate", 1.25);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		vending = null;
		
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem, java.lang.String)}.
	 */
	@Test
	public void testAddItem() {
		vending.addItem(item, "A");
		item = vending.getItem("A");
		assertEquals("Chocolate", item.getName());
	
	}
	/**
	 * Test if the program handles preventing a slot from being overwritten by another item after addItem()
	 */
	@Test
	public void testSlotNotEmpty(){
		vending.addItem(item, "A");
		item = new VendingMachineItem("Candy", 1.25);
		vending.addItem(item, "A");
		
	}
	/**
	 * Test if the program handles invalid Slot Input
	 */
	@Test
	public void testInvalidSlotInput(){
		vending.getItem("F");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 */
	@Test
	public void testRemoveItem() {
		vending.addItem(item, "A");
		item = vending.removeItem("A");
		assertEquals(true, item == null);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
	@Test
	public void testInsertMoney() {
		vending.insertMoney(2.00);
		assertEquals(2.00, vending.getBalance(), 0.001);
		
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		vending.insertMoney(2.00);
		assertEquals(2.00, vending.getBalance(), 0.001);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 */
	@Test
	public void testMakePurchase() {
		item = new VendingMachineItem("Chocolate", 1.25);
		vending.addItem(item, "A");
		vending.insertMoney(2.00);
		assertEquals(true, vending.makePurchase("A"));
		
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#returnChange()}.
	 */
	@Test
	public void testReturnChange() {
		vending.insertMoney(2.00);
		assertEquals(2.00, vending.returnChange(), 0.001);
	}

}
