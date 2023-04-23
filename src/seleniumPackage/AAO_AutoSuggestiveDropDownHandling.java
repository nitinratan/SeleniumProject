package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AAO_AutoSuggestiveDropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// Handling Auto Suggestive DropDown
		String toFieldId = "fromCity";
		String toSearchField = "//input[@placeholder ='From']";
		driver.findElement(By.id(toFieldId)).click();
		WebElement serchField = driver.findElement(By.xpath(toSearchField));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(serchField));
		serchField.sendKeys("Bh");
		Thread.sleep(5000);
		//Select bhopal by Keyboard
		Actions a1 = new Actions(driver);
		int i =0;
		while(i<3)
		{
			a1.sendKeys(Keys.DOWN).build().perform();
			i++;
		}
		a1.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
		
		//Close Browser
		driver.quit();

	}

}
