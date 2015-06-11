package strawinska.magda;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.CandleSetting;
import com.tictactec.ta.lib.Compatibility;
import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.FuncUnstId;
import com.tictactec.ta.lib.MAType;

public class TestMAType {

	static MAType maType;

	
	@Test
	public void testDema() {
			if (maType.Dema.equals(maType.Dema)) {
			}
		}
	
	@Test
	public void testEma() {
			if (maType.Ema.equals(maType.Ema)) {
			}
		}

	@Test
	public void testKama() {
			if (maType.Kama.equals(maType.Kama)) {
			}
		}
	
	@Test
	public void testMama() {
			if (maType.Mama.equals(maType.Mama)) {
			}
		}
	
	@Test
	public void testSma() {
			if (maType.Sma.equals(maType.Sma)) {
			}
		}
	
	@Test
	public void testT3() {
			if (maType.T3.equals(maType.T3)) {
			}
		}
	
	@Test
	public void testTema() {
			if (maType.Tema.equals(maType.Tema)) {
			}
		}
	
	@Test
	public void testTrima() {
			if (maType.Trima.equals(maType.Trima)) {
			}
		}
	
	@Test
	public void testWma() {
			if (maType.Wma.equals(maType.Wma)) {
				
			}
		}
	
	
	@Test
	public void testValues() {
			maType.values();
				
			}
	
	
	@Test
	public void testValueOf() {
		
		maType.valueOf(MAType.Dema.toString());
		maType.valueOf(MAType.Ema.toString());
		maType.valueOf(MAType.Kama.toString());
		maType.valueOf(MAType.Mama.toString());
		maType.valueOf(MAType.Sma.toString());
		maType.valueOf(MAType.T3.toString());
		maType.valueOf(MAType.Tema.toString());
		maType.valueOf(MAType.Trima.toString());
		maType.valueOf(MAType.Wma.toString());
	}
	

		}
	
	

