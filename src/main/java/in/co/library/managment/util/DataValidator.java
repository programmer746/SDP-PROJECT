package in.co.library.managment.util;

import java.text.ParseException;
import java.util.Date;


public class DataValidator {
	
	public static boolean isName(String val) {

		String name = "^[A-Za-z ]*$";
		/*
		 * if (isNotNull(val)) { return val.matches(name);
		 * 
		 * } else { return false; }
		 */
		if (val.matches(name)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public static boolean isPassword(String val) {
		String passregex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[\\S])[A-Za-z0-9\\S]{6,12}$";

		if (val.matches(passregex)) {
			return true;
		} else {
			return false;
		}
	}


	public static boolean isPhoneNo(String val) {
		String regex = "^[7-9][0-9]{9}$";
		if (val.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}


	public static boolean isNull(String val) {
		if (val == null || val.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	
	public static boolean isNotNull(String val) {
		return !isNull(val);
	}


	public static boolean isInteger(String val) {

		if (isNotNull(val)) {
			try {
				int i = Integer.parseInt(val);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}

	public static boolean isLong(String val) {
		if (isNotNull(val)) {
			try {
				long i = Long.parseLong(val);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}

	/*public static boolean isIntegerName(String val) {
		String match = "^[0-9]{3}$";

		if (val.matches(match)) {
			return true;
		} else {
			return false;
		}

	}*/

	
	public static boolean isEmail(String val) {

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		if (isNotNull(val)) {
			try {
				return val.matches(emailreg);
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}


	public static boolean isDate(String val) {

		Date d = null;
		if (isNotNull(val)) {
			d = DataUtility.getDate(val);
		}
		return d != null;
	}

	public static void main(String[] args) {

		// System.out.println(isPhoneNo("1234567abc"));

		/*
		 * System.out.println("Not Null 2" + isNotNull("ABC"));
		 * System.out.println("Not Null 3" + isNotNull(null));
		 * System.out.println("Not Null 4" + isNull("123"));
		 * 
		 * System.out.println("Is Int " + isInteger(null)); System.out.println(
		 * "Is Int " + isInteger("ABC1")); System.out.println("Is Int " +
		 * isInteger("123")); System.out.println("Is Int " + isNotNull("123"));
		 */
		// System.out.println(isPhoneNo("9926913693"));
		// System.out.println(isName("rohan jain"));
		System.out.println(isInteger("87"));
		System.out.println("os password :"+isPassword("Manoj@123"));

	}

}