/* TA-LIB Copyright (c) 1999-2007, Mario Fortier
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or
 * without modification, are permitted provided that the following
 * conditions are met:
 *
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in
 *   the documentation and/or other materials provided with the
 *   distribution.
 *
 * - Neither name of author nor the names of its contributors
 *   may be used to endorse or promote products derived from this
 *   software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/* List of contributors:
 *
 *  Initial  Name/description
 *  -------------------------------------------------------------------
 *  RG       Richard Gomes
 *
 * Change history:
 *
 *  YYYYMMDD BY     Description
 *  -------------------------------------------------------------------
 *  20070311 RG     First Version
 */

package com.tictactec.ta.lib.meta;

import java.lang.annotation.IncompleteAnnotationException;

import com.tictactec.ta.lib.RetCode;
import com.tictactec.ta.lib.meta.annotation.FuncInfo;
import com.tictactec.ta.lib.meta.annotation.InputParameterInfo;
import com.tictactec.ta.lib.meta.annotation.OptInputParameterInfo;
import com.tictactec.ta.lib.meta.annotation.OutputParameterInfo;
/**
 *  Klasa ta przeznaczona jest dla developer�w, kt�rzy chc� przet�umaczy� kod �r�d�owy z "C" oraz korzystali z `ta_abstract.h`
 *
 * W Javie mamy mo�liwo�� wykorzystania wiele klas zg�aszaj�cych wyj�tki. W "C" natomiast musimy pos�ugiwac si� kodami status�w by ustalic jaki doskwiera nam b��d.
 * Klasa ta tworzy dodatkow� warstw� opakowuj�c� CoreMetaData i zamiast zg�aszania mo�liwych wyst�pie� wyj�tk�w zg�asza ona kod statusu jak w j�zyku "C".
 *
 * WA�NE: Klasa ta nie zosta�a przetestowana przez autora biblioteki. U�ywasz jej na w�asne ryzyko.
 *
 * WA�NE: Klasa ta w ca�o�ci nie implementuje metod z <i>ta_abstract.h</i>
 *
 * @author Komentarz - Maciej Knicha�
 *
 */
public class CoreMetaDataCompatibility extends CoreMetaData {
    /**
     * Metoda ta zwraca uchwyt do funkcji.
     * @param name Nazwa funkcji.
     * @param retHandle Obiekt CoreMetaData do kt�rego zostanie utworzony uchwyt.
     * @return Kod statusu (RetCode).
     */
    static RetCode taGetFuncHandle(final String name, CoreMetaData retHandle) {
        try {
            retHandle = getFuncHandle(name);
            return RetCode.Success;
        } catch (NoSuchMethodException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta zwraca informacje na temat funkcji.
     * @param retFuncInfo Intefejs do kt�rego zostan� zapisane informacje o funkcjach.
     * @return Kod statusu (RetCode).
     */
    RetCode taGetFuncInfo(FuncInfo retFuncInfo) {
        try {
            retFuncInfo = super.getFuncInfo();
            return RetCode.Success;
        } catch (IncompleteAnnotationException e) {
            return RetCode.InternalError;
        }
    }
    /**
     * Metoda Ta zwraca informacje na temat n-tego parametru wej�ciowego.
     * @param paramIndex Indeks parametru n-tego.
     * @param retInputParameterInfo Interfejs do kt�rego zostanie zapisana informacja o n-tym parametrze.
     * @return Kod statusu (RetCode).
     */
    RetCode taGetInputParameterInfo(final int paramIndex, InputParameterInfo retInputParameterInfo) {
        try {
            retInputParameterInfo = super.getInputParameterInfo(paramIndex);
            return RetCode.Success;
        } catch (IllegalArgumentException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta zwraca informacje na temat n-tego opcjonalnego parametru wej�ciowego.
     * @param paramIndex Indeks n-tego parametru.
     * @param retOptInputParameterInfo Interfejs do kt�rego zostanie zapisana informacja o n-tym parametrze.
     * @return KodStatusu (RetCode).
     */
    RetCode taGetInputParameterInfo(final int paramIndex, OptInputParameterInfo retOptInputParameterInfo) {
        try {
            retOptInputParameterInfo = super.getOptInputParameterInfo(paramIndex);
            return RetCode.Success;
        } catch (IllegalArgumentException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta zwraca informacje na temat n-tego parametru wyj�ciowego.
     * @param paramIndex Indeks n-tego parametru.
     * @param retOutputParameterInfo Interfejs do kt�rego zostanie zapisana informacja o n-tym parametrze.
     * @return
     */
    RetCode taGetOutputParameterInfo(final int paramIndex, OutputParameterInfo retOutputParameterInfo) {
        try {
            retOutputParameterInfo = super.getOutputParameterInfo(paramIndex);
            return RetCode.Success;
        } catch (IllegalArgumentException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta ustawia n-ty parametr wej�ciowy typu Integer.
     * @param paramIndex Indeks n-tego parametru.
     * @param value tablica z warto�ciami typu Integer.
     * @return Kod statusu.
     */
    RetCode taSetInputParamIntegerPtr(final int paramIndex, final int[] value ) {
        try {
            super.setInputParamInteger(paramIndex, value);
            return RetCode.Success;
        } catch (NullPointerException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta ustawia n-ty parametr wej�ciowy typu Real.
     * @param paramIndex Indeks n-tego parametru.
     * @param value tablica z warto�ciami typu Real.
     * @return Kod statusu.
     */
    RetCode taSetInputParamRealPtr(final int paramIndex, final double[] value ) {
        try {
            super.setInputParamReal(paramIndex, value);
            return RetCode.Success;
        } catch (NullPointerException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta ustawia n-ty parametr typu Price.
     * @param paramIndex Indeks n-tego parametru.
     * @param open Reprezentacja Open Prices w postaci double[]
     * @param high Reprezentacja High Prices w postaci double[]
     * @param low Reprezentacja Low Prices w postaci double[]
     * @param close Reprezentacja Close Prices w postaci double[]
     * @param volume Reprezentacje volume w postaci double[]
     * @param openInterest Reprezentacja OpenInterest w postaci double[]
     * @return Kod statusu.
     */
    RetCode taSetInputParamPricePtr(final int paramIndex,
            final double[] open,
            final double[] high,
            final double[] low,
            final double[] close,
            final double[] volume,
            final double[] openInterest) {
        try {
            super.setInputParamPrice(paramIndex, open, high, low, close, volume, openInterest);
            return RetCode.Success;
        } catch (NullPointerException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta ustawia n-ty opcjonalny parametr typu Integer.
     * @param paramIndex Indeks parametru n-tego.
     * @param optInValue Nowa warto�c n-tego parametru.
     * @return Kod Statusu.
     */
    RetCode taSetOptInputParamInteger(final int paramIndex, final int optInValue) {
        try {
            setOptInputParamInteger(paramIndex, optInValue);
            return RetCode.Success;
        } catch (IllegalArgumentException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta ustawia n-ty opcjonalny parametr typu Real.
     * @param paramIndex Indeks parametru n-tego.
     * @param optInValue Nowa warto�c n-tego parametru.
     * @return Kod statusu.
     */
    RetCode taSetOptInputParamReal(final int paramIndex, final double optInValue) {
        try {
            setOptInputParamReal(paramIndex, optInValue);
            return RetCode.Success;
        } catch (IllegalArgumentException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta ustawia n-ty parametr wyj�ciowy typu Integer.
     * @param paramIndex Indeks n-tego parametru.
     * @param outArray Tablica warto�ci int[].
     * @return Kod statusu.
     */
    RetCode taSetOutputParamIntegerPtr(final int paramIndex, int[] outArray) {
        if (outArray == null) return RetCode.BadParam;
        try {
            setOutputParamInteger(paramIndex, outArray);
            return RetCode.Success;
        } catch (IllegalArgumentException e) {
            return RetCode.BadParam;
        }
    }
    /**
     * Metoda ta ustawia n-ty parametr wyj�ciowy typu Real.
     * @param paramIndex Indekst n-tego parametru.
     * @param outArray Tablica warto�ci double[].
     * @return Kod statusu.
     */
    RetCode taSetOutputParamRealPtr(final int paramIndex, double[] outArray) {
        if (outArray == null) return RetCode.BadParam;
        try {
            setOutputParamReal(paramIndex, outArray);
            return RetCode.Success;
        } catch (IllegalArgumentException e) {
            return RetCode.BadParam;
        }
    }


}
