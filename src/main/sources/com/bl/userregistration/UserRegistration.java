package com.bl.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description Class for defining the User Registration with regex
 *
 */


public class UserRegistration {
	// constant
	public static boolean result = false;
	private static final Scanner scanner = new Scanner(System.in);
	// Regex Patterns
	private static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";
	private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";
	private static final String EMAIL_ADDRESS = "^[a-z0-9]+(([.+-_][a-z0-9])?)+(@[a-z0-9]{1})+(.[a-z]{3,4})+((.[a-z]{2})?)$";
	private static final String MOBILE_FORMAT = "^[1-9]{2} [1-9][0-9]{9}$";
	private static final String PASSWORD = "^[A-Z{1,}0-9a-z]{8,}$";

	/**
	 * @description create method for producing the Result in terms of Valid or
	 *              Invalid
	 *
	 */
	public void printingResult() {
		if (result) { // Verifying whether given Result is valid
			System.out.println("You Entered Input is Proper and Valid");
		} else {
			System.out.println("You Entered Input is inValid. Try again using Conditions");
		}
	}

	/**
	 * @description create method for First Name Validation Rule: first name starts
	 *              with Cap and has minimum 3 characters
	 *
	 */
	public UserRegistrationValidation firstNameValidation = (firstname) -> {
		if (firstname == null) {
            throw new UserRegistrationProblemException("Input can't be Null");
        } else if (firstname.length() == 0) {
            throw new UserRegistrationProblemException("Invalid Input");
        }
		// Matching the given name with regular expression
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		result = pattern.matcher(firstname).matches();
		printingResult();
		return result;
	};

	/**
	 * @description create method for First Name Validation Rule: first name starts
	 *              with Cap and has minimum 3 characters
	 *
	 */
	public UserRegistrationValidation lastNameValidation = (String lastname) -> {
		if (lastname == null) {
            throw new UserRegistrationProblemException("Input can't be Null");
        } else if (lastname.length() == 0) {
            throw new UserRegistrationProblemException("Invalid Input");
        }
		// Matching the given name with regular expression
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		result = pattern.matcher(lastname).matches();
		printingResult();
		return result;
	};

	/**
	 * @description create method for EmailAddress Validation Rules: Email has 3
	 *              mandatory parts (abc, bl & co) and 2 optional (xyz & in) with
	 *              precise @ and . positions E.g. abc.xyz@bl.co.in
	 */
	public  UserRegistrationValidation eMailAddressValidation = (eMailAddress) -> {
		if (eMailAddress == null) {
            throw new UserRegistrationProblemException("Input can't be Null");
        } else if (eMailAddress.length() == 0) {
            throw new UserRegistrationProblemException("Invalid Input");
        }
		// Matching the given Email Address with regular expression
		Pattern pattern = Pattern.compile(EMAIL_ADDRESS);
		result = pattern.matcher(eMailAddress).matches();
		printingResult();
		return result;
	};

	/**
	 * @description create method for Mobile Number Validation Rule: Country code
	 *              follow by space and 10 digit number E.g. 91 9919819801
	 */
	public UserRegistrationValidation mobileNumberValidation = (mobilenumber) -> {
		if (mobilenumber == null) {
            throw new UserRegistrationProblemException("Input can't be Null");
        } else if (mobilenumber.length() == 0) {
            throw new UserRegistrationProblemException("Invalid Input");
        }
		// Matching the given PhoneNumber with regular expression
		Pattern pattern = Pattern.compile(MOBILE_FORMAT);
		result = pattern.matcher(mobilenumber).matches();
		printingResult();
		return result;
	};

	/**
	 * @description create method for Validating Password Rule1: minimum 8
	 *              Characters Rule2:Should have at least 1 Upper Case
	 */
	public UserRegistrationValidation passwordValidation = (password) -> {
		if (password == null) {
            throw new UserRegistrationProblemException("Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationProblemException("Invalid Input");
        }
		// Matching the given password with regular expression
		Pattern pattern = Pattern.compile(PASSWORD);
		result = pattern.matcher(password).matches();
		printingResult();
		return result;
	};


}