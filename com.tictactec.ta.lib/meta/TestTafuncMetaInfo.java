package KorchutF;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.meta.TaFuncMetaInfo;

public class testTafuncMetaInfo {

	static TaFuncMetaInfo taFuncMetaInfo;
	@BeforeClass 
	public static void  BeforeClass () {
		String name="hello";
		Method method = null;
		Method lookbackMethod = null;
		taFuncMetaInfo = new TaFuncMetaInfo(name, method, lookbackMethod);
	}
	
//	@Test
//	public void test() {
//		Object[] taCore = new Object[]{5.55};
//		Object[] inArs = new Object[]{4.99};
//		int startIndex = 0;
//		int endIndex = 10;
//		Object[] outArs = new Object[5];
//		MInteger outBegIdx = new MInteger();
//		MInteger outNbElement  = new MInteger();
//		Object options = new Object();
//		//double[] expecteds = new double[]{ 5.66 };
//		taFuncMetaInfo.call(taCore, inArs, startIndex, endIndex, outArs, outBegIdx, outNbElement, options);
//		
//		Object outreal;
//		Object expecteds;
//		assertarraywalls(expecteds, outreal,0);
//	}
	
	
@Test 
public void testEquals() {
		String obj = "hello";
		boolean expected = false;
		boolean actual = taFuncMetaInfo.equals("hello");
		assertEquals(obj, expected, actual);
	}

@Test
public void test () {
	
	
}
}


