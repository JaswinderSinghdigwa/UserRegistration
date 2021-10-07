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
			boolean result = registration.firstNameValidation("Jaswinder");
			Assert.assertEquals(true, result);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}
	}

	@Test
	public void Firstname_Shouldbe_False_whenitisnotproper() {
		try {
			boolean result = registration.firstNameValidation("Si");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Lastname_Shouldbe_True_whenitisproper() {
		try {
			boolean result = registration.lastNameValidation("Singh");
			Assert.assertEquals(result, true);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Lastname_Shouldbe_False_whenitisnotproper() {
		try {
			boolean result = registration.lastNameValidation("Don");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Email_Shouldbe_True_whenitisproper() {
		try {
			boolean result = registration.validEmail("abc@gmail.com.in");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Email_Shouldbe_False_whenitisnotproper() {
		try {
			boolean result = registration.validEmail("#abc@gmail.com.in");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}
	
	@Test
	public void Mobileno_Shouldbe_True_whenitisproper() {
		try {
			boolean result = registration.validPhoneNumber("91 984685248");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void Mobileno_Shouldbe_False_whenitisnotproper() {
		try {
			boolean result = registration.validPhoneNumber("91 9667914789");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}
	}

}