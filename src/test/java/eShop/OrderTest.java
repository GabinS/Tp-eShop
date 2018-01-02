package eShop;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tact.eshop.entity.Customer;
import com.tact.eshop.entity.Order;

public class OrderTest {
	
	protected Order od;
	protected Customer ct;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.od = new Order();
		this.ct = new Customer("testFName","testLName");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetFirstNameCustomer() {
		this.od.setCustomer(this.ct);
		assertEquals("testFName", this.od.getCustomer().getFirstName());
	}
	
	@Test
	public void testgetLastNameCustomer() {
		this.od.setCustomer(this.ct);
		assertEquals("testLName", this.od.getCustomer().getLastName());
	}

}
