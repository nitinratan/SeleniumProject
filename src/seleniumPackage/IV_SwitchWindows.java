package seleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.Scanner;

public class IV_SwitchWindows {

	public static void main(String[] args) {
		String coflictid, mainwindowid = null, child2id = null, child3id = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.id("link2")).click();
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();

		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();
		while (itr.hasNext()) {
			coflictid = itr.next();
			driver.switchTo().window(coflictid);
			System.out.println(driver.getTitle());
			if (driver.getTitle().equalsIgnoreCase("omayo (QAFox.com)")) {
				mainwindowid = coflictid;
			} // else if (driver.getTitle().equalsIgnoreCase("Selenium143")) {
				// child1id = coflictid;}
			else if (driver.getTitle().equalsIgnoreCase("Basic Web Page Title")) {
				child2id = coflictid;
			} else if (driver.getTitle().equalsIgnoreCase("Blogger.com - Create a unique and beautiful blog easily.")) {
				child3id = coflictid;
			}
		}
		// driver.switchTo().window(child1id);
		// System.out.println(driver.getTitle());
		driver.switchTo().window(child2id);
		System.out.println("bolo child2 " + driver.getTitle());
		Scanner se = new Scanner(System.in);
		se.nextInt();
		driver.close();

		driver.switchTo().window(child3id);
		System.out.println("bolo child3 " + driver.getTitle());
		se.nextInt();
		driver.close();
		driver.switchTo().window(mainwindowid);
		System.out.println("bolo baap " + driver.getTitle());
		se.nextInt();
		driver.close();
	}
}
