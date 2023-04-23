package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAG_AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		// implicit wait--> apply in all element --> good practics to put 15 sec implicit wait globally
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("alert1")).click();
		//Switching control to alert
		Alert al = driver.switchTo().alert();
		//Getting tyext from alert
		System.out.println(al.getText());
		//Accepting the alert
		al.accept();
		//Not accepting Alert
		al.dismiss();
		System.out.println("Test");
		driver.close();
	}

}
