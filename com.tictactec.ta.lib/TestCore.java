package AndrzejMatysiak;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.Compatibility;
import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.FuncUnstId;
import com.tictactec.ta.lib.MAType;
import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.RetCode;

public class TestCore {
	
	static Core core;
	protected int lookback;
	
	@BeforeClass
	public static void BeforeClass(){
		core = new Core();
	}
	
	@Test
	public void testFloor1() {

			double[] inputsinReal= new double[]  {
					4.54,
			};
			double[] expecteds = new double[] { 4.54 };
			MInteger outBegIdx = new MInteger();
			MInteger outNBElement = new MInteger();
			double[] outReal = new double[1];
			RetCode rc = core.floor(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);
	}
	
	@Test
	public void testFloor2() {

		float[] inputsinReal= new float[]  {
				4
		};
		double[] expecteds = new double[] { 4 };
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
			
		RetCode rc = core.floor(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);	
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testLog10D(){
		double[] inputsinReal = new double[]  {
				4.54
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 0.6570558528571039 };
		
		RetCode rc = core.log10(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testLog10F(){
		
		float[] inputsinReal = new float[]  {
				4
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 0.6020599913279624 };
		
		RetCode rc = core.log10(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testSarLookback(){
		int expecteds = 1;
		double optInAcceleration = 10;
		double optInMaximum = 100;
		
		int actual = core.sarLookback(optInAcceleration, optInMaximum);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testSin1(){
		double[] inputsinReal = new double[]  {
				0.9962
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 0.8394117655736391 };
		
		RetCode rc = core.sin(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testSin2(){
		float[] inputsinReal = new float[]  {
				1
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 0.8414709848078965 };
		
		RetCode rc = core.sin(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testSinH1(){
		double[] inputsinReal = new double[]  {
				1,22
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 1.1752011936438014 };
		
		RetCode rc = core.sinh(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testSinH2(){
		float[] inputsinReal = new float[]  {
				1
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 0.8414709848078965 };
		
		RetCode rc = core.sin(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testSqrt1(){
		double[] inputsinReal = new double[]  {
				5,66
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 2.23606797749979 };
		
		RetCode rc = core.sqrt(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testSqrt2(){
		float[] inputsinReal = new float[]  {
				4
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 2.0 };
		
		RetCode rc = core.sqrt(0, lookback, inputsinReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testStdDevLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		double optInNbDev = 100;
		int actual = core.stdDevLookback(optInTimePeriod, optInNbDev);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testTan1(){
		double[] inReal = new double[]  {
				4.43
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 3.446580763443108 };
		RetCode rc = core.tan(0, lookback, inReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testTan2(){
		float[] inReal = new float[]  {
				4
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 1.1578212823495777 };
		RetCode rc = core.tan(0, lookback, inReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testTanH1(){
		double[] inReal = new double[]  {
				4.43
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 0.9997161301684341 };
		RetCode rc = core.tanh(0, lookback, inReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testTanH2(){
		float[] inReal = new float[]  {
				4
		};
		MInteger outBegIdx = new MInteger();
		MInteger outNBElement = new MInteger();
		double[] outReal = new double[1];
		double[] expecteds = new double[] { 0.999329299739067 };
		RetCode rc = core.tanh(0, lookback, inReal, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testSMA1() {
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
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testSMA2() {
			float[] inputsinReal= new float[]  {
					4,	1,	0,	12,	2,	4,	4,
					12,	10,	9,	6,	12,	4,	1,
					1,	0,	10,	6,	3,	7,	2,
					7,	10,	0,	2,	10, 2,	3,
					4,	0,	6,	2,	11,	1,	12,
					7,	9,	12,	7,	10,	9,	3,
					6,	6,	2,	5,	1,	3,	6,
					9,	2,	11,	0,	5,	7,	5,
					9,	8,	3,	8,	3,	8,	6,
					11,	7,	0,	4,	0,	3,	12,
					12,	10,	0,	1,	3,	11,	0,
					9,	0,	1,	11,	0,  3,	9,
					10,	2,	1,	11,	9,	4,	11,
					10,	8,	9,	12,	5,	4,	12,
					5,	6,	2,	4,	1,	4,	1
			};
			double[] expecteds = new double[] { 5.6 };
			MInteger outBegIdx = new MInteger();
			MInteger outNBElement = new MInteger();
			double[] outReal = new double[1];
			
		RetCode rc = core.sma(0, 104, inputsinReal, 105, outBegIdx, outNBElement, outReal);
		assertArrayEquals(expecteds, outReal, 0);
	}
	
	@Test
	public void testVarianceLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		double optInNbDev = 100;
		int actual = core.varianceLookback(optInTimePeriod, optInNbDev);
		assertEquals(expecteds, actual);
	}
	
	 @Test
	   public void testMovingAverageVariablePeriodLookback(){
	    int expecteds = 4;
	    int optInMaxPeriod = 100;
	    int optInMinPeriod = 5;
	    MAType optInMAType = null;
	    int actual = core.movingAverageLookback(lookback, optInMAType);
	    
	   }
	
	@Test
	public void testCdl3InsideLookback(){
		int expecteds = 12;
		int actual = core.cdl3InsideLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlCounterAttackLookback(){
		int expecteds = 11;
		int actual = core.cdlCounterAttackLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlDojiStarLookback(){
		int expecteds = 11;
		int actual = core.cdlDojiStarLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlGapSideSideWhiteLookback(){
		int expecteds = 7;
		int actual = core.cdlGapSideSideWhiteLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlHaramiLookback(){
		int expecteds = 11;
		int actual = core.cdlHaramiLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlHaramiCrossLookback(){
		int expecteds = 11;
		int actual = core.cdlHaramiCrossLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlHomingPigeonLookback(){
		int expecteds = 11;
		int actual = core.cdlHomingPigeonLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlIdentical3CrowsLookback(){
		int expecteds = 12;
		int actual = core.cdlIdentical3CrowsLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlInNeckLookback(){
		int expecteds = 11;
		int actual = core.cdlInNeckLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlKickingLookback(){
		int expecteds = 11;
		int actual = core.cdlKickingLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlKickingByLengthLookback(){
		int expecteds = 11;
		int actual = core.cdlKickingByLengthLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlOnNeckLookback(){
		int expecteds = 11;
		int actual = core.cdlOnNeckLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlRiseFall3MethodsLookback(){
		int expecteds = 14;
		int actual = core.cdlRiseFall3MethodsLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlThrustingLookback(){
		int expecteds = 11;
		int actual = core.cdlThrustingLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlUnique3RiverLookback(){
		int expecteds = 12;
		int actual = core.cdlUnique3RiverLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlUpsideGap2CrowsLookback(){
		int expecteds = 12;
		int actual = core.cdlUpsideGap2CrowsLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCmoLookback(){
		int expecteds = 10;
		int optInTimePeriod = 10;
		int actual = core.cmoLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMinusDMLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.minusDMLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testPlusDMLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.plusDMLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testRsiLookback(){
		int expecteds = 10;
		int optInTimePeriod = 10;
		int actual = core.rsiLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testAdxrLookback(){
		int expecteds = 28;
		int optInTimePeriod = 10;
		int actual = core.adxrLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlBeltHoldLookback(){
		int expecteds = 10;
		int actual = core.cdlBeltHoldLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlDragonflyDojiLookback(){
		int expecteds = 10;
		int actual = core.cdlDragonflyDojiLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlHignWaveLookback(){
		int expecteds = 10;
		int actual = core.cdlHignWaveLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlLongLeggedDojiLookback(){
		int expecteds = 10;
		int actual = core.cdlLongLeggedDojiLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlLongLineLookback(){
		int expecteds = 10;
		int actual = core.cdlLongLineLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlMarubozuLookback(){
		int expecteds = 10;
		int actual = core.cdlMarubozuLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlShortLineLookback(){
		int expecteds = 10;
		int actual = core.cdlShortLineLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testDxLookback(){
		int expecteds = 10;
		int optInTimePeriod = 10;
		int actual = core.dxLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMinusDILookback(){
		int expecteds = 10;
		int optInTimePeriod = 10;
		int actual = core.minusDILookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testPlusDILookback(){
		int expecteds = 10;
		int optInTimePeriod = 10;
		int actual = core.plusDILookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testAdxLookback(){
		int expecteds = 19;
		int optInTimePeriod = 10;
		int actual = core.adxLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlDarkCloudCoverLookback(){
		int expecteds = 11;
		int optInPenetration = 10;
		int actual = core.cdlDarkCloudCoverLookback(optInPenetration);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testTrixLookback(){
		int expecteds = 28;
		int optInTimePeriod = 10;
		int actual = core.trixLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testEmaLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.emaLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testAtrLookback(){
		int expecteds = 10;
		int optInTimePeriod = 10;
		int actual = core.atrLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testKamaLookback(){
		int expecteds = 10;
		int optInTimePeriod = 10;
		int actual = core.kamaLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMacdFixLookback(){
		int expecteds = 34;
		int optInSignalPeriod = 10;
		int actual = core.macdFixLookback(optInSignalPeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMfiLookback(){
		int expecteds = 10;
		int optInTimePeriod = 10;
		int actual = core.mfiLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
  
	@Test
	public void testNatrLookback(){
		int expecteds = 10;
		int optInTimePeriod = 10;
		int actual = core.natrLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testTemaLookback(){
		int expecteds = 27;
		int optInTimePeriod = 10;
		int actual = core.temaLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testDemaLookback(){
		int expecteds = 18;
		int optInTimePeriod = 10;
		int actual = core.demaLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCdlHikkakeModLookback(){
		int expecteds = 10;
		int actual = core.cdlHikkakeModLookback();
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCciLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.cciLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testCorrelLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.correlLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testLinearRegLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.linearRegLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testLinearRegAngleLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.linearRegAngleLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testLinearRegInterceptLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.linearRegInterceptLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testLinearRegSlopeLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.linearRegSlopeLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMaxLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.maxLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMaxIndexLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.maxIndexLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMidPointLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.midPointLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMidPriceLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.midPriceLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMinLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.minLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}
	
	@Test
	public void testMinIndexLookback(){
		int expecteds = 9;
		int optInTimePeriod = 10;
		int actual = core.minIndexLookback(optInTimePeriod);
		assertEquals(expecteds, actual);
	}	

}