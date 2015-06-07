package com.tictactec.ta.lib.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class AllTests
{
	/**
	 * Konstruktor domyœlny
	 */
  public AllTests() {}
  /**
   * Wywo³uje statycznie metodê run(), jako parametr przekazuje wynik dzia³ania metody statycznej suite()
   * @param args nie s¹ wykorzystywane
   */
  public static void main(String[] args)
  {
    TestRunner.run(suite());
  }
  /**
   * Tworzy nowy obiekt typu TestSuite z argument "Test for TA.Lib.Test",
   * nastêpnie na tym obiekcie wykonuje metodê addTestSuite(), która za agrument przyjmuje skompilowany plik .class
   * @return Utworzony lokalnie obiekt suite
   */
  public static Test suite()
  {
    TestSuite suite = new TestSuite("Test for TA.Lib.Test");
    
    suite.addTestSuite(TestAbstract.class);
    
    return suite;
  }
}
