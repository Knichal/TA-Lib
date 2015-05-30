package com.tictactec.ta.lib.test;

import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.meta.CoreMetaInfo;
import junit.framework.TestCase;

public class TestAbstract
  extends TestCase
{
  Core talib;
  TestData testData;
  
  public TestAbstract(String name)
  {
    super(name);
    this.talib = new Core();
  }
  
  protected void setUp()
    throws Exception
  {
    this.testData = new TestData();
  }
  
  protected void tearDown()
    throws Exception
  {}
  
  public void testAbstract()
    throws Exception
  {
    new CoreMetaInfo().forEach(new TestAbstractClosure(this.talib, this.testData.getAllInputData()));
  }
}
