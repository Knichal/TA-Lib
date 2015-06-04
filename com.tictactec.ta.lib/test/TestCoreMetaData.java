package com.tictactec.ta.lib.test;

import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.meta.CoreMetaData;
import com.tictactec.ta.lib.meta.PriceHolder;
import com.tictactec.ta.lib.meta.PriceInputParameter;
import com.tictactec.ta.lib.meta.TaFuncService;
import com.tictactec.ta.lib.meta.TaGrpService;
import com.tictactec.ta.lib.meta.annotation.FuncInfo;
import com.tictactec.ta.lib.meta.annotation.InputParameterInfo;
import com.tictactec.ta.lib.meta.annotation.IntegerList;
import com.tictactec.ta.lib.meta.annotation.IntegerRange;
import com.tictactec.ta.lib.meta.annotation.OptInputParameterInfo;
import com.tictactec.ta.lib.meta.annotation.OutputParameterInfo;
import com.tictactec.ta.lib.meta.annotation.RealList;
import com.tictactec.ta.lib.meta.annotation.RealRange;
import com.tictactec.ta.lib.meta.helpers.SimpleHelper;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestCoreMetaData
{
  public TestCoreMetaData() {}
  
  public static void main(String[] args)
  {
    TaGrpService grpServ = new TaGrpService()
    {
      public void execute(String group, Set<CoreMetaData> set)
      {
        System.out.println("GROUP " + group);
        for (CoreMetaData mi : set) {
          System.out.println("        " + mi.getFuncInfo().name());
        }
      }
    };
    try
    {
      CoreMetaData.forEachGrp(grpServ);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    System.out.println("=  =  =  =  =  =  =  =  =  =  =  =  =");
    
    TaFuncService funcServ = new TaFuncService()
    {
      public void execute(CoreMetaData mi)
      {
        System.out.println(mi.getFuncInfo().name());
        for (int i = 0; i < mi.getFuncInfo().nbInput(); i++)
        {
          InputParameterInfo pinfo = mi.getInputParameterInfo(i);
          System.out.println("    " + pinfo.paramName());
          System.out.println("        " + pinfo.type());
        }
        for (int i = 0; i < mi.getFuncInfo().nbOptInput(); i++)
        {
          OptInputParameterInfo pinfo = mi.getOptInputParameterInfo(i);
          System.out.println("    " + pinfo.paramName());
          System.out.println("        " + pinfo.type());
          switch (pinfo.type())
          {
          case TA_OptInput_IntegerList: 
            RealRange rrange = mi.getOptInputRealRange(i);
            System.out.println("            min=" + rrange.min());
            System.out.println("            max=" + rrange.max());
            System.out.println("            precision=" + rrange.precision());
            System.out.println("            default=" + rrange.defaultValue());
            break;
          case TA_OptInput_IntegerRange: 
            RealList rlist = mi.getOptInputRealList(i);
            System.out.print("            value=");
            for (double value : rlist.value())
            {
              System.out.print(value);System.out.print(" ");
            }
            System.out.println();
            System.out.print("            string=" + rlist.string());
            for (String string : rlist.string())
            {
              System.out.print(string);System.out.print(" ");
            }
            System.out.println();
            break;
          case TA_OptInput_RealList: 
            IntegerRange irange = mi.getOptInputIntegerRange(i);
            System.out.println("            min=" + irange.min());
            System.out.println("            max=" + irange.max());
            System.out.println("            default=" + irange.defaultValue());
            break;
          case TA_OptInput_RealRange: 
            IntegerList ilist = mi.getOptInputIntegerList(i);
            System.out.print("            value=");
            for (int value : ilist.value())
            {
              System.out.print(value);System.out.print(" ");
            }
            System.out.println();
            System.out.print("            string=");
            for (String string : ilist.string())
            {
              System.out.print(string);System.out.print(" ");
            }
            System.out.println();
          }
        }
        for (int i = 0; i < mi.getFuncInfo().nbOutput(); i++)
        {
          OutputParameterInfo pinfo = mi.getOutputParameterInfo(i);
          System.out.println("    " + pinfo.paramName());
          System.out.println("        " + pinfo.type());
        }
      }
    };
    try
    {
      CoreMetaData.forEachFunc(funcServ);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    System.out.println("=====================================");
    








    double[] open = {
      1.4054D, 1.406D, 1.4062D, 1.4059D, 1.4057D, 1.4057D, 1.4051D, 1.4054D, 1.4056D, 1.4056D, 
      1.4054D, 1.406D, 1.4062D, 1.4059D, 1.4057D, 1.4057D, 1.4051D, 1.4054D, 1.4056D, 1.4056D, 
      1.4054D, 1.406D, 1.4062D, 1.4059D, 1.4057D, 1.4057D, 1.4051D, 1.4054D, 1.4056D, 1.4056D, 
      1.4054D, 1.406D, 1.4062D, 1.4059D, 1.4057D, 1.4057D, 1.4051D, 1.4054D, 1.4056D, 1.4056D, 
      1.4054D, 1.406D, 1.4062D, 1.4059D, 1.4057D, 1.4057D, 1.4051D, 1.4054D, 1.4056D, 1.4056D, 
      1.4054D, 1.406D, 1.4062D, 1.4059D, 1.4057D, 1.4057D, 1.4051D, 1.4054D, 1.4056D, 1.4056D };
    

    double[] high = {
      1.4654D, 1.466D, 1.4662D, 1.4659D, 1.4657D, 1.4657D, 1.4651D, 1.4654D, 1.4656D, 1.4656D, 
      1.4654D, 1.466D, 1.4662D, 1.4659D, 1.4657D, 1.4657D, 1.4651D, 1.4654D, 1.4656D, 1.4656D, 
      1.4654D, 1.466D, 1.4662D, 1.4659D, 1.4657D, 1.4657D, 1.4651D, 1.4654D, 1.4656D, 1.4656D, 
      1.4654D, 1.466D, 1.4662D, 1.4659D, 1.4657D, 1.4657D, 1.4651D, 1.4654D, 1.4656D, 1.4656D, 
      1.4654D, 1.466D, 1.4662D, 1.4659D, 1.4657D, 1.4657D, 1.4651D, 1.4654D, 1.4656D, 1.4656D, 
      1.4654D, 1.466D, 1.4662D, 1.4659D, 1.4657D, 1.4657D, 1.4651D, 1.4654D, 1.4656D, 1.4656D };
    


    double[] low = {
      1.3954D, 1.396D, 1.3962D, 1.3959D, 1.3957D, 1.3957D, 1.3951D, 1.3954D, 1.3956D, 1.3956D, 
      1.3954D, 1.396D, 1.3962D, 1.3959D, 1.3957D, 1.3957D, 1.3951D, 1.3954D, 1.3956D, 1.3956D, 
      1.3954D, 1.396D, 1.3962D, 1.3959D, 1.3957D, 1.3957D, 1.3951D, 1.3954D, 1.3956D, 1.3956D, 
      1.3954D, 1.396D, 1.3962D, 1.3959D, 1.3957D, 1.3957D, 1.3951D, 1.3954D, 1.3956D, 1.3956D, 
      1.3954D, 1.396D, 1.3962D, 1.3959D, 1.3957D, 1.3957D, 1.3951D, 1.3954D, 1.3956D, 1.3956D, 
      1.3954D, 1.396D, 1.3962D, 1.3959D, 1.3957D, 1.3957D, 1.3951D, 1.3954D, 1.3956D, 1.3956D };
    


    double[] close = {
      1.4554D, 1.456D, 1.4562D, 1.4559D, 1.4557D, 1.4557D, 1.4551D, 1.4554D, 1.4556D, 1.4556D, 
      1.4554D, 1.456D, 1.4562D, 1.4559D, 1.4557D, 1.4557D, 1.4551D, 1.4554D, 1.4556D, 1.4556D, 
      1.4554D, 1.456D, 1.4562D, 1.4559D, 1.4557D, 1.4557D, 1.4551D, 1.4554D, 1.4556D, 1.4556D, 
      1.4554D, 1.456D, 1.4562D, 1.4559D, 1.4557D, 1.4557D, 1.4551D, 1.4554D, 1.4556D, 1.4556D, 
      1.4554D, 1.456D, 1.4562D, 1.4559D, 1.4557D, 1.4557D, 1.4551D, 1.4554D, 1.4556D, 1.4556D, 
      1.4554D, 1.456D, 1.4562D, 1.4559D, 1.4557D, 1.4557D, 1.4551D, 1.4554D, 1.4556D, 1.4556D };
    

    double[] output1 = new double[60];
    double[] output2 = new double[60];
    double[] output3 = new double[60];
    MInteger lOutIdx = new MInteger();
    MInteger lOutSize = new MInteger();
    


    List<String> params = new ArrayList();
    try
    {
      String func = "MAMA";
      params.clear();
      params.add("0.2");
      params.add("0.02");
      SimpleHelper calc = new SimpleHelper(func, params);
      
      System.out.println("===============================================");
      System.out.println(func);
      calc.calculate(0, 59, new Object[] { close }, new Object[] { output1, output2 }, lOutIdx, lOutSize);
      
      System.out.println("lookback=" + calc.getLookback());
      System.out.println("outBegIdx    = " + lOutIdx.value + "    outNbElement = " + lOutSize.value);
      for (int i = 0; i < lOutSize.value; i++) {
        System.out.println("output1[" + i + "]=" + output1[i] + "     " + "output2[" + i + "]=" + output2[i]);
      }
      func = "bbands";
      params.clear();
      params.add("8");
      params.add("0.02");
      params.add("0.04");
      params.add("dEmA");
      
      calc = new SimpleHelper(func, params);
      
      System.out.println("===============================================");
      System.out.println(func);
      calc.calculate(0, 59, new Object[] { close }, new Object[] { output1, output2, output3 }, lOutIdx, lOutSize);
      
      System.out.println("lookback=" + calc.getLookback());
      System.out.println("outBegIdx    = " + lOutIdx.value + "    outNbElement = " + lOutSize.value);
      for (int i = 0; i < lOutSize.value; i++) {
        System.out.println("output1[" + i + "]=" + output1[i] + "     " + "output2[" + i + "]=" + output2[i] + "     " + "output3[" + i + "]=" + output3[i]);
      }
      func = "Adx";
      params.clear();
      params.add("8");
      
      calc = new SimpleHelper(func, params);
      
      System.out.println("===============================================");
      System.out.println(func);
      int flags = calc.getMetaData().getInputParameterInfo(0).flags();
      PriceHolder price = new PriceInputParameter(flags, open, high, low, close, null, null);
      calc.calculate(0, 59, new Object[] { price }, new Object[] { output1 }, lOutIdx, lOutSize);
      
      System.out.println("lookback=" + calc.getLookback());
      System.out.println("outBegIdx    = " + lOutIdx.value + "    outNbElement = " + lOutSize.value);
      for (int i = 0; i < lOutSize.value; i++) {
        System.out.println("output1[" + i + "]=" + output1[i]);
      }
      func = "rsi";
      params.clear();
      params.add("8");
      
      calc = new SimpleHelper(func, params);
      
      System.out.println("===============================================");
      System.out.println(func);
      calc.calculate(0, 59, new Object[] { close }, new Object[] { output1 }, lOutIdx, lOutSize);
      
      System.out.println("lookback=" + calc.getLookback());
      System.out.println("outBegIdx    = " + lOutIdx.value + "    outNbElement = " + lOutSize.value);
      for (int i = 0; i < lOutSize.value; i++) {
        System.out.println("output1[" + i + "]=" + output1[i]);
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
