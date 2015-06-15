package strawinska.magda;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.Compatibility;
import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.CoreAnnotated;
import com.tictactec.ta.lib.FuncUnstId;
import com.tictactec.ta.lib.MAType;
import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.RetCode;

public class TestCoreAnnotated extends TestCore{
	
	
		@Test
		public void testSMA() {
			CoreAnnotated coreAnnotated;
			coreAnnotated = new CoreAnnotated();
			
			super.testSMA();	
		}
	
		@Test
		public void testSMA3() {
			super.testSMA3();	
		}

		@Test
		public void testCdlHikkakeLookback() {
		    super.testCdlHikkakeLookback();
		}
		 
		@Test
		public void testSmaLookback() {
			super.testSmaLookback();
		}
	
		 @Test
			public void testAcosLookback() {
			 super.testAcosLookback();
			}
		 
		 @Test
			public void testAddLookback() {
			 super.testAddLookback();
			}
		
		 @Test
		 public void TestAdLookback() {
				     super.testAddLookback(); }
		 
		 @Test
			public void testMinMaxLookback() {
			 super.testSmaLookback();
			}
		 
		 @Test
			public void testMinMaxIndexLookback() {
			 super.testMinMaxLookback();
			}
		 
		 @Test
			public void testSumLookback() {
			 super.testSmaLookback();
			}
		 
		 @Test
			public void testTrimaLookback() {
			 super.testTrimaLookback();
			}
		 
		 @Test
			public void testTsfLookback() {
			 super.testTsfLookback();
			}
		 
		 @Test
			public void testWillLookback() {
			 super.testWillLookback();
			}
		 
		 @Test
			public void testWmaLookback() {
			 super.testWmaLookback();
			}
		 
		 @Test
			public void testAroonLookback() {
			 super.testAroonLookback();
			}
	
		 @Test
			public void testAroonOscLookback() {
			 super.testAroonOscLookback();
			}
		 
		 @Test
			public void testBetaLookback() {
			 super.testBetaLookback();
			}
		 
		 @Test
			public void testRocLookback() {
			 super.testRocLookback();
			}
		 
		 @Test
			public void testRocPLookback() {
			 super.testRocPLookback();
			}
		 
		 @Test
			public void testRocRLookback() {
			 super.testRocRLookback();
			}
		 
		 @Test
			public void testRocR100Lookback() {
			 super.testRocR100Lookback();
			}
		 
		 @Test
			public void testCdl12Lookback() {
			 super.testCdl12Lookback();
			}
		 
		 @Test
			public void testCdl3BlackCrowsLookback() {
			 super.testCdl3BlackCrowsLookback();
			}
		 
		 @Test
			public void testCdl3LineStrikeLookback() {
			 super.testCdl3LineStrikeLookback();
			}
		 
		 @Test
			public void testCdlBreakwayLookback() {
			 super.testCdlBreakwayLookback();
			}
		 
		 @Test
			public void testCdlConcealBabyWallLookback() {
			 super.testCdlConcealBabyWallLookback();
			}
		 
		 @Test
			public void testCdlLadderBottomLookback() {
			 super.testCdlLadderBottomLookback();
			}
		 
		 @Test
			public void testCdlMatchingLowLookback() {
			 super.testCdlMatchingLowLookback();
			}
		 
		 @Test
			public void testCdlPiercingLookback() {
			 super.testCdlPiercingLookback();
			}
		 
		 @Test
			public void testCdlStickSandwichLookback() {
			 super.testCdlStickSandwichLookback();
			}
		 
		 @Test
			public void testCdlTasukiGapLookback() {
			 super.testCdlTasukiGapLookback();
			}
		 
		 @Test
			public void testCdlTristarLookback() {
			 super.testCdlTristarLookback();
			}
		 
		 @Test
			public void testHtDcPeriodLookback() {
			 super.testHtDcPeriodLookback();
			}
		 
		 @Test
			public void testHtDcPhaseLookback() {
			 super.testHtDcPhaseLookback();
			}
		 
		 @Test
			public void testHtPhasorLookback() {
			 super.testHtPhasorLookback();
			}
		 
		 @Test
			public void testHtSineLookback() {
			 super.testHtSineLookback();
			}
		 
		 @Test
			public void testHtTrendlineLookback() {
			 super.testHtTrendlineLookback();
			}
		 
		 @Test
			public void testHtTrendmodeLookback() {
			 super.testHtTrendmodeLookback();
			}
		 
		 @Test
			public void testCdlDojiLookback() {
			 super.testCdlDojiLookback();
			}

		 
		 
		 @Test
			public void testAsinLookback() {
			 super.testAsinLookback();
			}
		 
		 @Test
			public void testAvgPriceLookback() {
			 super.testAvgPriceLookback();
			}
		 
		 @Test
			public void testBopLookback() {
			 super.testBopLookback();
			}
		 
		 @Test
			public void testCdl3OutsideLookback() {
			 super.testCdl3OutsideLookback();
			}
		 
		 @Test
			public void testCdlEngulfingLookback() {
			 super.testCdlEngulfingLookback();
			}
		 
		 @Test
			public void testCdlXSideGap3MethodsLookback() {
			 super.testCdlXSideGap3MethodsLookback();
			}
		 
		 @Test
			public void testCeilLookback() {
			 super.testCeilLookback();
			}
		 
		 @Test
			public void testCosLookback() {
			 super.testCosLookback();
			}
		 
		 @Test
			public void testCoshLookback() {
			 super.testCoshLookback();
			}
		 
		 @Test
			public void testDivLookback() {
			 super.testDivLookback();
			}
		 
		 @Test
			public void testExpLookback() {
			 super.testExpLookback();
			}
		 
		 @Test
			public void testFloorLookback() {
			 super.testFloorLookback();
			}
		 
		 @Test
			public void testLnLookback() {
			 super.testLnLookback();
			}
		 
		 @Test
			public void testLog10Lookback() {
			 super.testLog10Lookback();
			}
		 
		 @Test
			public void testMedPriceLookback() {
			 super.testMedPriceLookback();
			}
		 
		 @Test
			public void testMultLookback() {
			 super.testMultLookback();
			}
		 
		 @Test
			public void testObvLookback() {
			 super.testObvLookback();
			}
		 
		 @Test
			public void testSInLookback() {
			 super.testSInLookback();
			}
		 
		 @Test
			public void testSinhLookback() {
			 super.testSinhLookback();
			}
		 
		 @Test
			public void testSqrtLookback() {
			 super.testSqrtLookback();
			}
		 
		 @Test
			public void testSubLookback() {
			 super.testSubLookback();
			}
		 
		 @Test
			public void testTanLookback() {
			 super.testTanLookback();
			}
		 
		 @Test
			public void testTanhLookback() {
			 super.testTanhLookback();
			}
		 
		 @Test
			public void testTrueRangeLookback() {
			 super.testTrueRangeLookback();
			}
		 
		 @Test
			public void testTypPriceLookback() {
			 super.testTypPriceLookback();
			}
		 
		 @Test
			public void testWclPriceLookback() {
			 super.testWclPriceLookback();
			}
		 
		 @Test
		 public void testTA_INT_SMA()
		    {
			 super.testTA_INT_SMA();
		    }
		 
		 @Test
			public void testGetCompatibility() {
			super.testGetCompatibility();				
						
			}
		 
		
		 @Test
			public void testGetUnstablePeriod() {
			super.testGetUnstablePeriod();
			}
		 
		 @Test
			public void testSetUnstablePeriod() {
			 super.testSetUnstablePeriod();
			}
		 
		 
		 @Test
			public void testSetCompatibility() {
			 super.testSetCompatibility();			
						
			}
}
