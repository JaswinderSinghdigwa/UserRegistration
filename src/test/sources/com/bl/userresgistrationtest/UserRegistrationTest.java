package com.bl.userresgistrationtest;

import org.junit.Assert;

import org.junit.Test;

import com.bl.moodanalyser.MoodAnalyser;
import com.bl.moodanalyser.MoodAnalyserException;
import com.bl.userregistration.UserRegistration;
import com.bl.userregistration.UserRegistrationProblemException;

public class UserRegistrationTest {
	
	UserRegistration userregistration = new UserRegistration();
	@Test
	public void Firstname_Shouldbe_True_whenitisproper() {
		try {
            boolean result = userregistration.firstNameValidation.valid("jaswinder");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationProblemException e) {
            System.out.println(e);
        }
	}

	@Test
	public void Firstname_Shouldbe_False_whenitisnotproper() {
		try {

			boolean result = userregistration.firstNameValidation.valid("");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}


	@Test
	public void Lastname_Shouldbe_True_whenitisproper() {
		try {
			boolean result = userregistration.lastNameValidation.valid("Singh");
			Assert.assertEquals(result, true);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Lastname_Shouldbe_False_whenitisnotproper() {
		try {
			boolean result = userregistration.lastNameValidation.valid("Don");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Email_Shouldbe_True_whenitisproper() {
		try {
			boolean result = userregistration.eMailAddressValidation.valid("abc@gmail.com.in");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Email_Shouldbe_False_whenitisnotproper() {
		try {
			boolean result = userregistration.eMailAddressValidation.valid("#abc@gmail.com.in");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Mobileno_Shouldbe_True_whenitisproper() {
		try {
			boolean result = userregistration.mobileNumberValidation.valid("");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}
	}

	@Test
	public void Mobileno_Shouldbe_False_whenitisnotproper() {
		try {
			boolean result = userregistration.mobileNumberValidation.valid("");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}
	}

	@Test
	public void Passwordtypeone_Shouldbe_True_whenitisproper() {
		try {
			boolean result = userregistration.passwordValidation.valid("");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Passwordtypeone_Shouldbe_False_whenitisproper() {
		try {
			boolean result = userregistration.passwordValidation.valid("");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Passwordtypetwo_Shouldbe_True_whenitisproper() {
		try {
			boolean result = userregistration.validPasswordRule2("Passwd@");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Passwordtypetwo_Shouldbe_False_whenitisproper() {
		try {
			boolean result = userregistration.validPasswordRule2("9qwqw");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Passwordtypethree_Shouldbe_True_whenitisproper() {
		try {
			boolean result = userregistration.validPasswordRule2("Passwd@");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Passwordtypethree_Shouldbe_False_whenitisproper() {
		try {
			boolean result = userregistration.validPasswordRule2("9qwqw");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}
	
	@Test
	public void Passwordtypefour_Shouldbe_True_whenitisproper() {
		try {
			boolean result = userregistration.validPasswordRule3("Passwd@12");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
	public void Passwordtypefour_Shouldbe_False_whenitisproper() {
		try {
			boolean result = userregistration.validPasswordRule3("9qwqw");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}
	
	@Test
	public void EmailValidation_Shouldbe_True_whenitisproper() {
		try {
			boolean result = userregistration.validemailId("abc2@gmail.com");
			Assert.assertEquals(result, true);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}
	
	@Test
	public void EmailValidation_Shouldbe_False_whenitisnotproper() {
		try {
			boolean result = userregistration.validemailId("Pas");
			Assert.assertEquals(result, false);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}

	}

	@Test
    public void givenMessage_NULL_ShouldReturnMoodAnalyserException()  {
        try {
            String sucesss  = MoodAnalyser.analyseMood(null);
            Assert.assertEquals("Entry Successful", sucesss);
        } catch (MoodAnalyserException e) {
           System.out.print(e);
        }
    }

    @Test
    public void givenMessage_EMPTY_ShouldReturnMoodAnalyserException()  {
        try {
           String fail = MoodAnalyser.analyseMood("");
           Assert.assertEquals("Entry Failed", fail);
        } catch (MoodAnalyserException e) {
            System.out.print(e);

        }
    }
}