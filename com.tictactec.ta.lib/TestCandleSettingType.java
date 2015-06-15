package strawinska.magda;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.portable.ValueBase;

import com.tictactec.ta.lib.CandleSetting;
import com.tictactec.ta.lib.CandleSettingType;

public class TestCandleSettingType {

   static TestCandleSettingType testCandleSettingType = new TestCandleSettingType();
   

	@Test
	public void test() {
		if (TestCandleSettingType.class.equals(testCandleSettingType)) {
		}
	}
	@Test
	public void test2() {
		if (CandleSettingType.BodyDoji.equals(testCandleSettingType)) {
		}

	}
	
	@Test
	public void test3() {
		if (CandleSettingType.BodyLong.equals(testCandleSettingType)) {
		}
	}
	
	@Test
	public void test4() {
		if (CandleSettingType.BodyShort.equals(testCandleSettingType)) {
		}
	}
	
	@Test
	public void test5() {
		if (CandleSettingType.BodyVeryLong.equals(testCandleSettingType)) {
		}
	}
	
	@Test
	public void test6() {
		if (CandleSettingType.Equal.equals(testCandleSettingType)) {
		}
	}
	
	@Test
	public void test7() {
		if (CandleSettingType.Far.equals(testCandleSettingType)) {
		}
	}
	
	@Test
	public void test8() {
		if (CandleSettingType.Near.equals(testCandleSettingType)) {
		}
	}
	
	@Test
	public void test9() {
		if (CandleSettingType.ShadowLong.equals(testCandleSettingType)) {
		}
	}
	
	@Test
	public void test10() {
		if (CandleSettingType.ShadowShort.equals(testCandleSettingType)) {
		}
	}
	
	@Test
	public void test11() {
		if (CandleSettingType.ShadowVeryLong.equals(testCandleSettingType)) {
		}
	}
	
	@Test
	public void test12() {
		if (CandleSettingType.ShadowVeryShort.equals(testCandleSettingType)) {
		}
		
		CandleSettingType.ShadowVeryShort.values();
		CandleSettingType.ShadowVeryShort.valueOf(CandleSettingType.BodyDoji.toString());
	}

}
