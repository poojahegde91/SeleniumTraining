package seleniumBasics;

public class Verify {

	public static boolean equalValues(String ActualValue, String ExpectedValue) {
		if (ActualValue.equals(ExpectedValue)) {
			System.out.println(ActualValue + " is equal to " + ExpectedValue);
			return true;
		} else {
			System.out.println(ActualValue + " is not equal to " + ExpectedValue);
			return false;
		}

	}

	public static boolean containsValues(String ActualValue, String ExpectedValue) {
		if (ActualValue.equals(ExpectedValue)) {
			System.out.println(ActualValue + " contains " + ExpectedValue);
			return true;
		} else {
			System.out.println(ActualValue + " not contains " + ExpectedValue);
			return false;
		}

	}

}
