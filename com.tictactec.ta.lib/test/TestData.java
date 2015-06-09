package com.tictactec.ta.lib.test;

import java.util.ArrayList;
import java.util.List;

public class TestData
{
  List<InputData> allInputData;
  InputData inputNegData;
  InputData inputZeroData;
  InputData inputRandFltEpsilon;
  InputData inputRandDblEpsilon;
  InputData inputRandomData;
  static final double[][] output = new double[10]['?'];
  static final int[][] output_int = new int[10]['?'];
  public static final double DBL_EPSILON = 2.220446049250313E-16D;
  public static final double FLT_EPSILON = 1.192092896E-7D;
  public static final int TA_INTEGER_MIN = -2147483647;
  public static final int TA_INTEGER_MAX = Integer.MAX_VALUE;
  public static final double TA_REAL_MIN = -3.0E37D;
  public static final double TA_REAL_MAX = 3.0E37D;
  public static final double TA_INTEGER_DEFAULT = -2.147483648E9D;
  public static final double TA_REAL_DEFAULT = -4.0E37D;
  /** 
   * Konstruktor domyslny <p>
   * przygotowuje tablice, <p> 
   * dla kazdego elementu <b>inputNegData</b> wywolana zostaje metoda <b>setData(int,int,int,int)</b> z parametrami i, -i, -i, -i gdzie i to indeks danego elementu <p>
   * dla kazdego elementu <b>inputZeroData</b> wywolana zostaje metoda <b>setData(int,double,float,int)</b> z parametrami i, 0.0D, 0.0F, 0 gdzie i to indeks danego elementu <p>
   * dla kazdego elementu <b>inputRandomData</b> wywolana jest metoda <b>setData(int,double,float,int)</b> z parametrami i,rand,rand gdzie i to indeks danego elementu, rand liczba pseudolosowa z zakresu 0 - 1/97.234D <p>
   * dla kazdego elementu <b>inputRandFltEpsilon</b> wywolana jest metoda <b>setData(int,double,float)</b> z parametrami i,data*sign,data*sign gdzie i to indeks danego elementu, data to 1.192092896E-7D, sign to 1 lub -1 (wybierane pseudolosowo) <p>
   * dla kazdego elementu <b>inputRandDblEpsilon</b> wywolana jest metoda <b>setData(int,float,int)</b> z parametrami i,data,sign gdzie i to indeks danego elementu, data to 2.220446049250313E-16D, sign to 1 lub -1 (wybierane pseudolosowo) <p>
   */
  TestData()
  {
    this.allInputData = new ArrayList();
    this.inputNegData = new InputData("Negative Data", 100);
    this.allInputData.add(this.inputNegData);
    this.inputZeroData = new InputData("Zero Data", 100);
    this.allInputData.add(this.inputZeroData);
    this.inputRandFltEpsilon = new InputData("Random Float Epsilon", 100);
    this.allInputData.add(this.inputRandFltEpsilon);
    this.inputRandDblEpsilon = new InputData("Random Double Epsilon", 100);
    this.allInputData.add(this.inputRandDblEpsilon);
    this.inputRandomData = new InputData("Random Data", 2000);
    this.allInputData.add(this.inputRandomData);
    for (int i = 0; i < this.inputNegData.size(); i++) {
      this.inputNegData.setData(i, -i, -i, -i);
    }
    for (int i = 0; i < this.inputZeroData.size(); i++) {
      this.inputZeroData.setData(i, 0.0D, 0.0F, 0);
    }
    for (int i = 0; i < this.inputRandomData.size(); i++)
    { 
      double rand = Math.random() / 97.234D;
      this.inputRandomData.setData(i, rand, (float)rand, (int)rand);
    }
    for (int i = 0; i < this.inputRandFltEpsilon.size(); i++)
    {
      int sign = (int)Math.random() % 2;
      double data = (sign != 0 ? 1.0D : -1.0D) * 1.192092896E-7D;
      this.inputRandFltEpsilon.setData(i, data, (float)data, 
        sign != 0 ? -2147483647 : Integer.MAX_VALUE);
    }
    
    for (int i = 0; i < this.inputRandDblEpsilon.size(); i++)
    {
      int sign = (int)Math.random() % 2;
      double data = (sign != 0 ? 1.0D : -1.0D) * 2.220446049250313E-16D;
      this.inputRandDblEpsilon.setData(i, data, (float)data, sign != 0 ? 1 : -1);
    }
  }
  /**
   * Funkcja zwraca liste allInputData
   * @return lista obiektow InputData
   */
  public List<InputData> getAllInputData()
  {
    return this.allInputData;
  }
}
