package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationSelnium {

	public static void main(String[] args) {
		//Selenium Navigation
		//
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.youtube.com");
		
	}

}
