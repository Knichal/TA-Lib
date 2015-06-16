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

				CoreAnnotated cd = new CoreAnnotated();
				cd.sma(lookback, lookback, input, lookback, outNbElement, outNbElement, input);
				}
	
		@Test
		public void testSMA3() {
			CoreAnnotated cd = new CoreAnnotated();
			cd.sma(lookback, lookback, output, lookback, outNbElement, outNbElement, input);	
		}

		@Test
		public void testCdlHikkakeLookback() {
			CoreAnnotated cd = new CoreAnnotated();
			cd.cdlHikkakeLookback();
		}
		 
		@Test
		public void testSmaLookback() {
			CoreAnnotated cd = new CoreAnnotated();
			cd.smaLookback(lookback);
		}
	
		 @Test
			public void testAcosLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
				cd.acosLookback();
			}
		 
		 @Test
			public void testAddLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.addLookback();
			}
		
		 @Test
		 public void TestAdLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
				     cd.adLookback(); }
		 
		 @Test
			public void testMinMaxLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.minMaxLookback(lookback);
			}
		 
		 @Test
			public void testMinMaxIndexLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.minMaxIndexLookback(lookback);
			}
		 
		 @Test
			public void testSumLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.sumLookback(lookback);
			}
		 
		 @Test
			public void testTrimaLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.trimaLookback(lookback);
			}
		 
		 @Test
			public void testTsfLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.tsfLookback(lookback);
			}
		 
		 @Test
			public void testWillLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.willRLookback(lookback);
			}
		 
		 @Test
			public void testWmaLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.wmaLookback(lookback);
			}
		 
		 @Test
			public void testAroonLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.aroonLookback(lookback);
			}
	
		 @Test
			public void testAroonOscLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.aroonOscLookback(lookback);
			}
		 
		 @Test
			public void testBetaLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.betaLookback(lookback);
			}
		 
		 @Test
			public void testRocLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.rocLookback(lookback);
			}
		 
		 @Test
			public void testRocPLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.rocPLookback(lookback);
			}
		 
		 @Test
			public void testRocRLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.rocRLookback(lookback);
			}
		 
		 @Test
			public void testRocR100Lookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.rocR100Lookback(lookback);
			}
		 
		 @Test
			public void testCdl12Lookback() {
			 
			}
		 
		 @Test
			public void testCdl3BlackCrowsLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdl2CrowsLookback();
			}
		 
		 @Test
			public void testCdl3LineStrikeLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdl3LineStrikeLookback();
			}
		 
		 @Test
			public void testCdlBreakwayLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlBreakawayLookback();
			}
		 
		 @Test
			public void testCdlConcealBabyWallLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlConcealBabysWallLookback();
			}
		 
		 @Test
			public void testCdlLadderBottomLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlLadderBottomLookback();
			}
		 
		 @Test
			public void testCdlMatchingLowLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlMatchingLowLookback();
			}
		 
		 @Test
			public void testCdlPiercingLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlPiercingLookback();
			}
		 
		 @Test
			public void testCdlStickSandwichLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlStickSandwhichLookback();
			}
		 
		 @Test
			public void testCdlTasukiGapLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlTasukiGapLookback();
			}
		 
		 @Test
			public void testCdlTristarLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlTristarLookback();
			}
		 
		 @Test
			public void testHtDcPeriodLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.htDcPeriodLookback();
			}
		 
		 @Test
			public void testHtDcPhaseLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.htDcPhaseLookback();
			}
		 
		 @Test
			public void testHtPhasorLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.htPhasorLookback();
			}
		 
		 @Test
			public void testHtSineLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.htSineLookback();
			}
		 
		 @Test
			public void testHtTrendlineLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.htTrendlineLookback();
			}
		 
		 @Test
			public void testHtTrendmodeLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.htTrendModeLookback();
			}
		 
		 @Test
			public void testCdlDojiLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlDojiLookback();
			}
		 
		 @Test
			public void testAsinLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.asinLookback();
			}
		 
		 @Test
			public void testAvgPriceLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.avgPriceLookback();
			}
		 
		 @Test
			public void testBopLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.bopLookback();
			}
		 
		 @Test
			public void testCdl3OutsideLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdl3OutsideLookback();
			}
		 
		 @Test
			public void testCdlEngulfingLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlEngulfingLookback();
			}
		 
		 @Test
			public void testCdlXSideGap3MethodsLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cdlXSideGap3MethodsLookback();
			}
		 
		 @Test
			public void testCeilLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.ceilLookback();
			}
		 
		 @Test
			public void testCosLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.cosLookback();
			}
		 
		 @Test
			public void testCoshLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.coshLookback();
			}
		 
		 @Test
			public void testDivLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.divLookback();
			}
		 
		 @Test
			public void testExpLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.expLookback();
			}
		 
		 @Test
			public void testFloorLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.floorLookback();
			}
		 
		 @Test
			public void testLnLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.lnLookback();
			}
		 
		 @Test
			public void testLog10Lookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.log10Lookback();
			}
		 
		 @Test
			public void testMedPriceLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.medPriceLookback();
			}
		 
		 @Test
			public void testMultLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.multLookback();
			}
		 
		 @Test
			public void testObvLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.obvLookback();
			}
		 
		 @Test
			public void testSInLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.sinLookback();
			}
		 
		 @Test
			public void testSinhLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.sinhLookback();
			}
		 
		 @Test
			public void testSqrtLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.sqrtLookback();
			}
		 
		 @Test
			public void testSubLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.subLookback();
			}
		 
		 @Test
			public void testTanLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.tanLookback();
			}
		 
		 @Test
			public void testTanhLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.tanhLookback();
			}
		 
		 @Test
			public void testTrueRangeLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.trueRangeLookback();
			}
		 
		 @Test
			public void testTypPriceLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.typPriceLookback();
			}
		 
		 @Test
			public void testWclPriceLookback() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.wclPriceLookback();
			}
		 
		 
		 @Test
			public void testGetCompatibility() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.getCompatibility();		
						
		 }
		 
		 @Test
			public void testTA_INT_SMA() {
			 
			 double[] optInk_1 = new double[] { 1.0 };
				
				MInteger outBegIdx = new MInteger();
				MInteger outNBElement = new MInteger();
				double[] inReal = new double[] {2};
				double[] outReal = new double[] {1.0};
				double[] optInTimePeriod= new double[]  {1};
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.TA_INT_EMA(0, 0, inReal, 0, lookback, outBegIdx, outNBElement, outReal);
						
			}
	

		 
		 
		 @Test
			public void testSetCompatibility() {
			 CoreAnnotated cd = new CoreAnnotated();
			 cd.SetCompatibility(compatibility);			
						
			}
}
