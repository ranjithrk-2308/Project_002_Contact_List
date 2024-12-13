package Pages;

import org.openqa.selenium.By;
import Base.ProjSpecificationContactList;

public class HomeScreenTONavigate extends ProjSpecificationContactList{
	
	public SignUpScreen SignUpClick () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='signup']")).click();
		return new SignUpScreen();

	}
	
	public LoginScreen LoginButtoncheck() {
		String actualtext = driver.findElement(By.xpath("//button[text()='Submit']")).getText();
		String expectedtext = "Submit";
		
		if (actualtext.equals(expectedtext)) {
			System.out.println("The Submit button is visible in the homescreen : ");
		}else {
			System.out.println("The Submit button is Not visible in the homescreen : ");
		}
		return new LoginScreen();
	
	}
	public ContactDetails signupclick () {
		driver.findElement(By.id("add-contact")).click();
		return new ContactDetails();
	}
	
	public EditContactlist editcontact () {
		
	String headingcheck = 	driver.findElement(By.xpath("//h1[text()='Contact List']")).getText();
	String heading = "Contact List";
	System.out.println(headingcheck);
		if (heading .equals(headingcheck)) {
			
			System.out.println("Heading is matching : ");
		}
		return new EditContactlist();
	}
	
}
