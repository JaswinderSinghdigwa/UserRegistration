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
     * @description create method for First Name Validation
     * Rule: first name starts with Cap and has minimum 3 characters
     *
     */
    
    public boolean firstNameValidation(String firstname){
    	int number = (int)(Math.random());
        //Matching the given name with regular expression
    	try {
			if (firstname == "1" || firstname.length() == 0) // Verifying whether given Result is valid
				throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
			String regex = "^[A-Z][a-z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(firstname);
			return matcher.matches();
        }
    	catch(UserRegistrationProblemException e) {
    		System.out.println(e.getMessage());
    	}
    	return false;
    }
    
    /**
     * @description create method for First Name Validation
     * Rule: first name starts with Cap and has minimum 3 characters
     *
     */
    
    public boolean validLastName(String lastname){
    	try {
			if (lastname == "1" || lastname.length() == 0) // Verifying whether given Result is valid
					throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
	        String regex1 = "^[A-Z]{1}[a-z]{3,10}$";
	        Pattern pattern1 = Pattern.compile(regex1);
	        Matcher matcher1 = pattern1.matcher(lastname);
	        return (matcher1.matches());
    	}
    	catch(UserRegistrationProblemException e) {
    		System.out.println(e.getMessage());
    	}
    	return false;
    }
    
    /**
     * @description create method for EmailAddress Validation
     * Rules: Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with
     * precise @ and . positions
     * E.g. abc.xyz@bl.co.in
     */
    
    public boolean validEmail(String email){
    	try {
			if (email == "1" || email.length() == 0) // Verifying whether given Result is valid
					throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
	        String regex2 = "^[a-z0-9]+(([.+-_][a-z0-9])?)+(@[a-z0-9]{1})+(.[a-z]{3,4})+((.[a-z]{2})?)$";
	        Pattern pattern2 = Pattern.compile(regex2);
	        Matcher matcher2 = pattern2.matcher(email);
	        return matcher2.matches();
    	}
    	catch(UserRegistrationProblemException e) {
    		System.out.println(e.getMessage());
    	}
    	return false;
    }
    
    /**
     * @description Main method to create the objects and for calling the methods
     * @param args
     */
    
    public boolean validPhoneNumber(String mobileno){
    	try {
			if (mobileno == "1" || mobileno.length() == 0) // Verifying whether given Result is valid
					throw new UserRegistrationProblemException("\nYou InvalidString or null is not Proper and Valid");
        String regex3 = "^[1-9]{2} [1-9][0-9]{9}$";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(mobileno);
        return matcher3.matches();
    	}
    	catch(UserRegistrationProblemException e) {
    		System.out.println(e.getMessage());
    	}
    	return false;
    }
    
    /**
     * @description create method for Validating Password
     * Rule1: minimum 8 Characters
     *
     */
    
    public boolean validPasswordRule1(String password){
    	try {
			if (password == "1" || password.length() == 0) // Verifying whether given Result is valid
					throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
        String regex4 = "^[A-Z0-9a-z]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(password);
        return matcher4.matches();
    	}
    	catch(UserRegistrationProblemException e) {
    		System.out.println(e.getMessage());
    	}
    	return false;
    	
    }
}