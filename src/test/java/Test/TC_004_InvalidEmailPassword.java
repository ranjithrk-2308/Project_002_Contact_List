package Test;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.HomeScreenTONavigate;

public class TC_004_InvalidEmailPassword extends ProjSpecificationContactList{
	
	@Test  (priority = 4)
	public void invalidlogintest () {
		
		HomeScreenTONavigate invalid = new HomeScreenTONavigate();
			invalid.LoginButtoncheck()
			.usernameentery(prop.getProperty("iusername"))
			.passwordentry(prop.getProperty("ipassword"))
			.loginclick()
			.invalidlogincheck();
		}
}