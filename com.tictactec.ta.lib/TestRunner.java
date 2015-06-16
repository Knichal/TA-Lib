package strawinska.magda;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {

		Result result1 = JUnitCore.runClasses(TestCandleSetting.class);
		for (Failure f : result1.getFailures()) {
			System.out.println(f.toString());
		}
		System.out.println(result1.wasSuccessful());
		
		
		
		Result result2 = JUnitCore.runClasses(TestCandleSettingType.class);
		for (Failure f : result2.getFailures()) {
			System.out.println(f.toString());
			}
		System.out.println(result2.wasSuccessful());
		
		
		
		Result result3 = JUnitCore.runClasses(TestCompatibility.class);
		for (Failure f : result3.getFailures()) {
			System.out.println(f.toString());
		}
		System.out.println(result3.wasSuccessful());
		
		
		
		Result result4 = JUnitCore.runClasses(TestCore.class);
		for (Failure f : result4.getFailures()) {
			System.out.println(f.toString());
		}
		System.out.println(result4.wasSuccessful());
		
		
		Result result5 = JUnitCore.runClasses(TestCoreAnnotated.class);
		for (Failure f : result5.getFailures()) {
			System.out.println(f.toString());
		}
		System.out.println(result5.wasSuccessful());
		
		
		
		Result result6 = JUnitCore.runClasses(TestFuncUnstld.class);
		for (Failure f : result6.getFailures()) {
			System.out.println(f.toString());
		}
		System.out.println(result6.wasSuccessful());
		
		
		
		Result result7 = JUnitCore.runClasses(TestMAType.class);
		for (Failure f : result7.getFailures()) {
			System.out.println(f.toString());
		}
		System.out.println(result7.wasSuccessful());
		
		
	}
	
}

