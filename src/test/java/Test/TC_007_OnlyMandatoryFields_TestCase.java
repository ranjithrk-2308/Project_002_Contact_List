package Test;

import java.io.IOException;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.AddcontactlistwithMandatoryFields;
import Pages.HomeScreenTONavigate;

public class TC_007_OnlyMandatoryFields_TestCase  extends ProjSpecificationContactList{
	@Test(priority = 7)
	public void onlymandatoryfieldsTestCase () throws IOException {
		
		HomeScreenTONavigate only = new HomeScreenTONavigate();
		only.LoginButtoncheck()
		.usernameentery(prop.getProperty("lusername"))
		.passwordentry(prop.getProperty("lpassword"))
		.loginclick();
		AddcontactlistwithMandatoryFields mandatory = new AddcontactlistwithMandatoryFields();
		mandatory.addcontactclick()
		.addfirstname(prop.getProperty("mfirstname"))
		.addlastname(prop.getProperty("mlastname"))
		.submitclick();
	}
}
