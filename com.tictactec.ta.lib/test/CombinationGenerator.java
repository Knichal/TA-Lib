package com.tictactec.ta.lib.test;

import java.util.ArrayList;
import java.util.List;

public class CombinationGenerator
{
	/**
	 * Konstruktor domyslny
	 */
  public CombinationGenerator() {}
  /**
   * Rekurencyjna funkcja generuj¹ca wszystkie kombinacje mieszania obiektow
   * @param parms tablica typu OBject
   * @return lista obiektow Object
   */
  public List<Object[]> getAllCombinations(Object[] parms)
  {
    List<Object[]> children = null;
    if (parms.length > 1)
    {
      Object[] cp = new Object[parms.length - 1];
      for (int i = 0; i < parms.length - 1; i++) {
        cp[i] = parms[(i + 1)];
      }
      children = getAllCombinations(cp);
    }
    List<Object[]> ret = new ArrayList();
    if (parms.length == 0) {
      ret.add(parms);
    } else if (parms[0].getClass().isArray()) {
      for (Object o : (Object[])parms[0]) {
        process(ret, children, o);
      }
    } else {
      process(ret, children, parms[0]);
    }
    return ret;
  }
  /**
   * Funkcja dodaje do listy ret obiekty listy children(jezeli children jest ró¿ne od null) oraz obiekt obj
   * @param ret lista obiektow typu Object[]
   * @param children lista obiektow typu Object[]
   * @param obj
   */
  void process(List<Object[]> ret, List<Object[]> children, Object obj)
  {
    if (children == null)
    {
      Object[] da = new Object[1];
      da[0] = obj;
      ret.add(da);
    }
    else
    {
      for (Object[] cr : children)
      {
        Object[] rr = new Object[cr.length + 1];
        rr[0] = obj;
        for (int i = 0; i < cr.length; i++) {
          rr[(i + 1)] = cr[i];
        }
        ret.add(rr);
      }
    }
  }
}
