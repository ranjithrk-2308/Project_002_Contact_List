package Utility;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ContactlistUtilities {
	
	public static WebDriver driver;
	public static Properties prop;
	public static ChromeOptions options;
	
	public void contactlistpagelaunch () {
		
		options=new ChromeOptions();
		options.addArguments("disable-popup-blocking");
		
		driver = new ChromeDriver(options);
		
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void contactlistclose () {
		driver.close();
	}
	
	public void readfile () throws IOException {
		FileReader file = new FileReader("C:\\Users\\ralaguchamy\\OneDrive - IGT PLC\\Desktop\\Learning\\Eclipse 9  9 2024\\MiniProject2_Contact_List\\src\\test\\resources\\dataproviderfile.properties");
		prop = new Properties();
		prop.load(file);
	}
}