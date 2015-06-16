package maciej_marciniszyn;


import org.junit.BeforeClass;
import org.junit.Test;

import com.tictactec.ta.lib.meta.annotation.InputParameterType;

public class TestInputParameterType {

	static InputParameterType inputparametertype;

	@BeforeClass
	public static void beforeClass() {

		InputParameterType inputparametertype;
	}

	@Test
	public void testvalues() {

		if (inputparametertype.values().equals(inputparametertype.values())) {
		}
	}

	@Test
	public void testvalueOf() {

		InputParameterType.TA_Input_Integer
				.valueOf(InputParameterType.TA_Input_Real.toString());
	}

	@Test
	public void testTA_Input_Real() {

		if (inputparametertype.TA_Input_Real
				.equals(inputparametertype.TA_Input_Real)) {
		}

	}
}