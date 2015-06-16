package KorchutF;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tictactec.ta.lib.meta.TaFuncSignature;

public class testTaFuncSignature {
	
	static TaFuncSignature taFuncSignature;
	
	@org.junit.BeforeClass
	public static void  BeforeClass () {	
	taFuncSignature = new TaFuncSignature();
	}
	
	@Test
	public void testGetInVarTypes(){
		taFuncSignature.getInVarTypes();
	}
	
//	@Test
//	public void testcompareTo(){
//		Object rhs = null;
//		taFuncSignature.compareTo(rhs);
//	}
	
	@Test
	public void testGetClass(){
		taFuncSignature.getClass();
	}
	
//	@Test
//	public void testEquals(){
//		Object obj = "hello";
//		taFuncSignature.equals(obj);
//		boolean expected = true;
//		boolean actual = taFuncSignature.equals("hello");
//		assertEquals(obj, expected, actual);
//		}

	@Test
	public void testgetName(){
		taFuncSignature.getName();
	}
	@Test
	public void testhashCode(){
		taFuncSignature.hashCode();
		String x = "hello";
		String y = "hello";
		assertTrue(x.hashCode() == y.hashCode());
	}
	@Test
	public void testToString(){
		taFuncSignature.toString();
	}
}


