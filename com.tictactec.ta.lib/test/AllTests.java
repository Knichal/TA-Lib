package com.tictactec.ta.lib.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class AllTests
{
	/**
	 * Konstruktor domy�lny
	 */
  public AllTests() {}
  /**
   * Wywo�uje statycznie metod� run(), jako parametr przekazuje wynik dzia�ania metody statycznej suite()
   * @param args nie s� wykorzystywane
   */
  public static void main(String[] args)
  {
    TestRunner.run(suite());
  }
  /**
   * Tworzy nowy obiekt typu TestSuite z argument "Test for TA.Lib.Test",
   * nast�pnie na tym obiekcie wykonuje metod� addTestSuite(), kt�ra za agrument przyjmuje skompilowany plik .class
   * @return Utworzony lokalnie obiekt suite
   */
  public static Test suite()
  {
    TestSuite suite = new TestSuite("Test for TA.Lib.Test");
    
    suite.addTestSuite(TestAbstract.class);
    
    return suite;
  }
}
