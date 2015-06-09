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
/**
 * PriceHolder jest odpowiedzialny za zachowanie cen(notowañ cenowych) które sk³adaja sie w OHLCVI, np.:
 * open, high, low, close, volume and open interest.
 *
 * WskaŸniki matematyczne korzystaj¹ce z cen na wejœciu, bior¹ tylko podzbiór komponentu OHLCVI.
 * Mog³oby siê wydawaæ, ¿e ta klasa mo¿e byæ wykorzystana w tym celu. Jednak nie jest ona przeznaczona do trzymania cen dla wskaŸników.
 * By to wyt³umaczyc: Tablice zawarte w PriceHolder nie mog¹ byc inicjalizowane wartoœci¹ null. Oraz wszystkie tablice musz¹ miec t¹ sam¹ d³ugoœæ.
 *
 * @author Komentarz - Maciej Knichal
 *
 */
public class PriceHolder {

    private double[] o;
    private double[] h;
    private double[] l;
    private double[] c;
    private double[] v;
    private double[] i;
    public final int length;
    /**
     * Konstruktor klasy. Przechowuje wszystkie dane punktów w tablicach.
     * @param O Reprezentuje tzw. open data points.
     * @param H Reprezentuje tzw. high data points.
     * @param L Reprezentuje tzw. low data points.
     * @param C Reprezentuje tzw. close data points.
     * @param V Reprezentuje tzw. volume data points.
     * @param I Reprezentuje tzw. open interest data points.
     * @throws NullPointerException Jesli tablica jest pusta.
     * @throws IllegalArgumentException Jesli tablice sa roznej dlugosci.
     */
    public PriceHolder(double[] o, double[] h, double[] l, double[] c, double[] v, double[] i) 
            throws NullPointerException, IllegalArgumentException {

        if (o==null) throw new NullPointerException(); // TODO: message
        if (h==null) throw new NullPointerException(); // TODO: message
        if (l==null) throw new NullPointerException(); // TODO: message
        if (c==null) throw new NullPointerException(); // TODO: message
        if (v==null) throw new NullPointerException(); // TODO: message
        if (i==null) throw new NullPointerException(); // TODO: message
        
        length = o.length;
        if (h.length != length) throw new IllegalArgumentException(); // TODO: message
        if (l.length != length) throw new IllegalArgumentException(); // TODO: message
        if (c.length != length) throw new IllegalArgumentException(); // TODO: message
        if (v.length != length) throw new IllegalArgumentException(); // TODO: message
        if (i.length != length) throw new IllegalArgumentException(); // TODO: message
        
        this.o = o;
        this.h = h;
        this.l = l;
        this.c = c;
        this.v = v;
        this.i = i;
    }
    /**
     * Metoda ta jest przestarza³a. U¿yj publicznej zmiennej "length".
     * @deprecated
     * @return length
     */
    public int getSize() {
        return length;
    }
    /**
     * Metoda ta przekszta³ca OHLCVI w tablicê ze wszystkimi punktami.
     * @return Object[] zawieraj¹cy wszystkie punktu OHLCVI.
     */
    public Object[] toArrays() {
        Object objs[] = new Object[6];
        int n = 0;
        objs[n++] = o;
        objs[n++] = h;
        objs[n++] = l;
        objs[n++] = c;
        objs[n++] = v;
        objs[n++] = i;
        return objs;
    }
    /**
     *  Metoda ta zwraca tablice open.
     * @return double[] z wartosciami Open.
     */
    public double[] getO() { return o; }
    /**
     * Metoda ta zwraca tablece high.
     * @return double[] z wartosciami High.
     */
    public double[] getH() { return h; }
    /**
     * Metoda ta zwraca tablece low.
     * @return double[] z wartosciami Low.
     */
    public double[] getL() { return l; }
    /**
     * Metoda ta zwraca tablece Close.
     * @return double[] z wartosciami Close.
     */
    public double[] getC() { return c; }
    /**
     * Metoda ta zwraca tablece Volume.
     * @return double[] z wartosciami Volume.
     */
    public double[] getV() { return v; }
    /**
     * Metoda ta zwraca tablece OpenInterest.
     * @return double[] z wartosciami OpenInterest.
     */
    public double[] getI() { return i; }
    
}

