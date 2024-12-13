package Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.HomeScreenTONavigate;

public class TC_003_VerifyingWeatherSwitchingtoContact_TestCase extends ProjSpecificationContactList{
	
	@Test	 (priority = 3)
	public void logintocontactscreenTestCase ()  {
		
		HomeScreenTONavigate switchto = new HomeScreenTONavigate();
		switchto.LoginButtoncheck()
		.usernameentery(prop.getProperty("lusername"))
		.passwordentry(prop.getProperty("lpassword"))
		.loginclick().
		redirectstocontactlist();
	}
}
