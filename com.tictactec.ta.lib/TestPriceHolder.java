package AndrzejMatysiak;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.meta.PriceHolder;

public class TestPriceHolder {

	static PriceHolder priceHolder;
	
	@BeforeClass
	public static void BeforeClass() {
		double[] o = new double[] { 4.54, };
		double[] h = new double[] { 4.54, };
		double[] l = new double[] { 4.54, };
		double[] c = new double[] { 4.54, };
		double[] v = new double[] { 4.54, };
		double[] i = new double[] { 4.54, };
		priceHolder = new PriceHolder(o, h, l, c, v, i);
	}

	@Test
	public void testGetC() {
		priceHolder.getC();
	}

	@Test
	public void testGetH() {
		priceHolder.getH();
	}

	@Test
	public void testGetL() {
		priceHolder.getL();
	}

	@Test
	public void testGetO() {
		priceHolder.getO();
	}

	@Test
	public void testGetV() {
		priceHolder.getV();
	}

	@Test
	public void test() {
		priceHolder.getC();
	}

	@Test
	public void testI() {
		priceHolder.getI();
	}

	@Test
	public void testGetClass() {
		priceHolder.getClass();
	}

	@Test
	public void testSize() {
		priceHolder.getSize();
	}

	@Test
	public void testToArrays() {
		priceHolder.toArrays();
	}

	@Test
	public void testEquals() {
		String obj = "hello";
		boolean expected = false;
		boolean actual = priceHolder.equals("hello");
		assertEquals(obj, expected, actual);
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

	@Test
	public void testGetSize() {
		priceHolder.getSize();
	}

}
