package Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import Base.ProjSpecificationContactList;

public class CheckingTheCorrectDetailsHaveEntered extends ProjSpecificationContactList {
	
		public void checkingthedetailsmatch ()   {
			
		String expected = "Add a New Contact";
		String actual = driver.findElement(By.xpath("//button[text()='Add a New Contact']")).getText();
		System.out.println(actual);
		
		/*
		 * //Printing the list : String textfromscreen =
		 * driver.findElement(By.xpath("(//tr[@class='contactTableBodyRow'])[9]")).
		 * getText(); System.out.println(textfromscreen);
		 */
		
		if (expected.equals(actual)) {	
			System.out.println("The add contact list is successfull ! ");
		}
		else  {
			System.out.println("The add contact list is not successfull ! ");
		}
	}
} 
