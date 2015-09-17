package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegertest {
	private static MyInteger myIntOdd;
	private static MyInteger myIntEven;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		 myIntOdd=new MyInteger(5);
		 myIntEven=new MyInteger(8);
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInstanceIsEven() {
		assertTrue(myIntEven.isEven());
	}
	public void testInstanceIsOdd() {
		assertTrue(myIntOdd.isOdd());
	}

}
