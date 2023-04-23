package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AAM_KeyboardHandlingAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Handling Keyboard
		Actions a1 = new Actions(driver);
		String place1Xpath = "//textarea[@id='ta1']";
		driver.findElement(By.xpath(place1Xpath)).sendKeys("Nitin");
		
		//Click Enter throw Action class on that option
		a1.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath(place1Xpath)).sendKeys("Line changed after Enter performed");
		Thread.sleep(5000);
		//close browser
		driver.quit();
		
	}

}
