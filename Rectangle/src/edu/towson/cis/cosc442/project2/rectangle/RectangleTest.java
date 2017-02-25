package edu.towson.cis.cosc442.project2.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The unit test Class for Rectangle.
 */
public class RectangleTest {
	
	/** Declaring necessary test objects for {@link Rectangle} */
	Rectangle rect1, rect2;

	/**
	 * Initializes the necessary test objects for the test cases to use.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		rect1 = new Rectangle(new Point(2.0, 2.0), new Point(4.0, 7.0));
		rect2 = new Rectangle(new Point(2.0, 6.0), new Point(4.0, 3.0));
	}

	/**
	 * Test for the getArea() method of the {@link Rectangle} class and the rect1 object
	 */
	@Test
	public void testGetAreaRect1() {
		assertEquals(25.0, rect1.getArea(),0.001);
	}
	
	/**
	 * Test for the getArea() method of the {@link Rectangle} class and the rect2 object
	 */
	@Test
	public void testGetAreaRect2(){
		assertEquals(9.0, rect2.getArea(),0.001);
	}

	/**
	 * Test for the getDiagonal() method of the {@link Rectangle} class and the rect1 object
	 */
	@Test
	public void testGetDiagonalRect1() {
		assertEquals(7.0710, rect1.getDiagonal(), 0.0001);
	}
	
	/**
	 * Test for the getDiagonal() method of the {@link Rectangle} class and the rect2 object
	 */
	@Test
	public void testGetDiagonalRect2(){
		assertEquals(4.24264068, rect2.getDiagonal(), 0.0001);
	}
	
	/**
	 * Cleans up test objects after a test case is executed.
	 */
	@After
	public void tearDown(){
		rect1 = null;
		rect2 = null;
	}
}
