package Pages;
import org.openqa.selenium.By;
import Base.ProjSpecificationContactList;

public class AddcontactlistwithMandatoryFields extends ProjSpecificationContactList{
	
	public AddcontactlistwithMandatoryFields addcontactclick () {
		driver.findElement(By.id("add-contact")).click();
		return this;
	}
	
	public AddcontactlistwithMandatoryFields addfirstname (String mfirstname) {
		driver.findElement(By.id("firstName")).sendKeys(mfirstname);
		return this;
	}
	public AddcontactlistwithMandatoryFields addlastname (String mlastname) {
		driver.findElement(By.id("lastName")).sendKeys(mlastname);
		return this;
	}
	public AddcontactlistwithMandatoryFields submitclick() {
		driver.findElement(By.id("submit")).click();
		return this;
	}
}
