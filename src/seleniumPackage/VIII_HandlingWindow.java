package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VIII_HandlingWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Handling Frame
		WebElement ifamn1 = driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(ifamn1);
		System.out.println("TEST THE CONTAINT "+driver.findElement(By.xpath("//h1")).getText());
		// Checking how many ifram in page firstly need to jump on default page
		driver.switchTo().defaultContent();
		// Now check numbers of ifram in a page
		List<WebElement> framCount = driver.findElements(By.xpath("//iframe"));
		System.out.println(framCount.size());
		driver.quit();
	}

}
