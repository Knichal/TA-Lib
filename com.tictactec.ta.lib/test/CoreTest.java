package com.tictactec.ta.lib.test;

import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.MAType;
import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.RetCode;
import java.util.Arrays;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CoreTest
  extends TestCase
{
  private double[] input;
  private int[] inputInt;
  private double[] output;
  private int[] outputInt;
  private MInteger outBegIdx;
  private MInteger outNbElement;
  private RetCode retCode;
  private Core lib;
  private int lookback;
  public static double[] close = { 91.5D, 94.815D, 94.375D, 95.095D, 93.78D, 94.625D, 92.53D, 92.75D, 90.315D, 92.47D, 96.125D, 
    97.25D, 98.5D, 89.875D, 91.0D, 92.815D, 89.155D, 89.345D, 91.625D, 89.875D, 88.375D, 
    87.625D, 84.78D, 83.0D, 83.5D, 81.375D, 84.44D, 89.25D, 86.375D, 86.25D, 85.25D, 
    87.125D, 85.815D, 88.97D, 88.47D, 86.875D, 86.815D, 84.875D, 84.19D, 83.875D, 83.375D, 
    85.5D, 89.19D, 89.44D, 91.095D, 90.75D, 91.44D, 89.0D, 91.0D, 90.5D, 89.03D, 
    88.815D, 84.28D, 83.5D, 82.69D, 84.75D, 85.655D, 86.19D, 88.94D, 89.28D, 88.625D, 
    88.5D, 91.97D, 91.5D, 93.25D, 93.5D, 93.155D, 91.72D, 90.0D, 89.69D, 88.875D, 
    85.19D, 83.375D, 84.875D, 85.94D, 97.25D, 99.875D, 104.94D, 106.0D, 102.5D, 102.405D, 
    104.595D, 106.125D, 106.0D, 106.065D, 104.625D, 108.625D, 109.315D, 110.5D, 112.75D, 123.0D, 
    119.625D, 118.75D, 119.25D, 117.94D, 116.44D, 115.19D, 111.875D, 110.595D, 118.125D, 116.0D, 
    116.0D, 112.0D, 113.75D, 112.94D, 116.0D, 120.5D, 116.62D, 117.0D, 115.25D, 114.31D, 
    115.5D, 115.87D, 120.69D, 120.19D, 120.75D, 124.75D, 123.37D, 122.94D, 122.56D, 123.12D, 
    122.56D, 124.62D, 129.25D, 131.0D, 132.25D, 131.0D, 132.81D, 134.0D, 137.38D, 137.81D, 
    137.88D, 137.25D, 136.31D, 136.25D, 134.63D, 128.25D, 129.0D, 123.87D, 124.81D, 123.0D, 
    126.25D, 128.38D, 125.37D, 125.69D, 122.25D, 119.37D, 118.5D, 123.19D, 123.5D, 122.19D, 
    119.31D, 123.31D, 121.12D, 123.37D, 127.37D, 128.5D, 123.87D, 122.94D, 121.75D, 124.44D, 
    122.0D, 122.37D, 122.94D, 124.0D, 123.19D, 124.56D, 127.25D, 125.87D, 128.86D, 132.0D, 
    130.75D, 134.75D, 135.0D, 132.38D, 133.31D, 131.94D, 130.0D, 125.37D, 130.13D, 127.12D, 
    125.19D, 122.0D, 125.0D, 123.0D, 123.5D, 120.06D, 121.0D, 117.75D, 119.87D, 122.0D, 
    119.19D, 116.37D, 113.5D, 114.25D, 110.0D, 105.06D, 107.0D, 107.87D, 107.0D, 107.12D, 
    107.0D, 91.0D, 93.94D, 93.87D, 95.5D, 93.0D, 94.94D, 98.25D, 96.75D, 94.81D, 
    94.37D, 91.56D, 90.25D, 93.94D, 93.62D, 97.0D, 95.0D, 95.87D, 94.06D, 94.62D, 
    93.75D, 98.0D, 103.94D, 107.87D, 106.06D, 104.5D, 105.0D, 104.19D, 103.06D, 103.42D, 
    105.27D, 111.87D, 116.0D, 116.62D, 118.28D, 113.37D, 109.0D, 109.7D, 109.25D, 107.0D, 
    109.19D, 110.0D, 109.2D, 110.12D, 108.0D, 108.62D, 109.75D, 109.81D, 109.0D, 108.75D, 
    107.87D };
  public static final double FLT_EPSILON = 1.192092896E-7D;
  public static final double TA_REAL_MIN = -3.0E37D;
  
  public void test_MACD()
  {
    double[] macd = new double[close.length];
    double[] signal = new double[close.length];
    double[] hist = new double[close.length];
    this.lookback = this.lib.macdLookback(15, 26, 9);
    this.retCode = this.lib.macd(0, close.length - 1, close, 15, 26, 9, this.outBegIdx, this.outNbElement, macd, signal, hist);
    
    double[] ema15 = new double[close.length];
    this.lookback = this.lib.emaLookback(15);
    this.retCode = this.lib.ema(0, close.length - 1, close, 15, this.outBegIdx, this.outNbElement, ema15);
    
    double[] ema26 = new double[close.length];
    this.lookback = this.lib.emaLookback(26);
    this.retCode = this.lib.ema(0, close.length - 1, close, 26, this.outBegIdx, this.outNbElement, ema26);
  }
  
  public CoreTest(String testName)
  {
    super(testName);
    
    this.lib = new Core();
    this.input = new double['?'];
    this.inputInt = new int['?'];
    this.output = new double['?'];
    this.outputInt = new int['?'];
    this.outBegIdx = new MInteger();
    this.outNbElement = new MInteger();
  }
  
  protected void setUp()
  {
    for (int i = 0; i < this.input.length; i++)
    {
      this.input[i] = i;
      this.inputInt[i] = i;
    }
    for (int i = 0; i < this.output.length; i++)
    {
      this.output[i] = -999999.0D;
      this.outputInt[i] = -999999;
    }
    this.outBegIdx.value = -1;
    this.outNbElement.value = -1;
    this.retCode = RetCode.InternalError;
    this.lookback = -1;
  }
  
  protected void tearDown()
  {
    assertEquals(this.retCode.toString(), RetCode.Success.toString());
    assertEquals(this.lookback, this.outBegIdx.value);
  }
  
  public static Test suite()
  {
    TestSuite suite = new TestSuite(CoreTest.class);
    
    return suite;
  }
  
  public void testMFI()
  {
    this.lookback = this.lib.mfiLookback(2);
    this.retCode = this.lib.mfi(0, this.input.length - 1, this.input, this.input, this.input, this.input, 2, this.outBegIdx, this.outNbElement, this.output);
  }
  
  public void testHT()
  {
    this.lookback = this.lib.htTrendModeLookback();
    this.retCode = this.lib.htTrendMode(0, this.input.length - 1, this.input, this.outBegIdx, this.outNbElement, this.outputInt);
  }
  
  public void testMA_MAMA()
  {
    this.lookback = this.lib.movingAverageLookback(10, MAType.Mama);
    this.retCode = this.lib.movingAverage(0, this.input.length - 1, this.input, 10, MAType.Mama, this.outBegIdx, this.outNbElement, this.output);
  }
  
  public void testMA_SMA()
  {
    this.lookback = this.lib.movingAverageLookback(10, MAType.Sma);
    this.retCode = this.lib.movingAverage(0, this.input.length - 1, this.input, 10, MAType.Sma, this.outBegIdx, this.outNbElement, this.output);
    assertEquals(this.outBegIdx.value, 9);
  }
  
  public void testCMO()
  {
    this.lookback = this.lib.cmoLookback(10);
    this.retCode = this.lib.cmo(0, this.input.length - 1, this.input, 10, this.outBegIdx, this.outNbElement, this.output);
    assertEquals(Double.valueOf(100.0D), Double.valueOf(this.output[0]));
  }
  
  public void testSimpleCall()
  {
    this.input[0] = 2.0D;
    this.input[1] = 1.2D;
    this.input[2] = 1.5D;
    

    this.retCode = this.lib
    
      .max(0, 2, this.input, 2, this.outBegIdx, this.outNbElement, this.output);
    

    assertEquals(this.retCode, RetCode.Success);
    assertEquals(this.outBegIdx.value, 1);
    assertEquals(this.outNbElement.value, 2);
    assertEquals(Double.valueOf(this.output[0]), Double.valueOf(2.0D));
    assertEquals(Double.valueOf(this.output[1]), Double.valueOf(1.5D));
    
    this.lookback = this.lib.maxLookback(2);
  }
  
  public void testCMO2()
  {
    double[] inputRandFltEpsilon = new double[100];
    for (int i = 0; i < inputRandFltEpsilon.length; i++)
    {
      int sign = (int)Math.random() % 2;
      double data = (sign != 0 ? 1.0D : -1.0D) * 1.192092896E-7D;
      inputRandFltEpsilon[i] = data;
    }
    int optInTimePeriod = Integer.MIN_VALUE;
    

    double[] output = new double[100];
    Arrays.fill(output, -3.0E37D);
    
    MInteger outBegIdx = new MInteger();
    MInteger outNbElement = new MInteger();
    
    int lookback = this.lib.cmoLookback(optInTimePeriod);
    this.retCode = this.lib.cmo(0, inputRandFltEpsilon.length - 1, inputRandFltEpsilon, optInTimePeriod, outBegIdx, outNbElement, output);
    assertEquals(lookback, outBegIdx.value);
    assertEquals(Double.valueOf(output[0]), Double.valueOf(0.0D));
    assertEquals(Double.valueOf(output[1]), Double.valueOf(0.0D));
    assertEquals(Double.valueOf(output[85]), Double.valueOf(0.0D));
    assertEquals(Double.valueOf(output[86]), Double.valueOf(-3.0E37D));
  }
}
