package AndrzejMatysiak;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.meta.CoreMetaInfo;
import com.tictactec.ta.lib.meta.TaFuncClosure;
import com.tictactec.ta.lib.meta.TaFuncMetaInfo;

public class TestCoreMetaInfo {

	static CoreMetaInfo coreMetaInfo;

	@BeforeClass
	public static void BeforeClass() {
		coreMetaInfo = new CoreMetaInfo();
	}

	@Test
	public void testEquals() {
		String obj = "hello";
		boolean expected = false;
		boolean actual = coreMetaInfo.equals("hello");
		assertEquals(obj, expected, actual);
	}

	@Test
	public void testGet() {
		String taName = "hello";
		Class[] inVarTypes = new Class[0];
		TaFuncMetaInfo tfmi = coreMetaInfo.get(taName, inVarTypes);
	}

	@Test
	public void testHashCode() {
		String x = "hello";
		String y = "hello";
		assertTrue(x.hashCode() == y.hashCode());
	}

	@Test
	public void testToString() {
		assertNotNull(coreMetaInfo.toString());
	}
	
	@Test
	public void testGetClass() {
		coreMetaInfo.getClass();
	}
	
	@Test
	public void testGetAllFuncs() {
		coreMetaInfo.getAllFuncs();
	}
	
	@Test
	public void testMain() {
		String[] args = null;
		coreMetaInfo.main(args);
	}
	
	@Test
	public void testForEach() throws Exception {
		TaFuncClosure closure = null;
		coreMetaInfo.forEach(closure);

	}

}
