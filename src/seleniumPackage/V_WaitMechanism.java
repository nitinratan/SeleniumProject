package seleniumPackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class V_WaitMechanism {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		// implicit wait--> apply in all element
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("dropbtn")).click();

		//Explicit Wait--> apply for one
		WebDriverWait waait = new WebDriverWait(driver,30);
		WebElement facebookLink= waait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
		facebookLink.click();
		
	//	driver.findElement(By.linkText("Flipkart")).click();
		System.out.println("Hello");

		driver.quit();

	}

}
