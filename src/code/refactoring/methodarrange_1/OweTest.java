package code.refactoring.methodarrange_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OweTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrintOwing() {
		Owe owe = new Owe("홍길동");
		Order order1=new Order(1000); 
		// testcode
		owe.addOrder(order1);
		owe.printOwing(200);
	}
}
