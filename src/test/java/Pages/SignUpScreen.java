package Pages;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.ProjSpecificationContactList;

public class SignUpScreen extends ProjSpecificationContactList{
	
	
	public SignUpScreen signupfirstname (String sfirstname) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(sfirstname);
		return this;
	}
	
	public SignUpScreen lastnameentry (String slastname) {
		driver.findElement(By.id("lastName")).sendKeys(slastname);
		return this;
	}
	public SignUpScreen emailentery (String semail) {
		driver.findElement(By.id("email")).sendKeys(semail);
		return this;
	}
	
	public SignUpScreen passwordentry(String spassword) {
		driver.findElement(By.id("password")).sendKeys(spassword);
		return this;
	}
	
	public SignUpScreen submitclick () {
		driver.findElement(By.id("submit")).click();
		return this;
	}
	public SignUpScreen headingcheck () {
		String actualheading  = driver.findElement(By.xpath("//h1[text()='Contact List']")).getText();
		String expectedtext = "Contact List";
		System.out.println(actualheading);
		if (actualheading.equals(expectedtext)) {
			System.out.println("The Heading is matching : ");
		}else {
			System.out.println("The Heading is not matching : " );
		}
		return this;
	}
}
