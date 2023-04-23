package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AAH_DropDownAndMultiSelectionBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("drop1")).click();
		// DropDown Handling
		WebElement dropDownElement = driver.findElement(By.id("drop1"));
		Select set = new Select(dropDownElement);
		set.selectByVisibleText("doc 2");
		// MultiSelection Box Handling
		WebElement multiSelectionBox = driver.findElement(By.id("multiselect1"));
		Select set1 = new Select(multiSelectionBox);
		set1.selectByVisibleText("Audi");
		set1.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		set1.deselectByVisibleText("Audi");
		Thread.sleep(3000);
		driver.quit();
	}

}
