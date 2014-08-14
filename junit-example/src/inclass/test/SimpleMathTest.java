package inclass.test;

import static org.junit.Assert.*;
import inclass.SimpleMath;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleMathTest {

	SimpleMath simpleMath;
	
	@Before
	public void setUp() throws Exception {
		simpleMath = new SimpleMath();
	}

	@After
	public void tearDown() throws Exception {
		simpleMath = null;
	}

	@Test
	public void testAdd() {
		assertNotNull(simpleMath);
		
		assertEquals(7, simpleMath.add(3, 4));
		assertEquals(0, simpleMath.add(5, -5));		
		assertEquals(-4, simpleMath.add(3, -7));
		
	}

	@Ignore
	public void testRecursiveSum(){
		
		assertNotNull(simpleMath);
		
		assertEquals("Expected 55 but got " + simpleMath.recursiveSum(10), 
				55 , simpleMath.recursiveSum(10));
		
		for (int i=5; i<150; i+=10){
			assertEquals( ((i)*(i+1))/2, simpleMath.recursiveSum(i) );
		}
		
	} 

}
