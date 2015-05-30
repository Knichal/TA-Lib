package com.tictactec.ta.lib.test;

import com.tictactec.ta.lib.MInteger;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MIntegerTest
  extends TestCase
{
  public MIntegerTest(String testName)
  {
    super(testName);
  }
  
  protected void setUp()
    throws Exception
  {}
  
  protected void tearDown()
    throws Exception
  {}
  
  public static Test suite()
  {
    TestSuite suite = new TestSuite(MIntegerTest.class);
    
    return suite;
  }
  
  public void testMutable()
  {
    MInteger i = new MInteger();
    i.value = 2;
    Assert.assertTrue(i.value == 2);
    i.value = 1;
    Assert.assertTrue(i.value == 1);
  }
}
