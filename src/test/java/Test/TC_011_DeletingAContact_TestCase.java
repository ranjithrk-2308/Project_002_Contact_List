package Test;
import java.io.IOException;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.DeletingAContact;
import Pages.HomeScreenTONavigate;

public class TC_011_DeletingAContact_TestCase extends ProjSpecificationContactList {
	@Test (priority = 11)
		public void deletecontactTestCase () throws IOException {	
		
			HomeScreenTONavigate login = new HomeScreenTONavigate();
			login.LoginButtoncheck()
			.usernameentery(prop.getProperty("lusername"))
			.passwordentry(prop.getProperty("lpassword"))
			.loginclick();
			
			DeletingAContact delete = new DeletingAContact();
			delete.clickingacontact()
			.deletecontactclick()
			.switchtoconfirmation();
		}
}