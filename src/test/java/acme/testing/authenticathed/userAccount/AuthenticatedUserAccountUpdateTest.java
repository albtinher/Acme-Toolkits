package acme.testing.authenticathed.userAccount;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.core.annotation.Order;

import acme.testing.TestHarness;


public class AuthenticatedUserAccountUpdateTest extends TestHarness {
	
	
		@ParameterizedTest
		@CsvFileSource(resources = "/authenticated/userAccount/updateUserAccount.csv", encoding = "utf-8", numLinesToSkip = 1)
		@Order(10)	
		public void updatePositive(final String username, final String password, final String name, final String surname, final String email) {	
			super.signUp(username, password, name, surname, email);

			super.clickOnMenu("Sign in");
			
			super.signIn(username, password);
			
			super.clickOnMenu("Account", "General data");
			
			
			super.fillInputBoxIn("identity.name", name+"X");
			super.fillInputBoxIn("identity.surname", surname+"X");
			super.fillInputBoxIn("identity.email", email+"X");	
			
			super.clickOnSubmit("Update");
			
			super.clickOnMenu("Account", "General data");
			
			
			super.checkInputBoxHasValue("identity.name", name+"X");
			super.checkInputBoxHasValue("identity.surname", surname+"X");
			super.checkInputBoxHasValue("identity.email", email+"X");	
		
			super.signOut();
		}
		
		@ParameterizedTest
		@CsvFileSource(resources = "/authenticated/userAccount/updateUserAccountNegative.csv", encoding = "utf-8", numLinesToSkip = 1)
		@Order(10)	
		public void updateNegative(final String username,final String password, final String name, final String surname, final String email) {		

			super.clickOnMenu("Sign in");
			
			super.signIn(username, password);
			
			super.clickOnMenu("Account", "General data");
			
			super.fillInputBoxIn("password", password);
			super.fillInputBoxIn("confirmation", password);
			super.fillInputBoxIn("identity.name", name);
			super.fillInputBoxIn("identity.surname", surname);
			super.fillInputBoxIn("identity.email", email);	
			
			super.clickOnSubmit("Update");
				
			super.checkErrorsExist();
			
			super.signOut();
		}
		

}
