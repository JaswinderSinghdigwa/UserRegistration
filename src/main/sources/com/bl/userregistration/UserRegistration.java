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
		// Matching the given name with regular expression
		if (firstname == "1" || firstname.length() == 0) // Verifying whether given Result is valid
			throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstname);
		return matcher.matches();
	}

	/**
	 * @description create method for First Name Validation Rule: first name starts
	 *              with Cap and has minimum 3 characters
	 *
	 */

	public boolean lastNameValidation(String lastname) throws UserRegistrationProblemException {
		if (lastname == null || lastname.length() == 0) // Verifying whether given Result is valid
			throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
		String regex1 = "^[A-Z]{1}[a-z]{3,10}$";
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(lastname);
		return (matcher1.matches());
	}

	/*
	 * @description create method for EmailAddress Validation Rules: Email has 3
	 * mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and .
	 * positions E.g. abc.xyz@bl.co.in
	 */

	public boolean validEmail(String email) throws UserRegistrationProblemException {
		if (email == null || email.length() == 0) // Verifying whether given Result is valid
			throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
		String regex2 = "^A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(email);
		return matcher2.matches();
	}

	/**
	 * @description create method for Mobile Number Validation Rule: Country code
	 *              follow by space and 10 digit number E.g. 91 9919819801
	 */

	public boolean validPhoneNumber(String mobileno) throws UserRegistrationProblemException {
		if (mobileno == null || mobileno.length() == 0) // Verifying whether given Result is valid
			throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
		String regex3 = "^(0/91)?[7-9][0-9]{10}$";
		Pattern pattern3 = Pattern.compile(regex3);
		Matcher matcher3 = pattern3.matcher(mobileno);
		return matcher3.matches();
	}

	/**
	 * @throws UserRegistrationProblemException
	 * @description create method for Validating Password Rule1: minimum 8
	 *              Characters Rule2:Should have at least 1 Upper Case Rule3:Should
	 *              have at least 1 Numerical Number Rule4: should have at least 1
	 *              Special Character
	 */
	public boolean validPasswordRule1(String password) throws UserRegistrationProblemException {
		if (password == null || password.length() == 0) // Verifying whether given Result is valid
			throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
		String regex4 = "^[A-Z a-z 0-9]{8,}$";
		Pattern pattern4 = Pattern.compile(regex4);
		Matcher matcher4 = pattern4.matcher(password);
		return matcher4.matches();
	}

	/**
	 * @throws UserRegistrationProblemException
	 * @description create method for Validating Password Rule1: minimum 8
	 *              Characters Rule2:Should have at least 1 Upper Case Rule3:Should
	 *              have at least 1 Numerical Number Rule4: should have at least 1
	 *              Special Character
	 */

	public boolean validPasswordRule2(String password1) throws UserRegistrationProblemException {
		if (password1 == null || password1.length() == 0) // Verifying whether given Result is valid
			throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
		String regex5 = "^[A-Z]{1}+[a-zA-z0-9]{8,}$";
		Pattern pattern5 = Pattern.compile(regex5);
		Matcher matcher5 = pattern5.matcher(password1);
		return (matcher5.matches());
	}

	/**
	 * @throws UserRegistrationProblemException
	 * @description create method for Validating Password Rule1: minimum 8
	 *              Characters Rule2:Should have at least 1 Upper Case Rule3:Should
	 *              have at least 1 Numerical Number Rule4: should have at least 1
	 *              Special Character
	 */

	public boolean validPasswordRule3(String password2) throws UserRegistrationProblemException {
		if (password2 == null || password2.length() == 0) // Verifying whether given Result is valid
			throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
		String regex6 = "^[A-Z]{1}+[0-9].{8,}$";
		Pattern pattern6 = Pattern.compile(regex6);
		Matcher matcher6 = pattern6.matcher(password2);
		return matcher6.matches();
	}
	
	/**
	 * @throws UserRegistrationProblemException
	 * @description create method for Validating Password Rule1: minimum 8
	 *              Characters Rule2:Should have at least 1 Upper Case Rule3:Should
	 *              have at least 1 Numerical Number Rule4: should have at least 1
	 *              Special Character
	 */

    public  boolean validPasswordRule4(String password3) throws UserRegistrationProblemException{
    	if (password3 == null || password3.length() == 0) // Verifying whether given Result is valid
			throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
        String regex6 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(password3);
        return matcher6.matches();
    }

   /* @description create method for EmailAddress Validation Ru
	 * mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and .
	 * positions E.g. abc.xyz@bl.co.in and partmerizised verify email
	 */
    
    public boolean validemailId(String email) throws UserRegistrationProblemException {
    	if (email == null || email.length() == 0) // Verifying whether given Result is valid
			throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}