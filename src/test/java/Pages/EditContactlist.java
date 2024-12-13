package Pages;
import org.openqa.selenium.By;
import Base.ProjSpecificationContactList;

public class EditContactlist extends ProjSpecificationContactList {
	
	public EditContactlist clicktoedit () {
		driver.findElement(By.xpath("(//tr[@class='contactTableBodyRow'])[3]")).click();
		return this;
	}
	
	public EditContactlist  editbuttonclick () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='edit-contact']")).click();
		return this;
	}
	public EditContactlist editphonenumber (String ephone) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).sendKeys(ephone);
		return this;
	}
	public EditContactlist submitedit () {
		driver.findElement(By.id("submit")).click();
		return this;
	}
}
