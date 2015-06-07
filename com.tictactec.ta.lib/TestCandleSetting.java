package strawinska.magda;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.CandleSetting;
import com.tictactec.ta.lib.CandleSettingType;
import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.RetCode;

public class TestCandleSetting {

	static CandleSetting candleSetting=new CandleSetting(null, null, 0, 0);
	
	@BeforeClass
	public static void beforeClass() {
		candleSetting = new CandleSetting(candleSetting);
	}
	
	@Test
	public void testCandle() {

			
			
	
		candleSetting.CopyFrom(candleSetting);

	
				
				
	}
}


