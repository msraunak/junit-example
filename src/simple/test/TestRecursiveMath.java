package simple.test;
import java.util.ArrayList;

import simple.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class TestRecursiveMath {

	RecursiveMath recMath;
	
	@Before
	public void beforeEveryTest(){
		recMath = new RecursiveMath();
	}
	
	@After
	public void afterEveryTest(){
		recMath = null;
	}
	
	@Test
	public void testRecursiveSum(){
		
		assertEquals(55, recMath.recursiveSum(10) );
		
	}
	
	@Ignore
	public void testRecursiveGCD(){
		
		assertEquals( 3, recMath.recursiveGCD(12, 15) );
		
	}
	


	/* Ignored test structures for JUnit test cases with optional arguments*/
	@Test (expected = IndexOutOfBoundsException.class)
	public void outOfBounds (){
			new ArrayList<Object>().get(1);
	}

	@Test (timeout=1000)
	public void infinityTest() {
		for (;;){
			// an empty infinite loop
		}
	}
}
