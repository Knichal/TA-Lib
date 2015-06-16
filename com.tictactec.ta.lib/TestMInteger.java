package AndrzejMatysiak;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.MInteger;

public class TestMInteger {

	static MInteger mInteger;

	@BeforeClass
	public static void BeforeClass() {
		mInteger = new MInteger();
	}

	@Test
	public void testEquals() {
		String obj = "hello";
		boolean expected = false;
		boolean actual = mInteger.equals("hello");
		assertEquals(obj, expected, actual);
	}

	@Test
	public void testHashCode() {

		String x = "hello";
		String y = "hello";
		assertTrue(x.hashCode() == y.hashCode());
	}

	@Test
	public void testGetClass() {
		mInteger.getClass();
	}

	@Test
	public void testToString() {
		assertNotNull(mInteger.toString());
	}

}
