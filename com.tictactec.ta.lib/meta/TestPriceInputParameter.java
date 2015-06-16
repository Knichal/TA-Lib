package OskarGargalis;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.meta.PriceInputParameter;

public class TestPriceInputParametr {

	static PriceInputParameter priceInputParametr;
	
	@BeforeClass
	public static void BeforeClass(){
		double[] o = new double[] { 4.54};
		double[] h = new double[] { 4.54};
		double[] l = new double[] { 4.54};
		double[] c = new double[] { 4.54};
		double[] v = new double[] { 4.54};
		double[] i = new double[] { 4.54};
		int flags = 6;
		priceInputParametr = new PriceInputParameter(flags , o, h, l, c, v, i);
	}
	
	@Test
	public void testGetC() {
		priceInputParametr.getC(); 
	}

	@Test
	public void testgetClass() {
		priceInputParametr.getClass();
}

	@Test
	public void testGetCount() {
		priceInputParametr.getCount();
	}
	
	@Test
	public void testGetFlags() {
		priceInputParametr.getFlags();
	}
	
	@Test
	public void testGetH() {
		priceInputParametr.getH(); 
	}
	
	@Test
	public void testGetI() {
		priceInputParametr.getI(); 
	}	
	
	@Test
	public void testGetL() {
		priceInputParametr.getL(); 
	}	
	
	@Test
	public void testGetO() {
		priceInputParametr.getO(); 
	}	
	
	@Test
	public void testGetSize() {
		priceInputParametr.getSize(); 
	}	
	
	@Test
	public void testGetV() {
		priceInputParametr.getV(); 
	}	
	
	@Test
	public void testHashCode() {
		String x = "hello";
		String y = "hello";
		assertTrue(x.hashCode() == y.hashCode());
	}	
	
	@Test
	public void testToArrays(){
		priceInputParametr.toArrays();
	}
	
	@Test
	public void testToString(){
		priceInputParametr.toString();
	}
}    