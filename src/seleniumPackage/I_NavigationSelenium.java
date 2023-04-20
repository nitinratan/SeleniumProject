package seleniumPackage;

//import java.util.Scanner;

//import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_NavigationSelenium {

	public static void main(String[] args) throws Throwable {
		// Selenium Navigation
		//
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://omayo.blogspot.com/");
		// Maxi the screen
		driver.manage().window().maximize();
		// finding the UI element
		WebElement wb1 = driver.findElement(By.name("q"));
		// performing operation on WebElement
		wb1.sendKeys("Test");
		// GETTING text field value
		String val = wb1.getAttribute("value");
		System.out.println(val);
		// Clickn on "Search Button"
		WebElement wb2 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		wb2.click();
		Thread.sleep(5000);

		String s1 = driver.findElement(By.id("textbox1")).getAttribute("value");
		System.out.println(s1);
		driver.findElement(By.id("textbox1")).clear();
		/*Scanner sc = new Scanner(System.in);
		System.out.println(s1 + " Enter any number");
		try {
			Integer rc = sc.nextInt();
			System.out.println(rc);
		} finally {
			sc.close();
		}
		*/
		// Reading Static text 
		String text =driver.findElement(By.id("pah")).getText();
		System.out.println(text);
		driver.close();

	}

}
