package Base;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utility.ContactlistUtilities;

public class ProjSpecificationContactList  extends ContactlistUtilities{
	
	@BeforeMethod
		public void contactlistopen () {
		contactlistpagelaunch();
		}
	
	@BeforeTest
	public void readfilefrom () throws IOException {
		readfile();
	}
	
	@AfterMethod
		public void contactclose () {
			contactlistclose();
		}
}