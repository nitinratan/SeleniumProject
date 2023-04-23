package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AAL_MouseHandlingAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// Handling Mouse
		Actions a1 = new Actions(driver);
		String place1ToMoveXpath = "(//div[@id='cssmenu']//li)[2]";
		WebElement place1 = driver.findElement(By.xpath(place1ToMoveXpath));
		a1.moveToElement(place1).build().perform();
		// Getting option name text
		String place2Xpath = "(//div[@id='cssmenu']//li//span)[6]";
		WebElement place2 = driver.findElement(By.xpath(place2Xpath));
		System.out.println(place2.getText());
		//perform click on option
		a1.moveToElement(place2).click().build().perform();
		Thread.sleep(5000);
		// close browser
		driver.quit();

	}

}
