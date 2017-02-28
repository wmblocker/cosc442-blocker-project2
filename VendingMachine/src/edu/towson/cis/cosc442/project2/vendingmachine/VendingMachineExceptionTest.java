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
public class VendingMachineExceptionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException#VendingMachineException(java.lang.String)}.
	 */
	@Test
	public void testVendingMachineExceptionString() {
		new VendingMachineException("Error");
	}

}
