package eShop;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tact.eshop.entity.Customer;

public class CustomerTest {
	
	protected Customer ct;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.ct = new Customer("testFName","testLName");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetFirstName() {
		assertEquals("testFName", this.ct.getFirstName());
	}
	
	@Test
	public void testsetFirstName() {		
		this.ct.setFirstName("testFName2");		
		assertEquals("testFName2", this.ct.getFirstName());
	}
	
	@Test
	public void testgetLastName() {
		assertEquals("testLName", this.ct.getLastName());
	}
	
	@Test
	public void testsetLastName() {
		this.ct.setLastName("testLName2");		
		assertEquals("testLName2", this.ct.getLastName());
	}
	
		
	@Test
	public void testsetPhone() {
		this.ct.setPhone("33+");		
		assertEquals("33+", this.ct.getPhone());

	}
	
	@Test
	public void testsetAdress() {
		this.ct.setAddress("testAdress");		
		assertEquals("testAdress", this.ct.getAddress());
	}
	
	@Test
	public void testsetZip() {
		this.ct.setZip(111);		
		assertEquals(111, this.ct.getZip());
	}
	
	@Test
	public void testsetCity() {
		this.ct.setCity("testCity");		
		assertEquals("testCity", this.ct.getCity());
	}
}
