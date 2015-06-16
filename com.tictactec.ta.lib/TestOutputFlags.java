/**
 * 
 */
package Krzysztof.Herkt;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.meta.annotation.OutputFlags;

public class TestOutputFlags {

	static OutputFlags outputFlags;
	
	@BeforeClass
	public static void BeforeClass(){
		outputFlags = new OutputFlags();
	}
	
//	@Test
//	public void testEquals() {
//		String obj = "hello";
//		boolean expected = false;
//		boolean actual = outputFlags.equals("hello");
//		assertEquals(expected, actual);
//	}

	@Test
	public void testGetClass(){
		outputFlags.getClass();
	}
	
	@Test
	public void testHashCode(){
		String x = "hello";
		String y = "hello";
		assertTrue(x.hashCode() == y.hashCode());
	}
	
	@Test
	public void test(){
		assertNotNull(outputFlags.toString());
		
	
	}
}
