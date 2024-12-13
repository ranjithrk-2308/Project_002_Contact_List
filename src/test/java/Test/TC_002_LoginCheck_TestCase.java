package Test;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.HomeScreenTONavigate;

public class TC_002_LoginCheck_TestCase extends ProjSpecificationContactList{
	
	
@Test  (priority = 2)
	public void LoginCheckTestCase () throws IOException {	
	
		HomeScreenTONavigate login = new HomeScreenTONavigate();
		login.LoginButtoncheck()
		.usernameentery(prop.getProperty("lusername"))
		.passwordentry(prop.getProperty("lpassword"))
		.loginclick();
	}
}