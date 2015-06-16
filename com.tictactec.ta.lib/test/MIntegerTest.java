package com.tictactec.ta.lib.test;

import com.tictactec.ta.lib.MInteger;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MIntegerTest
  extends TestCase
{
 /**
  * Funkcja przekazuje parametr do konstruktora klasy TestCase
  * @param testName
  */
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
  /**
   * Funkcja tworzy obiekt typu TestSuite w parametrze dla konstruktora podaje plik binarny MIntegerTest.class
   * @returnobiekt typu TestSuite
   */
  public static Test suite()
  {
    TestSuite suite = new TestSuite(MIntegerTest.class);
    
    return suite;
  }
  /**
   * Funkcja sprawdza dwukrotnie za pomoca asercji czy udalo sie przypisac wartosc calkowita dla obiektu typu MInteger.
   */
  public void testMutable()
  {
    MInteger i = new MInteger();
    i.value = 2;
    Assert.assertTrue(i.value == 2);
    i.value = 1;
    Assert.assertTrue(i.value == 1);
  }
}
