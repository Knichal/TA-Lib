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
   * Konstruktor z dwoma parametrami
   * tworzy tablice o rozmiarze podanym w parametrze size
   * @param name
   * @param size okresla wielkosc tablic
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
   * Funkcja zwraca zawartosc zmiennej name
   * @return name
   */
  public String getName()
  {
    return this.name;
  }
  /**
   * Funkcja zwraca rozmiar tablicy doubleData
   * @return size
   */
  public int size()
  {
    return this.doubleData.length;
  }
  /**
   * Funkcja umieszcza dane podane jako parametry dd, fd, id do tablic w miejsce podane jako parametr index
   * @param index
   * @param dd
   * @param fd
   * @param id
   */
  public void setData(int index, double dd, float fd, int id)
  {
    this.doubleData[index] = dd;
    this.floatData[index] = fd;
    this.intData[index] = id;
  }
  /**
   * Funkcja zwraca tablice doubleData
   * @return tablica double[]
   */
  public double[] getDoubleData()
  {
    return this.doubleData;
  }

  /**
   * Funkcja zwraca tablice floatData
   * @return tablica float[]
   */
  public float[] getFloatData()
  {
    return this.floatData;
  }

  /**
   * Funkcja zwraca tablice intData
   * @return tablica int[]
   */
  public int[] getIntData()
  {
    return this.intData;
  }
}
