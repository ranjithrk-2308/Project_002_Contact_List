package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.ProjSpecificationContactList;
import Pages.HomeScreenTONavigate;

public class TC_005_SignUpContactListAdd_TestCase extends ProjSpecificationContactList{

	@Test(priority = 5)
	public void Signuptestcase () throws IOException {
			
		HomeScreenTONavigate signup = new HomeScreenTONavigate();
		signup.LoginButtoncheck()
		.usernameentery(prop.getProperty("lusername"))
		.passwordentry(prop.getProperty("lpassword"))
		.loginclick();
		signup.signupclick()
		.firstname(prop.getProperty("cfirstname"))
		.lastname(prop.getProperty("clastname"))
		.DOB(prop.getProperty("cdob"))
		.email(prop.getProperty("cemail"))
		.address1(prop.getProperty("caddress1"))
		.address2(prop.getProperty("caddress2"))
		.city(prop.getProperty("ccity"))
		.state(prop.getProperty("cstate"))
		.postalcode(prop.getProperty("cpostalcode"))
		.country(prop.getProperty("ccountry"))
		.submitclick();
	}	
}
