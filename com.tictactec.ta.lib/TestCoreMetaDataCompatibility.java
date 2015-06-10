package AndrzejMatysiak;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.RetCode;
import com.tictactec.ta.lib.meta.CoreMetaData;
import com.tictactec.ta.lib.meta.CoreMetaDataCompatibility;
import com.tictactec.ta.lib.meta.CoreMetaInfo;
import com.tictactec.ta.lib.meta.PriceHolder;
import com.tictactec.ta.lib.meta.PriceInputParameter;
import com.tictactec.ta.lib.meta.annotation.FuncInfo;
import com.tictactec.ta.lib.meta.annotation.InputParameterInfo;
import com.tictactec.ta.lib.meta.annotation.IntegerList;
import com.tictactec.ta.lib.meta.annotation.IntegerRange;

public class TestCoreMetaDataCompatibility {

	static CoreMetaDataCompatibility coreMetaDataCompatibility;

	@BeforeClass
	public static void BeforeClass() {
		coreMetaDataCompatibility = new CoreMetaDataCompatibility();
	}

	@Test
	public void testHashCode() {
		String x = "hello";
		String y = "hello";
		assertTrue(x.hashCode() == y.hashCode());
	}
	
	@Test
	public void testToString() {
		assertNotNull(coreMetaDataCompatibility.toString());
	}

	@Test
	public void testEquals() {
		String obj = "hello";
		boolean expected = false;
		boolean actual = coreMetaDataCompatibility.equals("hello");
		assertEquals(obj, expected, actual);
	}
	
	@Test
	public void testGetClass() {
		coreMetaDataCompatibility.getClass();
	}

}
