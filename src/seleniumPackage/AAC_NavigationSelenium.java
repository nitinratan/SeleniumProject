package seleniumPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAC_NavigationSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		// Get title of page
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// close the browser
		driver.close();

	}

}
