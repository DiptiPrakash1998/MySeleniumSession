package seleniumSessions;

public class Verify {

	public static boolean equalValues(String actValues, String expValues) {
		if (actValues.equals(expValues)) {
			return true;
		}
		return false;
	}

	public static boolean containValues(String actValues, String expValues) {
		if (actValues.equals(expValues)) {
			return true;
		}
		return false;
	}

}
