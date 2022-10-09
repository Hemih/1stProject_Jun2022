package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	// methods
	// variables

	public static void main(String[] args) throws InterruptedException {

		// we are setting up the property with this key to execute this path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hemih\\Selenium_techFios\\1stSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

//		1 second = 1000 millisecond - formula x(1000)= y
		
		// pause execution
		Thread.sleep(5000);// will wait for 5seconds then close
		driver.close();

	}

}
