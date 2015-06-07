package strawinska.magda;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tictactec.ta.lib.Compatibility;

public class TestCompatibility {

	static Compatibility compatibility;

	@Test
	public void test() {
		if (compatibility.Default.equals(compatibility.Default)) {
		}
	}
	
	
	@Test
	public void test2() {
		if (compatibility.Metastock.equals(compatibility.Metastock)) {
		}
	}

}
