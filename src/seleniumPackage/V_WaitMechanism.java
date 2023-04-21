package seleniumPackage;

//import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class V_WaitMechanism {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		// implicit wait--> apply in all element --> good practics to put 15 sec implicit wait globally
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.className("dropbtn")).click();

		// Explicit Wait--> apply for one
		// WebDriverWait waait = new WebDriverWait(driver,30);
		// WebElement facebookLink=
		// waait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
		// facebookLink.click();
		// Fluent Wait
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement facebookElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.linkText("Flipkart"));
			}
		});

		// driver.findElement(By.linkText("Flipkart")).click();
		facebookElement.click();
		System.out.println("Hello");

		driver.quit();

	}

}
