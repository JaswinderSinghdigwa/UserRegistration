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
        Assert.assertTrue(registration.validPhoneNumber(""));

	}
	
	@Test
	public void Mobileno_Shouldbe_False_whenitisnotproper() {
        Assert.assertTrue(registration.validPhoneNumber("1"));

	}
	
	@Test
	public void Passwordtypeone_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validPasswordRule1("1"));

	}
	
	@Test
	public void Passwordtypeone_Shouldbe_False_whenitisproper() {
        Assert.assertFalse(registration.validPasswordRule1(""));

	}
	
	@Test
	public void Passwordtypetwo_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validPasswordRule1("Password@12"));

	}
	
	@Test
	public void Passwordtypetwo_Shouldbe_False_whenitisnotproper() {
        Assert.assertFalse(registration.validPasswordRule1("12"));

	}
	@Test
	public void Passwordtypethree_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validPasswordRule3("123passW@12"));

	}
	
	public void Passwordtypethree_Shouldbe_False_whenitisnotproper() {
        Assert.assertFalse(registration.validPasswordRule3("12"));
	}
	
	@Test
	public void Passwordtypefour_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validPasswordRule3("123passW@12."));

	}

	public void Passwordtypefour_Shouldbe_False_whenitisnotproper() {
        Assert.assertFalse(registration.validPasswordRule3("12"));
	}

}