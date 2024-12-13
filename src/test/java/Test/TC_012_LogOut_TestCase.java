package Test;
import java.io.IOException;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.HomeScreenTONavigate;

public class TC_012_LogOut_TestCase extends ProjSpecificationContactList{
	@Test (priority = 12)
		public void logout () throws IOException {
			
			HomeScreenTONavigate logout = new HomeScreenTONavigate();
			
			logout.LoginButtoncheck()
			.usernameentery(prop.getProperty("lusername"))
			.passwordentry(prop.getProperty("lpassword"))
			.loginclick()
			.logout()
			.logoutverification();
		}
}