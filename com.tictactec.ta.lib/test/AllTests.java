package com.tictactec.ta.lib.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class AllTests
{
  public AllTests() {}
  
  public static void main(String[] args)
  {
    TestRunner.run(suite());
  }
  
  public static Test suite()
  {
    TestSuite suite = new TestSuite("Test for TA.Lib.Test");
    
    suite.addTestSuite(TestAbstract.class);
    
    return suite;
  }
}
