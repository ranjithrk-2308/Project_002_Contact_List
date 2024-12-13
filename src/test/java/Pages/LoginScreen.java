package Pages;

import org.openqa.selenium.By;

import Base.ProjSpecificationContactList;

public class LoginScreen extends ProjSpecificationContactList {
	
	public LoginScreen usernameentery (String lusername) {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(lusername);
		return this;
	}
	public LoginScreen passwordentry(String lpassword) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(lpassword);
		return this;
	}
	public LoginScreen loginclick() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		return this;
	}
	public LoginScreen redirectstocontactlist () {
		
			String actual  = driver.findElement(By.xpath("//h1[text()='Contact List']")).getText();
			String expected = "Contact List";
			System.out.println(actual);
			if (actual.equals(expected)) {
				System.out.println("The successfull login is returning to the contact list screen :  ");
			}else {
				System.out.println("The successfull login is not returning to the contact list screen : " );
			}
			return this;
	
	}
	public void invalidlogincheck () {
		String actual =	driver.findElement(By.xpath("//span[text()='Incorrect username or password']")).getText();
		String expected = "Incorrect username or password";
		if (actual.equals(expected)) {
			System.out.println("The username or password is incorrect and the error message is displayed properly : ");
		}else {
			System.out.println("The username & Password is correct and the user is logged in : ");
		}
	}
	
	public LoginScreen logout () {
		driver.findElement(By.id("logout")).click();
		return this;
	}
	public LoginScreen logoutverification () {
		String text = "Log In:"; 
		String logout =	driver.findElement(By.xpath("//p[text()='Log In:']")).getText();
		if (logout.equals(logout)) {
			System.out.println("The logout is successfull : ");
		}else {
			System.out.println("The logout is unsuccessfull : ");
		}
		return this;
	}

}
