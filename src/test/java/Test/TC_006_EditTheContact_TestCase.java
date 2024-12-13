package Test;
import java.io.IOException;
import org.testng.annotations.Test;
import Base.ProjSpecificationContactList;
import Pages.HomeScreenTONavigate;

public class TC_006_EditTheContact_TestCase extends ProjSpecificationContactList {
	@Test(priority = 6)
	
	public void editcontactTestcase () throws IOException, InterruptedException {
		
		HomeScreenTONavigate edit = new HomeScreenTONavigate();
		edit.LoginButtoncheck()
		.usernameentery(prop.getProperty("lusername"))
		.passwordentry(prop.getProperty("lpassword"))
		.loginclick();
		edit.editcontact()
		.clicktoedit()
		.editbuttonclick()
		.editphonenumber(prop.getProperty("ephone"))
		.submitedit();
	}
}
