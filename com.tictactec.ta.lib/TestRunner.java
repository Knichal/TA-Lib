package AndrzejMatysiak;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestMInteger.class);
		Result result1 = JUnitCore.runClasses(TestCoreMetaInfo.class);
		Result result2 = JUnitCore.runClasses(TestCoreMetaDataCompatibility.class);
		Result result3 = JUnitCore.runClasses(TestCore.class);
		Result result4 = JUnitCore.runClasses(TestPriceHolder.class);
		Result result5 = JUnitCore.runClasses(TestCoreAnnotated.class);
		
		for (Failure f: result.getFailures()){
			System.out.println(f.toString());
		}
		System.out.println(result.wasSuccessful());
	
		
		for (Failure f: result1.getFailures()){
			System.out.println(f.toString());
		}
		System.out.println(result1.wasSuccessful());
		
		for (Failure f: result2.getFailures()){
			System.out.println(f.toString());
		}
		System.out.println(result2.wasSuccessful());
		
		for (Failure f: result3.getFailures()){
			System.out.println(f.toString());
		}
		System.out.println(result3.wasSuccessful());
		
		for (Failure f: result4.getFailures()){
			System.out.println(f.toString());
		}
		System.out.println(result4.wasSuccessful());
	
		for (Failure f: result5.getFailures()){
			System.out.println(f.toString());
		}
		System.out.println(result5.wasSuccessful());
	
	}

}
