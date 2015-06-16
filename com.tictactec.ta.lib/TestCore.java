package strawinska.magda;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.Compatibility;
import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.FuncUnstId;
import com.tictactec.ta.lib.MAType;
import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.RetCode;
import com.tictactec.ta.lib.meta.CoreMetaData;

public class TestCore{

	static protected Core core;
	static protected FuncUnstId funcunstld;
	static protected Compatibility compatibility;
	
	protected RetCode retCode;
	protected Core lib;
	protected int lookback;
	protected double input[];
	protected double output[];
	protected MInteger outNbElement;

	
	@BeforeClass
	public static void beforeClass() {
		core = new Core();
	}
	
	@Test
	public void testSMA() {

			double[] inputsinReal= new double[]  {
					4.54,	1.25,	0.72,	12.69,	2.09,	4.20,	4.51,
					12.93,	10.04,	9.84,	6.89,	12.44,	4.85,	1.35,
					1.56,	0.76,	10.75,	6.65,	3.71,	7.8,	2.02,
					7.36,	10.23,	0.15,	2.56,	10.78,  2.98,	3.45,
					4.53,	0.56,	6.54,	2.79,	11.87,	1.27,	12.09,
					7.72,	9.60,	12.78,	7.91,	10.47,	9.07,	3.66,
					6.12,	6.94,	2.55,	5.01,	1.04,	3.83,	6.86,
					9.95,	2.58,	11.94,	0.52,	5.64,	7.78,	5.00,
					9.54,	8.96,	3.57,	8.09,	3.25,	8.75,	6.70,
					11.49,	7.88,	0.31,	4.99,	0.80,	3.81,	12.66,
					12.78,	10.91,	0.17,	1.41,	3.38,	11.64,	0.41,
					9.51,	0.60,	1.59,	11.00,	0.96,   3.23,	9.77,
					10.13,	2.47,	1.47,	11.16,	9.19,	4.99,	11.94,
					10.82,	8.67,	9.23,	12.57,	5.85,	4.06,	12.20,
					5.55,	6.26,	2.69,	4.13,	1.45,	4.97,	1.90
			};
			
			double[] expecteds = new double[] { 6.148380952380955 };
			
			MInteger outBegIdx = new MInteger();
			MInteger outNBElement = new MInteger();
			
			double[] outReal = new double[1];
			
		RetCode rc = core.sma(0, 104, inputsinReal, 105, outBegIdx, outNBElement, outReal);
		core.toString().valueOf(0);
		core.toString().valueOf(lookback);
		
		assertArrayEquals(expecteds, outReal, 0);
				
	}
	

	@Test
	public void testSMA3() {

			double[] inputsinReal= new double[]  {
					4.54
			};
			
			double[] expecteds = new double[] { 4.54 };
			
			MInteger outBegIdx = new MInteger();
			MInteger outNBElement = new MInteger();
			
			double[] outReal = new double[1];
			
		int rr = core.smaLookback(1);	
		assertArrayEquals(expecteds, inputsinReal, 0);
				
	}
	
	 @Test
		public void testCdlHikkakeLookback() {
			int expecteds = 5;
			int actual = core.cdlHikkakeLookback();
			assertEquals(expecteds, actual);
		}
		 
		@Test
		public void testSmaLookback() {
			int optInTimePeriod = 10;
			int expecteds = 9;
			int n = core.smaLookback(optInTimePeriod);
			assertEquals(expecteds, n);
			int optInTimePeriod1 = Integer.MIN_VALUE;
			int actual1 = core.smaLookback(optInTimePeriod1);
			assertEquals(29, actual1);
			int optInTimePeriod2 = 1;
			int actual2 = core.smaLookback(optInTimePeriod2);
			assertEquals(-1, actual2);
		}
	
		 @Test
			public void testAcosLookback() {
				int expecteds = 0;
				int actual = core.acosLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testAddLookback() {
				int expecteds = 0;
				int actual = core.addLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testAdLookback() {
				int expecteds = 0;
				int actual = core.adLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testMinMaxLookback() {
				int expecteds = -1;
				int actual = core.minMaxLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testMinMaxIndexLookback() {
				int expecteds = -1;
				int actual = core.minMaxIndexLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testSumLookback() {
				int expecteds = -1;
				int actual = core.sumLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testTrimaLookback() {
				int expecteds = -1;
				int actual = core.trimaLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testTsfLookback() {
				int expecteds = -1;
				int actual = core.tsfLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testWillLookback() {
				int expecteds = -1;
				int actual = core.willRLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testWmaLookback() {
				int expecteds = -1;
				int actual = core.wmaLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testAroonLookback() {
				int expecteds = -1;
				int actual = core.aroonLookback(expecteds);
				assertEquals(expecteds, actual);
				RetCode.BadParam.equals(core.minMaxLookback(expecteds));
				core.equals(core.toString().valueOf(retCode));
				
			}
	
		 @Test
			public void testAroonOscLookback() {
				int expecteds = -1;
				int actual = core.aroonOscLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testBetaLookback() {
				int expecteds = -1;
				int actual = core.betaLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 @Test
			public void testRocLookback() {
				int expecteds = -1;
				int actual = core.rocLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testRocPLookback() {
				int expecteds = -1;
				int actual = core.rocPLookback(expecteds);
				assertEquals(expecteds, actual);
				
				
			}
		 
		 @Test
			public void testRocRLookback() {
				int expecteds = -1;
				int actual = core.rocRLookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testRocR100Lookback() {
				int expecteds = -1;
				int actual = core.rocR100Lookback(expecteds);
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdl12Lookback() {
				int expecteds = 12;
				int actual = core.cdl2CrowsLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdl3BlackCrowsLookback() {
				int expecteds = 13;
				int actual = core.cdl3BlackCrowsLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdl3LineStrikeLookback() {
				int expecteds = 8;
				int actual = core.cdl3LineStrikeLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlBreakwayLookback() {
				int expecteds = 14;
				int actual = core.cdlBreakawayLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlConcealBabyWallLookback() {
				int expecteds = 13;
				int actual = core.cdlConcealBabysWallLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlLadderBottomLookback() {
				int expecteds = 14;
				int actual = core.cdlLadderBottomLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlMatchingLowLookback() {
				int expecteds = 6;
				int actual = core.cdlMatchingLowLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlPiercingLookback() {
				int expecteds = 11;
				int actual = core.cdlPiercingLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlStickSandwichLookback() {
				int expecteds = 7;
				int actual = core.cdlStickSandwhichLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlTasukiGapLookback() {
				int expecteds = 7;
				int actual = core.cdlTasukiGapLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlTristarLookback() {
				int expecteds = 12;
				int actual = core.cdlTristarLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testHtDcPeriodLookback() {
				int expecteds = 32;
				int actual = core.htDcPeriodLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testHtDcPhaseLookback() {
				int expecteds = 63;
				int actual = core.htDcPhaseLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testHtPhasorLookback() {
				int expecteds = 32;
				int actual = core.htPhasorLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testHtSineLookback() {
				int expecteds = 63;
				int actual = core.htSineLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testHtTrendlineLookback() {
				int expecteds = 63;
				int actual = core.htTrendlineLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testHtTrendmodeLookback() {
				int expecteds = 63;
				int actual = core.htTrendModeLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlDojiLookback() {
				int expecteds = 10;
				int actual = core.cdlDojiLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testAcosLookback1() {
				int expecteds = 0;
				int actual = core.acosLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testAdLookback1() {
				int expecteds = 0;
				int actual = core.addLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testAddLookback1() {
				int expecteds = 0;
				int actual = core.addLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testAsinLookback() {
				int expecteds = 0;
				int actual = core.asinLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testAvgPriceLookback() {
				int expecteds = 0;
				int actual = core.avgPriceLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testBopLookback() {
				int expecteds = 0;
				int actual = core.bopLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdl3OutsideLookback() {
				int expecteds = 3;
				int actual = core.cdl3OutsideLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlEngulfingLookback() {
				int expecteds = 2;
				int actual = core.cdlEngulfingLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCdlXSideGap3MethodsLookback() {
				int expecteds = 2;
				int actual = core.cdlXSideGap3MethodsLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCeilLookback() {
				int expecteds = 0;
				int actual = core.ceilLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCosLookback() {
				int expecteds = 0;
				int actual = core.cosLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testCoshLookback() {
				int expecteds = 0;
				int actual = core.coshLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testDivLookback() {
				int expecteds = 0;
				int actual = core.divLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testExpLookback() {
				int expecteds = 0;
				int actual = core.expLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testFloorLookback() {
				int expecteds = 0;
				int actual = core.floorLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testLnLookback() {
				int expecteds = 0;
				int actual = core.lnLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testLog10Lookback() {
				int expecteds = 0;
				int actual = core.log10Lookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testMedPriceLookback() {
				int expecteds = 0;
				int actual = core.medPriceLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testMultLookback() {
				int expecteds = 0;
				int actual = core.multLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testObvLookback() {
				int expecteds = 0;
				int actual = core.obvLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testSInLookback() {
				int expecteds = 0;
				int actual = core.sinLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testSinhLookback() {
				int expecteds = 0;
				int actual = core.sinhLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testSqrtLookback() {
				int expecteds = 0;
				int actual = core.sqrtLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testSubLookback() {
				int expecteds = 0;
				int actual = core.subLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testTanLookback() {
				int expecteds = 0;
				int actual = core.tanLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testTanhLookback() {
				int expecteds = 0;
				int actual = core.tanhLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testTrueRangeLookback() {
				int expecteds = 1;
				int actual = core.trueRangeLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testTypPriceLookback() {
				int expecteds = 0;
				int actual = core.typPriceLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
			public void testWclPriceLookback() {
				int expecteds = 0;
				int actual = core.wclPriceLookback();
				assertEquals(expecteds, actual);
			}
		 
		 @Test
		 public void testTA_INT_SMA()
		    {
			 double[] inputsinReal= new double[]  {
						1,
				};
				
				double[] expecteds = new double[] { 1.0 };
				
				MInteger outBegIdx = new MInteger();
				MInteger outNBElement = new MInteger();
				
				double[] outReal = new double[] {1.0};
				
				
				
			RetCode ra = core.TA_INT_EMA(0, 0, inputsinReal, 2, lookback, outBegIdx, outNBElement, inputsinReal);
			core.TA_INT_EMA(0, 0, inputsinReal, 0, lookback, outBegIdx, outNBElement, outReal);
			assertArrayEquals(expecteds, inputsinReal, lookback);
			core.TA_INT_EMA(0, 0, inputsinReal, lookback, lookback, outNBElement, outNBElement, inputsinReal);
			
			
			assertArrayEquals(expecteds, outReal, 1);
		    }
		 
		 @Test
			public void testGetCompatibility() {
			Compatibility aa = core.getCompatibility();				
						
			}
		 
		
		 
		
		 @Test
			public void testGetUnstablePeriod() {
			 
			funcunstld = FuncUnstId.Adxr;
			int aa = core.GetUnstablePeriod(funcunstld);

			 
			}
		 
		 @Test
			public void testSetUnstablePeriod() {
			 
			RetCode aa = core.SetUnstablePeriod(funcunstld,0);
			int rc = core.GetUnstablePeriod(funcunstld.Adx);
			
			 
			}
		 
		 
		 @Test
			public void testSetCompatibility() {
			core.SetCompatibility(compatibility);			
						
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

		
		int actual1 = core.ultOscLookback(optInTimePeriod1, optInTimePeriod2,
				optInTimePeriod3);
		assertEquals(10, actual1);

		
		int actual2 = core.ultOscLookback(optInTimePeriod1, optInTimePeriod2,
				optInTimePeriod3);
		assertEquals(10, actual2);

		
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
