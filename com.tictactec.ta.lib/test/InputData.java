package com.tictactec.ta.lib.test;
/**
 * Tak bardzo mi sie nie chce
 *
 */
public class InputData
{
  String name;
  double[] doubleData;
  float[] floatData;
  int[] intData;
  /**
   * 
   * @param name
   * @param size
   */
  public InputData(String name, int size)
  {
    this.name = name;
    this.doubleData = new double[size];
    this.floatData = new float[size];
    this.intData = new int[size];
  }
  /**
   * konstruktor kopiujacy
   * @param that
   */
  public InputData(InputData that)
  {
    this(that.name, that.size());
    System.arraycopy(that.doubleData, 0, this.doubleData, 0, this.doubleData.length);
    System.arraycopy(that.floatData, 0, this.floatData, 0, this.floatData.length);
    System.arraycopy(that.intData, 0, this.intData, 0, this.intData.length);
  }
  /**
   * 
   * @return name
   */
  public String getName()
  {
    return this.name;
  }
  /**
   * 
   * @return size
   */
  public int size()
  {
    return this.doubleData.length;
  }
  
  public void setData(int index, double dd, float fd, int id)
  {
    this.doubleData[index] = dd;
    this.floatData[index] = fd;
    this.intData[index] = id;
  }
  
  public double[] getDoubleData()
  {
    return this.doubleData;
  }
  
  public float[] getFloatData()
  {
    return this.floatData;
  }
  
  public int[] getIntData()
  {
    return this.intData;
  }
}
