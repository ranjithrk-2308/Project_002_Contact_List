package Test;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.HomeScreenTONavigate;

public class TC_001_SignUp_TestCase extends ProjSpecificationContactList{
	
	@Test  (priority = 1)
	public void SignUpTestCase () throws InterruptedException {
		
		HomeScreenTONavigate signup = new HomeScreenTONavigate();
		signup.SignUpClick()
		.signupfirstname(prop.getProperty("sfirstname"))
		.lastnameentry(prop.getProperty("slastname"))
		.emailentery(prop.getProperty("semail"))
		.passwordentry(prop.getProperty("spassword"))
		.submitclick()
		.headingcheck();
	}
}