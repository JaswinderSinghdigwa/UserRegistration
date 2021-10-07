package com.bl.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description Class for defining the User Registration with regex
 *
 */
public class UserRegistration {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * @throws UserRegistrationProblemException 
	 * @description create method for First Name Validation Rule: first name starts
	 *              with Cap and has minimum 3 characters
	 *
	 */

	public boolean firstNameValidation(String firstname) throws UserRegistrationProblemException {
	        if (firstname == null || firstname.length() == 0) 
	            throw new UserRegistrationProblemException("You Entered Input is Invalid");
	            String regex = "^[A-Z]{1}[a-z]{2,}$";
	            Pattern pattern = Pattern.compile(regex);
	            Matcher matcher = pattern.matcher(firstname);
	            return matcher.matches();
	    }
}