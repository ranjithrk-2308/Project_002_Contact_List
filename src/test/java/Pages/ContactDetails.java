package Pages;
import org.openqa.selenium.By;
import Base.ProjSpecificationContactList;

public class ContactDetails extends ProjSpecificationContactList{
	
	public ContactDetails firstname (String cfirstname) {
		driver.findElement(By.id("firstName")).sendKeys(cfirstname);
		return this;
	}
	public ContactDetails lastname (String clastname) {
		driver.findElement(By.id("lastName")).sendKeys(clastname);
		return this;
	}
	public ContactDetails DOB (String cdob) {
		driver.findElement(By.id("birthdate")).sendKeys(cdob);
		return this;
	}
	public ContactDetails invalidformatdate (String invaliddate) {
		driver.findElement(By.id("birthdate")).sendKeys(invaliddate);
		return this;
	}
	// Checking the error message for invalid date format: 
	
	public ContactDetails errormessageforinvalidformat () throws InterruptedException {
				
		String expected = "Add Contact";
		String actual = driver.findElement(By.xpath("//h1[text()='Add Contact']")).getText();
		if (actual.equals(expected)) {
			System.out.println("The error message is matching : ");
		}else {
			System.out.println("The error message is not matching : ");
		}
		return this;
	}
	
	
	public ContactDetails email (String cemail) {
		driver.findElement(By.id("email")).sendKeys(cemail);
		return this;
	}
	public ContactDetails phone (String cphone) {
		driver.findElement(By.id("phone")).sendKeys(cphone);
		return this;
	}
	public ContactDetails address1 (String caddress1) {
		driver.findElement(By.id("street1")).sendKeys(caddress1);
		return this;
	}
	public ContactDetails address2 (String caddress2) {
		driver.findElement(By.id("street2")).sendKeys(caddress2);
		return this;
	}
	public ContactDetails city (String ccity) {
		driver.findElement(By.id("city")).sendKeys(ccity);
		return this;
	}
	public ContactDetails state(String cstate) {
		driver.findElement(By.id("stateProvince")).sendKeys(cstate);
		return this;
	}
	public ContactDetails postalcode (String cpostalcode) {
		driver.findElement(By.id("postalCode")).sendKeys(cpostalcode);
		return this;
	}
	public ContactDetails country (String ccountry) {
		driver.findElement(By.id("country")).sendKeys(ccountry);
		return this;
	}
	public ContactDetails submitclick () {
		driver.findElement(By.id("submit")).click();
		return this;
	}
}
