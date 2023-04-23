package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AAJ_LightBoxHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/lightbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Handling LightBox : No need to switch
		driver.findElement(By.id("lightbox1")).click();
		// Need to close that (By clicking on X)
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class= 'close cursor']")).click();

		driver.quit();
	}
}
