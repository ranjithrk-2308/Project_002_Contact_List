package Test;

import java.io.IOException;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.CheckingTheCorrectDetailsHaveEntered;
import Pages.HomeScreenTONavigate;

public class TC_010_CheckingAfterSuccessfulladdcontact_TestCase extends ProjSpecificationContactList {
	@Test	(priority = 10)
		public void checkthecontactadded () throws IOException {
			
			HomeScreenTONavigate login = new HomeScreenTONavigate();
			
			login.LoginButtoncheck()
			.usernameentery(prop.getProperty("lusername"))
			.passwordentry(prop.getProperty("lpassword"))
			.loginclick();
			login.signupclick()
			.firstname(prop.getProperty("cfirstname"))
			.lastname(prop.getProperty("clastname"))
			.DOB(prop.getProperty("cdob"))
			.email(prop.getProperty("cemail"))
			.phone(prop.getProperty("cphone"))
			.address1(prop.getProperty("caddress1"))
			.address2(prop.getProperty("caddress2"))
			.city(prop.getProperty("ccity"))
			.state(prop.getProperty("cstate"))
			.postalcode(prop.getProperty("cpostalcode"))
			.country(prop.getProperty("ccountry"))
			.submitclick();
			
			CheckingTheCorrectDetailsHaveEntered check = new CheckingTheCorrectDetailsHaveEntered();
			check.checkingthedetailsmatch();
		}
}		