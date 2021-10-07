package com.bl.userresgistrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.bl.moodanalyser.MoodAnalyser;
import com.bl.userregistration.UserRegistration;
import com.bl.userregistration.UserRegistrationProblemException;

public class UserRegistrationTest {
	UserRegistration registration = new UserRegistration();

	@Test
	public void Firstname_Shouldbe_True_whenitisproper() {
		try {
            boolean result = registration.firstNameValidation("");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationProblemException e) {
            System.out.println(e);
        }
	}

	@Test
	public void Firstname_Shouldbe_False_whenitisnotproper() {
		try {
            boolean result = registration.firstNameValidation("");
        	Assert.assertEquals(result,false);
        } catch (UserRegistrationProblemException e) {
            System.out.println(e);
        }
	
	}
}