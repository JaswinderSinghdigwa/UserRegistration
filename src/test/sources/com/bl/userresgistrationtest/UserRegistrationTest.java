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
	
	@Test
	public void Email_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validEmail(""));

	}
	
	@Test
	public void Email_Shouldbe_False_whenitisnotproper() {
	     Assert.assertFalse(registration.validEmail("1"));

	}
	
	@Test
	public void Mobileno_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validPhoneNumber("919666983674"));

	}
	
	@Test
	public void Mobileno_Shouldbe_True_whenitisnotproper() {
        Assert.assertTrue(registration.validPhoneNumber("91966698367421"));

	}


}