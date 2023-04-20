package seleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		for(int i=0;i<10;i++)
			System.out.println(i);
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgram WorkSpace\\SeleniumProject\\drivers\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		try {
  			driver.navigate().to("https://www.youtube.com");
		} catch (Exception e) {
			System.out.println(e);
		}
  		System.out.println("Lastline run");
		
	}

}
