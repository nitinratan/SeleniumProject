package seleniumPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AAN_TakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		// Take Screenshot--------------------------------------------------
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//download Java Utils jars and add in library folder and cofigure with project then you can JavaUtils class
		FileUtils.copyFile(screenshot1,
				new File("D:\\JavaProgram WorkSpace\\SeleniumProject\\screenshots\\screeshot1.png"));
		// ------------------------------------------------------------------

		// Getting option name text
		String place2Xpath = "(//div[@id='cssmenu']//li//span)[6]";
		WebElement place2 = driver.findElement(By.xpath(place2Xpath));
		System.out.println(place2.getText());
		// perform click on option
		a1.moveToElement(place2).click().build().perform();
		// Take Screenshot--------------------------------------------------
		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2,
				new File("D:\\JavaProgram WorkSpace\\SeleniumProject\\screenshots\\screeshot2.png"));
		// ------------------------------------------------------------------
		Thread.sleep(5000);
		// close browser
		driver.quit();

	}

}
