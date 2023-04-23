package seleniumPackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AAD_DifferentBrowsersExecution {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		System.out.println("In Which Browser you want execution 1) Chrome 2) Firefox 3) Edge");
		Scanner input = new Scanner(System.in);
		int browserName = input.nextInt();

		switch (browserName) {
		case 1:
			// Setting for Chrome Browser
			System.setProperty("webdriver.chrome.driver",
					"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

			break;
		case 2:
			// Setting path for Firefox Browser
			System.setProperty("webdriver.gecko.driver",
					"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

			break;
		case 3:

			// Setting for Edge Browser
			System.setProperty("webdriver.edge.driver",
					"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();

			break;

		default:
			System.out.println("Choose 1 ,2, 3");
			break;
		}

		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
