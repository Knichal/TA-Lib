package AndrzejMatysiak;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.meta.CoreMetaDataCompatibility;
import com.tictactec.ta.lib.meta.PriceHolder;

public class TestPriceHolder {

	static PriceHolder priceHolder;
	
	@BeforeClass
	public static void BeforeClass() {
		double[] o = new double[] { 1.11 };
		double[] h = new double[] { 2.22 };
		double[] l = new double[] { 3.33 };
		double[] c = new double[] { 4.44 };
		double[] v = new double[] { 5.55 };
		double[] i = new double[] { 6.66 };
		
		priceHolder = new PriceHolder(o, h, l, c, v, i);
	}
	
	@Test
	public void testEquals() {
		String obj = "hello";
		boolean expected = false;
		boolean actual = priceHolder.equals("hello");
		assertEquals(obj, expected, actual);
	}
	
	@Test
	public void testGetC() {
		double[] c = new double[] { 4.44 };
		double[] actual = priceHolder.getC();
	}
	
	@Test
	public void testGetH() {
		double[] actual = priceHolder.getH();
	}
	
	@Test
	public void testGetI() {
		double[] actual = priceHolder.getI();
	}
	
	@Test
	public void testGetL() {
		double[] actual = priceHolder.getL();
	}
	
	@Test
	public void testGetO() {
		double[] actual = priceHolder.getO();
	}
	
	@Test
	public void testGetV() {
		double[] actual = priceHolder.getV();
	}
	
	@Test
	public void testGetClass() {
		priceHolder.getClass();
	}
	
	@Test
	public void testGetSize() {
		priceHolder.getSize();
	}
	
	@Test
	public void testToArrays() {
		priceHolder.toArrays();
	}
	
	@Test
	public void testHashCode() {
		String x = "hello";
		String y = "hello";
		assertTrue(x.hashCode() == y.hashCode());
	}
	
	@Test
	public void testToString() {
		assertNotNull(priceHolder.toString());
	}
}
