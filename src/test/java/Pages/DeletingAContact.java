package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Base.ProjSpecificationContactList;
import io.reactivex.rxjava3.functions.Action;

public class DeletingAContact extends ProjSpecificationContactList{
	
		public DeletingAContact clickingacontact () {
			driver.findElement(By.xpath("(//tr[@class='contactTableBodyRow'])[1]")).click();
			return this;
		}
		public DeletingAContact deletecontactclick () {
			driver.findElement(By.id("delete")).click();
			return this;
		}
		public DeletingAContact switchtoconfirmation () {
		 driver.switchTo().alert().accept();
		return this;
		}
}
