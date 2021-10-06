package com.bl.userresgistrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.bl.userregistration.UserRegistration;

public class UserRegistrationTest {
	UserRegistration registration = new UserRegistration();
	
	@Test
    public void Firstname_Shouldbe_True_whenitisproper() {
     Assert.assertTrue(registration.firstNameValidation("1"));
    }
	
	@Test
	public void Firstname_Shouldbe_False_whenitisnotproper() {
	     Assert.assertFalse(registration.firstNameValidation(""));

	}
	
	@Test
    public void Lastname_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validLastName("1"));

    }

	@Test
	public void Lastname_Shouldbe_False_whenitisnotproper() {
	     Assert.assertFalse(registration.validLastName(""));

	}


}