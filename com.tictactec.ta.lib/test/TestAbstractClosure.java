package com.tictactec.ta.lib.test;

import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.RetCode;
import com.tictactec.ta.lib.meta.TaFuncClosure;
import com.tictactec.ta.lib.meta.TaFuncMetaInfo;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import junit.framework.Assert;

public class TestAbstractClosure
  extends Assert
  implements TaFuncClosure
{
  List<InputData> originalData;
  List<InputData> testData;
  Core taCore;
  InputData curInputData;
  
  public TestAbstractClosure(Core taCore, List<InputData> data)
  {
    this.taCore = taCore;
    this.originalData = data;
    this.testData = new ArrayList();
    for (InputData id : this.originalData) {
      this.testData.add(new InputData(id));
    }
  }
  
  public void execute(TaFuncMetaInfo mi)
    throws Exception
  {
    int n = this.testData.size();
    for (int i = 0; i < n; i++) {
      execute(mi, (InputData)this.testData.get(i), (InputData)this.originalData.get(i));
    }
  }
  
  void execute(TaFuncMetaInfo mi, InputData inputData, InputData originalInputData)
    throws Exception
  {
    this.curInputData = inputData;
    
    Object[] inArs = getInputParamters(mi, inputData);
    Object[] options = getDefaultOptions(mi);
    

    List<Object[]> optionsCombination = new CombinationGenerator().getAllCombinations(options);
    for (Object[] ops : optionsCombination) {
      execute(mi, inputData, originalInputData, inArs, ops);
    }
  }
  
  void execute(TaFuncMetaInfo mi, InputData inputData, InputData originalInputData, Object[] inArs, Object[] options)
    throws Exception
  {
    int lookback = 0;
    Object[] outArs = getOutputParameters(mi, inputData.size(), lookback);
    MInteger outBegIdx = new MInteger();
    MInteger outNbElement = new MInteger();
    int startIndex = 0;
    int endIndex = inputData.size() - 1;
    

    RetCode retCode = mi.call(this.taCore, inArs, startIndex, endIndex, outArs, outBegIdx, outNbElement, options);
    assertEquals(retCode, RetCode.Success);
    








    assert (verifyOutputData(mi, outArs));
    

    assert (verifyInputData(inputData, originalInputData));
    



    retCode = mi.call(this.taCore, inArs, 0, 0, outArs, outBegIdx, outNbElement, options);
    assertEquals(retCode, RetCode.Success);
    assertEquals(outBegIdx.value, 0);
  }
  
  Object[] getInputParamters(TaFuncMetaInfo mi, InputData inputData)
  {
    Class[] inVarTypes = mi.getInVarTypes();
    Object[] ret = new Object[inVarTypes.length];
    for (int i = 0; i < inVarTypes.length; i++) {
      if (inVarTypes[i].equals([D.class)) {
        ret[i] = inputData.getDoubleData();
      } else if (inVarTypes[i].equals([F.class)) {
        ret[i] = inputData.getFloatData();
      } else if (inVarTypes[i].equals([I.class)) {
        ret[i] = inputData.getIntData();
      } else {
        fail("Invalid input type : " + inVarTypes[i]);
      }
    }
    return ret;
  }
  
  Object[] getOutputParameters(TaFuncMetaInfo mi, int inSize, int lookback)
  {
    int outSize = inSize;
    Class[] outVarTypes = mi.getOutVarTypes();
    Object[] ret = new Object[outVarTypes.length];
    for (int i = 0; i < outVarTypes.length; i++) {
      if (outVarTypes[i].equals([D.class))
      {
        ret[i] = new double[outSize];
        Arrays.fill((double[])ret[i], -3.0E37D);
      }
      else if (outVarTypes[i].equals([F.class))
      {
        ret[i] = new float[outSize];
        Arrays.fill((float[])ret[i], -3.0E37F);
      }
      else if (outVarTypes[i].equals([I.class))
      {
        ret[i] = new int[outSize];
        Arrays.fill((int[])ret[i], -2147483647);
      }
      else
      {
        fail("Invalid output type : " + outVarTypes[i]);
      }
    }
    return ret;
  }
  
  Object[] getDefaultOptions(TaFuncMetaInfo mi)
    throws IllegalArgumentException, IllegalAccessException
  {
    Class[] optionTypes = mi.getOptionTypes();
    Object[] ret = new Object[optionTypes.length];
    for (int i = 0; i < optionTypes.length; i++) {
      if (optionTypes[i].equals(Double.TYPE)) {
        ret[i] = Double.valueOf(-4.0E37D);
      } else if (optionTypes[i].equals(Float.TYPE)) {
        ret[i] = Double.valueOf(-4.0E37D);
      } else if (optionTypes[i].equals(Integer.TYPE)) {
        ret[i] = Integer.valueOf(Integer.MIN_VALUE);
      } else if (optionTypes[i].isEnum()) {
        ret[i] = getAllEnumMembers(optionTypes[i]);
      } else {
        fail("Invalid option type : " + optionTypes[i]);
      }
    }
    return ret;
  }
  
  Enum[] getAllEnumMembers(Class clazz)
    throws IllegalArgumentException, IllegalAccessException
  {
    Field[] flds = clazz.getFields();
    Enum[] ret = new Enum[flds.length];
    for (int i = 0; i < flds.length; i++) {
      ret[i] = ((Enum)flds[i].get(clazz));
    }
    return ret;
  }
  
  boolean verifyOutputData(TaFuncMetaInfo mi, Object[] outArs)
  {
    Class[] outVarTypes = mi.getOutVarTypes();
    for (int i = 0; i < outVarTypes.length; i++) {
      if (outVarTypes[i].equals([D.class))
      {
        double[] ar = (double[])outArs[i];
        int j = 0;
        for (double d : ar)
        {
          if ((Double.isNaN(d)) || (Double.isInfinite(d))) {
            System.out.println("----------->" + mi.toString() + "[" + j + "]=" + d + ":" + this.curInputData.getName());
          }
          j++;
        }
      }
      else if (!outVarTypes[i].equals([F.class))
      {
        if (!outVarTypes[i].equals([I.class)) {
          fail("invalid output type : " + outVarTypes[i]);
        }
      }
    }
    return true;
  }
  
  boolean verifyInputData(InputData inputData, InputData originalInputData)
  {
    return (Arrays.equals(inputData.getDoubleData(), originalInputData.getDoubleData())) && (Arrays.equals(inputData.getFloatData(), originalInputData.getFloatData())) && (Arrays.equals(inputData.getIntData(), originalInputData.getIntData()));
  }
}
