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
	@Test
	public void Testema() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 6.148380952380955 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.ema(0, 104, inputsinReal, 105, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testemafloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 5.6 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.ema(0, 104, inputsinReal, 105, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testadd() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };
		double[] inputsinReal1 = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 9.08 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.add(0, lookback, inputsinReal, inputsinReal1,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testaddfloat() {
		float[] inputsinReal = new float[] { 4 };
		float[] inputsinReal1 = new float[] { 4 };

		double[] expecteds = new double[] { 8 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.add(0, lookback, inputsinReal, inputsinReal1,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);
	}

	@Test
	public void Testdiv() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };
		double[] inputsinReal1 = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 1 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.div(0, lookback, inputsinReal, inputsinReal1,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testdivfloat() {
		float[] inputsinReal = new float[] { 4 };
		float[] inputsinReal1 = new float[] { 4 };

		double[] expecteds = new double[] { 1 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.div(0, lookback, inputsinReal, inputsinReal1,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);
	}

	@Test
	public void Testmult() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };
		double[] inputsinReal1 = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 20.6116 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.mult(0, lookback, inputsinReal, inputsinReal1,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testmultfloat() {
		float[] inputsinReal = new float[] { 4 };
		float[] inputsinReal1 = new float[] { 4 };

		double[] expecteds = new double[] { 16 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.mult(0, lookback, inputsinReal, inputsinReal1,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);
	}

	@Test
	public void Testsub() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };
		double[] inputsinReal1 = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.sub(0, lookback, inputsinReal, inputsinReal1,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testsubfloat() {
		float[] inputsinReal = new float[] { 4 };
		float[] inputsinReal1 = new float[] { 4 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.sub(0, lookback, inputsinReal, inputsinReal1,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);
	}

	@Test
	public void Testacos() {
		double[] inputsinReal = new double[] { 1 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.acos(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testacosfloat() {
		float[] inputsinReal = new float[] { 1 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.acos(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testasin() {
		double[] inputsinReal = new double[] { 1 };

		double[] expecteds = new double[] { 1.5707963267948966 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		RetCode rc = core.asin(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testasinfloat() {
		float[] inputsinReal = new float[] { 1 };

		double[] expecteds = new double[] { 1.5707963267948966 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.asin(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testatan() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 1.3539939209838119 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.atan(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testatanfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 1.3258176636680326 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.atan(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testaceil() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 5 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.ceil(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testaceilfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 4 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.ceil(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testcos() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { -0.1715364067221118 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.cos(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testcosfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { -0.6536436208636119 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.cos(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testcosh() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 46.85073676301375 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.cosh(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testcoshfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 27.308232836016487 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.cosh(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testexp() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 93.69080011947398 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.exp(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testexpfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 54.598150033144236 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.exp(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testln() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 1.5129270120532565 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.ln(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testlnfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 1.3862943611198906 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.ln(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testsinh() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 46.84006335646023 };
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.sinh(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testsinhfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 6 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.sinh(0, lookback, inputsinReal, outBegIdx,
				outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 27.28991719712775);

	}

	@Test
	public void Testmacd() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.macd(0, lookback, inputsinReal, lookback, lookback,
				lookback, outBegIdx, outNBElement, outReal, outReal, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testmacdfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 0.0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.macd(0, lookback, inputsinReal, lookback, lookback,
				lookback, outBegIdx, outNBElement, outReal, outReal, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testapo() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.apo(0, lookback, inputsinReal, lookback, lookback,
				null, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testapofloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.apo(0, lookback, inputsinReal, lookback, lookback,
				null, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testppo() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.ppo(0, lookback, inputsinReal, lookback, lookback,
				null, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testppofloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 6 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.ppo(0, lookback, inputsinReal, lookback, lookback,
				null, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 6.0);

	}

	@Test
	public void Testbop() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.bop(0, lookback, inputsinReal, outReal, outReal,
				outReal, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testbopfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.bop(0, lookback, inputsinReal, inputsinReal,
				inputsinReal, inputsinReal, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testvariance() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.variance(0, lookback, inputsinReal, lookback,
				lookback, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void Testvariancefloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.variance(0, lookback, inputsinReal, lookback,
				lookback, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TestavgPrice() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 1.135 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.avgPrice(0, lookback, inputsinReal, outReal, outReal,
				outReal, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TestavgPricefloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 4 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.avgPrice(0, lookback, inputsinReal, inputsinReal,
				inputsinReal, inputsinReal, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TestwclPrice() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 1.135 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.wclPrice(0, lookback, inputsinReal, outReal, outReal,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TestwclPricefloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 4 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.wclPrice(0, lookback, inputsinReal, inputsinReal,
				inputsinReal, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TesttypPrice() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 1.5133333333333334 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.typPrice(0, lookback, inputsinReal, outReal, outReal,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TesttypPricefloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 4 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.typPrice(0, lookback, inputsinReal, inputsinReal,
				inputsinReal, outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TestmedPrice() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 2.27 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.medPrice(0, lookback, inputsinReal, outReal,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TestmedPricefloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 4 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.medPrice(0, lookback, inputsinReal, inputsinReal,
				outBegIdx, outNBElement, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TestmacdFix() {
		double[] inputsinReal = new double[] { 4.54, 1.25, 0.72, 12.69, 2.09,
				4.20, 4.51, 12.93, 10.04, 9.84, 6.89, 12.44, 4.85, 1.35, 1.56,
				0.76, 10.75, 6.65, 3.71, 7.8, 2.02, 7.36, 10.23, 0.15, 2.56,
				10.78, 2.98, 3.45, 4.53, 0.56, 6.54, 2.79, 11.87, 1.27, 12.09,
				7.72, 9.60, 12.78, 7.91, 10.47, 9.07, 3.66, 6.12, 6.94, 2.55,
				5.01, 1.04, 3.83, 6.86, 9.95, 2.58, 11.94, 0.52, 5.64, 7.78,
				5.00, 9.54, 8.96, 3.57, 8.09, 3.25, 8.75, 6.70, 11.49, 7.88,
				0.31, 4.99, 0.80, 3.81, 12.66, 12.78, 10.91, 0.17, 1.41, 3.38,
				11.64, 0.41, 9.51, 0.60, 1.59, 11.00, 0.96, 3.23, 9.77, 10.13,
				2.47, 1.47, 11.16, 9.19, 4.99, 11.94, 10.82, 8.67, 9.23, 12.57,
				5.85, 4.06, 12.20, 5.55, 6.26, 2.69, 4.13, 1.45, 4.97, 1.90 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.macdFix(0, lookback, inputsinReal, lookback,
				outBegIdx, outNBElement, outReal, outReal, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void TestmacdFixfloat() {
		float[] inputsinReal = new float[] { 4, 1, 0, 12, 2, 4, 4, 12, 10, 9,
				6, 12, 4, 1, 1, 0, 10, 6, 3, 7, 2, 7, 10, 0, 2, 10, 2, 3, 4, 0,
				6, 2, 11, 1, 12, 7, 9, 12, 7, 10, 9, 3, 6, 6, 2, 5, 1, 3, 6, 9,
				2, 11, 0, 5, 7, 5, 9, 8, 3, 8, 3, 8, 6, 11, 7, 0, 4, 0, 3, 12,
				12, 10, 0, 1, 3, 11, 0, 9, 0, 1, 11, 0, 3, 9, 10, 2, 1, 11, 9,
				4, 11, 10, 8, 9, 12, 5, 4, 12, 5, 6, 2, 4, 1, 4, 1 };

		double[] expecteds = new double[] { 0 };

		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();

		double[] outReal = new double[1];
		RetCode rc = core.macdFix(0, lookback, inputsinReal, lookback,
				outBegIdx, outNBElement, outReal, outReal, outReal);

		assertArrayEquals(expecteds, outReal, 0);

	}

	@Test
	public void testcdlTakuriLookback() {
		int expected = 10;
		int actual = core.cdlTakuriLookback();
		assertEquals(expected, actual);
	}

	@Test
	public void testultOscLookback() {

		int optInTimePeriod = 10;
		int expecteds = 10;

		int optInTimePeriod1 = Integer.MIN_VALUE;
		int optInTimePeriod2 = 10;
		int optInTimePeriod3 = 10;
		int n = core.ultOscLookback(optInTimePeriod1, optInTimePeriod2,
				optInTimePeriod3);
		assertEquals(expecteds, n);

		// int optInTimePeriod1 = Integer.MIN_VALUE;
		int actual1 = core.ultOscLookback(optInTimePeriod1, optInTimePeriod2,
				optInTimePeriod3);
		assertEquals(10, actual1);

		// int optInTimePeriod2 = 1;
		int actual2 = core.ultOscLookback(optInTimePeriod1, optInTimePeriod2,
				optInTimePeriod3);
		assertEquals(10, actual2);

		// int optInTimePeriod3 = 1;
		int actual3 = core.ultOscLookback(optInTimePeriod1, optInTimePeriod2,
				optInTimePeriod3);
		assertEquals(10, actual3);

	}

	@Test
	public void testcdlEveningStarLookback() {

		int expecteds = 12;
		double optInPenetration = 0;

		int n = core.cdlEveningStarLookback(optInPenetration);
		assertEquals(expecteds, n);
		int actual1 = core.cdlEveningStarLookback(optInPenetration);
		assertEquals(12, actual1);

	}

	@Test
	public void testcdlMatHoldLookback() {

		int expecteds = 14;
		double optInPenetration = 0;

		int n = core.cdlMatHoldLookback(optInPenetration);
		assertEquals(expecteds, n);
		int actual1 = core.cdlMatHoldLookback(optInPenetration);
		assertEquals(14, actual1);
	}

	@Test
	public void testcdlMorningStarLookback() {

		int expecteds = 12;
		double optInPenetration = 0;

		int n = core.cdlMorningStarLookback(optInPenetration);
		assertEquals(expecteds, n);
		int actual1 = core.cdlMorningStarLookback(optInPenetration);
		assertEquals(12, actual1);
	}

	@Test
	public void testt3Lookback() {

		int expecteds = -1;

		int optInTimePeriod = 0;
		double optInVFactor = 0;
		int n = core.t3Lookback(optInTimePeriod, optInVFactor);
		assertEquals(expecteds, n);

		int actual1 = core.t3Lookback(optInTimePeriod, optInVFactor);
		assertEquals(-1, actual1);

		int actual2 = core.t3Lookback(optInTimePeriod, optInVFactor);
		assertEquals(-1, actual2);
	}

	@Test
	public void testmamaLookback() {

		int expecteds = -1;

		double optInSlowLimit = 0;
		double optInFastLimit = 0;
		int n = core.mamaLookback(optInFastLimit, optInSlowLimit);
		assertEquals(expecteds, n);

		int actual1 = core.mamaLookback(optInFastLimit, optInSlowLimit);
		assertEquals(-1, actual1);

		int actual2 = core.mamaLookback(optInFastLimit, optInSlowLimit);
		assertEquals(-1, actual2);
	}

	@Test
	public void testmacdLookback() {

		int expecteds = -1;

		int optInSignalPeriod = 0;
		int optInFastPeriod = 0;
		int optInSlowPeriod = 0;
		int n = core.macdLookback(optInFastPeriod, optInSlowPeriod,
				optInSignalPeriod);
		assertEquals(expecteds, n);

		int actual1 = core.macdLookback(optInFastPeriod, optInSlowPeriod,
				optInSignalPeriod);
		assertEquals(-1, actual1);

		int actual2 = core.macdLookback(optInFastPeriod, optInSlowPeriod,
				optInSignalPeriod);
		assertEquals(-1, actual2);

		int actual3 = core.macdLookback(optInFastPeriod, optInSlowPeriod,
				optInSignalPeriod);
		assertEquals(-1, actual3);
	}

	@Test
	public void teststochFLookback() {

		int expecteds = -1;

		MAType optInFastD_MAType = null;
		int optInFastK_Period = 0;
		int optInFastD_Period = 0;
		int n = core.stochFLookback(optInFastK_Period, optInFastD_Period,
				optInFastD_MAType);
		assertEquals(expecteds, n);

		int actual1 = core.stochFLookback(optInFastK_Period, optInFastD_Period,
				optInFastD_MAType);
		assertEquals(-1, actual1);

		int actual2 = core.stochFLookback(optInFastK_Period, optInFastD_Period,
				optInFastD_MAType);
		assertEquals(-1, actual2);
	}

	@Test
	public void testadOscLookback() {

		int expecteds = -1;

		int optInSlowPeriod = 0;
		int optInFastPeriod = 0;
		int n = core.adOscLookback(optInFastPeriod, optInSlowPeriod);
		assertEquals(expecteds, n);

		int actual1 = core.adOscLookback(optInFastPeriod, optInSlowPeriod);
		assertEquals(-1, actual1);

		int actual2 = core.adOscLookback(optInFastPeriod, optInSlowPeriod);
		assertEquals(-1, actual2);
	}

	@Test
	public void testapoLookback() {

		int expecteds = -1;

		int optInFastPeriod = 0;
		int optInSlowPeriod = 0;
		MAType optInMAType = null;
		int n = core.apoLookback(optInFastPeriod, optInSlowPeriod, optInMAType);
		assertEquals(expecteds, n);

		int actual1 = core.apoLookback(optInFastPeriod, optInSlowPeriod,
				optInMAType);
		assertEquals(-1, actual1);

		int actual2 = core.apoLookback(optInFastPeriod, optInSlowPeriod,
				optInMAType);
		assertEquals(-1, actual2);

		int actual3 = core.apoLookback(optInFastPeriod, optInSlowPeriod,
				optInMAType);
		assertEquals(-1, actual3);
	}

	@Test
	public void testppoLookback() {

		int expecteds = -1;

		int optInFastPeriod = 0;
		int optInSlowPeriod = 0;
		MAType optInMAType = null;
		int n = core.ppoLookback(optInFastPeriod, optInSlowPeriod, optInMAType);
		assertEquals(expecteds, n);

		int actual1 = core.ppoLookback(optInFastPeriod, optInSlowPeriod,
				optInMAType);
		assertEquals(-1, actual1);

		int actual2 = core.ppoLookback(optInFastPeriod, optInSlowPeriod,
				optInMAType);
		assertEquals(-1, actual2);

		int actual3 = core.ppoLookback(optInFastPeriod, optInSlowPeriod,
				optInMAType);
		assertEquals(-1, actual3);
	}

	@Test
	public void testbbandsLookback() {

		int expecteds = -1;

		MAType optInMAType = null;
		int optInTimePeriod = 0;
		double optInNbDevDn = 0;
		double optInNbDevUp = 0;
		int n = core.bbandsLookback(optInTimePeriod, optInNbDevUp,
				optInNbDevDn, optInMAType);
		assertEquals(expecteds, n);

		int actual1 = core.bbandsLookback(optInTimePeriod, optInNbDevUp,
				optInNbDevDn, optInMAType);
		assertEquals(-1, actual1);

		int actual2 = core.bbandsLookback(optInTimePeriod, optInNbDevUp,
				optInNbDevDn, optInMAType);
		assertEquals(-1, actual2);

		int actual3 = core.bbandsLookback(optInTimePeriod, optInNbDevUp,
				optInNbDevDn, optInMAType);
		assertEquals(-1, actual3);

		int actual4 = core.bbandsLookback(optInTimePeriod, optInNbDevUp,
				optInNbDevDn, optInMAType);
		assertEquals(-1, actual4);
	}

	@Test
	public void teststochRsiLookback() {

		int expecteds = -1;

		MAType optInFastD_MAType = null;
		int optInTimePeriod = 0;
		int optInFastD_Period = 0;
		int optInFastK_Period = 0;
		int n = core.stochRsiLookback(optInTimePeriod, optInFastK_Period,
				optInFastD_Period, optInFastD_MAType);
		assertEquals(expecteds, n);

		int actual1 = core.stochRsiLookback(optInTimePeriod, optInFastK_Period,
				optInFastD_Period, optInFastD_MAType);
		assertEquals(-1, actual1);

		int actual2 = core.stochRsiLookback(optInTimePeriod, optInFastK_Period,
				optInFastD_Period, optInFastD_MAType);
		assertEquals(-1, actual2);

		int actual3 = core.stochRsiLookback(optInTimePeriod, optInFastK_Period,
				optInFastD_Period, optInFastD_MAType);
		assertEquals(-1, actual3);

		int actual4 = core.stochRsiLookback(optInTimePeriod, optInFastK_Period,
				optInFastD_Period, optInFastD_MAType);
		assertEquals(-1, actual4);
	}

	@Test
	public void teststochLookback() {

		int expecteds = -1;

		MAType optInSlowD_MAType = null;
		int optInSlowK_Period = 0;
		int optInFastK_Period = 0;
		MAType optInSlowK_MAType = null;
		int optInSlowD_Period = 0;
		int n = core.stochLookback(optInFastK_Period, optInSlowK_Period,
				optInSlowK_MAType, optInSlowD_Period, optInSlowD_MAType);
		assertEquals(expecteds, n);

		int actual1 = core.stochLookback(optInFastK_Period, optInSlowK_Period,
				optInSlowK_MAType, optInSlowD_Period, optInSlowD_MAType);
		assertEquals(-1, actual1);

		int actual2 = core.stochLookback(optInFastK_Period, optInSlowK_Period,
				optInSlowK_MAType, optInSlowD_Period, optInSlowD_MAType);
		assertEquals(-1, actual2);

		int actual3 = core.stochLookback(optInFastK_Period, optInSlowK_Period,
				optInSlowK_MAType, optInSlowD_Period, optInSlowD_MAType);
		assertEquals(-1, actual3);

		int actual4 = core.stochLookback(optInFastK_Period, optInSlowK_Period,
				optInSlowK_MAType, optInSlowD_Period, optInSlowD_MAType);
		assertEquals(-1, actual4);

		int actual5 = core.stochLookback(optInFastK_Period, optInSlowK_Period,
				optInSlowK_MAType, optInSlowD_Period, optInSlowD_MAType);
		assertEquals(-1, actual5);
	}
}
