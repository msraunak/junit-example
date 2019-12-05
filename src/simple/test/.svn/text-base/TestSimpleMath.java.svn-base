package simple.test;

import simple.SimpleMath;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TestSimpleMath {
	
	SimpleMath simpleMath;
	
	@Before
	public void runBeforeEveryTest(){
		simpleMath = new SimpleMath();
	}
	
	@After
	public void runAfterEveryTest(){
		simpleMath = null;
	}
	
	@Test
	public void testAdd(){
		assertNotNull(simpleMath);
		assertEquals(7, simpleMath.add(3,4));
		assertEquals(7, simpleMath.add(4,3));
	}
	
	@Test
	public void testSubtract(){
		assertEquals(-3, simpleMath.subtract(0, 3));
		assertEquals(5, simpleMath.subtract(12, 7));
	}
	
}
