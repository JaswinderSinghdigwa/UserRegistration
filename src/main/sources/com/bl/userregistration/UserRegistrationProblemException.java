package com.bl.userregistration;
/**
 * Purpose  - As a User need to enter a valid Firstname
 * @author  - JaswinderSingh
 * @version - 16.0
 * @since   - 2021-10-02
 */

/**
 * @description Class for defining the User Registration Problem Exception
 *
 */
	
	public class UserRegistrationProblemException extends Exception {
	    /**
	     * @description Constructor for defining the User Registration Problem Exception
	     *
	     */
	    public UserRegistrationProblemException(String message) {
	        super(message);
	    }
	    
	    public static void main(String[] args) {
	        System.out.println("Welcome to User Registration Program"); //Printing the Welcome Message
	        UserRegistration userregistration = new UserRegistration();
//	        userregistration.firstNameValidation();
    }
}