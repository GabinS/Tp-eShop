package eShop;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tact.eshop.entity.Product;

public class ProductTest {
	
	protected Product prod;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.prod = new Product("testName");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetName() {
	}

}
