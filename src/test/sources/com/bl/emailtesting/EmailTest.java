package com.bl.emailtesting;

import com.bl.userregistration.UserRegistration;
import com.bl.userregistration.UserRegistrationProblemException;
import com.bl.userresgistrationtest.UserRegistrationTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {
	private String email;
	private boolean expectedResult;

	public EmailTest(String email, boolean expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}
	
	UserRegistration registration = new UserRegistration();
	@Parameterized.Parameters
	public static Collection emailIdsExpectedResult() throws UserRegistrationProblemException {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com.com", true },
				{ "abc+100c@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.", false },

		});
	}
	
	

	@Test
	public void givenEmailIds_withExpectedResult_shouldPassAllTheTestCases() {
		try {
			boolean result = registration.validemailId(this.email);
			Assert.assertEquals(this.expectedResult, result);
		} catch (UserRegistrationProblemException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenEmail1_EMPTY_ShouldThrowUserRegistrationException() {
		try {
			boolean nullstring = registration.validemailId("");
			Assert.assertEquals(nullstring, false);
		} catch (UserRegistrationProblemException e) {

			System.out.println(e);
		}
	}
}