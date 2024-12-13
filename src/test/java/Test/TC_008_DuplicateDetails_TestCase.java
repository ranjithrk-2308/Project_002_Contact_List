package Test;

import java.io.IOException;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.HomeScreenTONavigate;

public class TC_008_DuplicateDetails_TestCase extends ProjSpecificationContactList {
	@Test (priority = 8)
	public void duplicatedetailsTestCase () throws IOException {		

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
		.phone(prop.getProperty("cphone"))
		.address1(prop.getProperty("caddress1"))
		.address2(prop.getProperty("caddress2"))
		.city(prop.getProperty("ccity"))
		.state(prop.getProperty("cstate"))
		.postalcode(prop.getProperty("cpostalcode"))
		.country(prop.getProperty("ccountry"))
		.submitclick();
	}
}
