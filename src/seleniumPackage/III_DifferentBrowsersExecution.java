package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class III_DifferentBrowsersExecution {

	public static void main(String[] args) {
		// Setting path for Firefox Browser
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 * driver.get("http://omayo.blogspot.com/"); 
		 */
		// Setting for Edge Browser
		System.setProperty("webdriver.edge.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.quit();
	}

}
