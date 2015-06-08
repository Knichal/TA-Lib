package com.tictactec.ta.lib.test;

import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.meta.CoreMetaInfo;
import junit.framework.TestCase;

public class TestAbstract
  extends TestCase
{
  Core talib;
  TestData testData;
  /**
   * Konstruktor wykonuje konstruktor klasy nadrzednej z parametrem typu string oraz tworzy obiekt talib typu Core przez konstruktor bezparametrowy
   * @param name parametr dla konstruktora klasy nadrzednej
   */
  public TestAbstract(String name)
  {
    super(name);
    this.talib = new Core();
  }
  /**
   * Funkcja tworzy obiekty testData typu TestData przy uzyciu konstruktora domyslnego
   * @throws Exception
   */
  protected void setUp()
    throws Exception
  {
    this.testData = new TestData();
  }
  
  protected void tearDown()
    throws Exception
  {}
  /**
   * Funkcja wywoluje metode forEach z parametrem klasy anonimowej TestAbstractClosure, z obiektu CoreMetaInfo bez przypisania referencji
   * @throws Exception
   */
  public void testAbstract()
    throws Exception
  {
    new CoreMetaInfo().forEach(new TestAbstractClosure(this.talib, this.testData.getAllInputData()));
  }
}
