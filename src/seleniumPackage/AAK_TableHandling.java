package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAK_TableHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// Handling tables with dynamic xpath
		String manishCityXpath;
		int cityRownumber = 0;
		int manishCityColumnNumber = 3;
		String personName = "Manish";
		List<WebElement> totalNames = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
		for (int i = 0; i < totalNames.size(); i++) {
			System.out.println("Loop Count for testing " + i);
			if (totalNames.get(i).getText().equals(personName)) {
				cityRownumber = i + 1;
				// Now you got required data then quit the for loop
				break;
			}
		}
		// Dyanamic Xpath
		manishCityXpath = "//table[@id='table1']//tr[" + cityRownumber + "]/td[" + manishCityColumnNumber + "]";
		// System.out.println(manishCityXpath);
		System.out.println(driver.findElement(By.xpath(manishCityXpath)).getText());
		// Close browser
		driver.quit();
	}

}
