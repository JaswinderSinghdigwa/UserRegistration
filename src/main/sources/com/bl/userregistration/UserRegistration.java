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
	 * @description create method for First Name Validation
     * Rule: first name starts with Cap and has minimum 3 characters
     *
     */
    
    public boolean firstNameValidation(String firstname) throws UserRegistrationProblemException{
        //Matching the given name with regular expression
			if (firstname == "1" || firstname.length() == 0) // Verifying whether given Result is valid
				throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
			String regex = "^[A-Z][a-z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(firstname);
			return matcher.matches();
    }
    
    /**
     * @description create method for First Name Validation
     * Rule: first name starts with Cap and has minimum 3 characters
     *
     */
    
    public boolean lastNameValidation(String lastname)throws UserRegistrationProblemException{
			if (lastname == null || lastname.length() == 0) // Verifying whether given Result is valid
					throw new UserRegistrationProblemException("\nYou Entered Number or null is not Proper and Valid");
	        String regex1 = "^[A-Z]{1}[a-z]{3,10}$";
	        Pattern pattern1 = Pattern.compile(regex1);
	        Matcher matcher1 = pattern1.matcher(lastname);
	        return (matcher1.matches());
    }
}