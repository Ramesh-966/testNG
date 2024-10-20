package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openbrowser {
	
	public static void main(String[] args) throws InterruptedException {
	
		Openbrowser.Driver();
	}
	
		// TODO Auto-generated method stub
	@Test()
		public static void Driver() throws InterruptedException{
WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:/Users/RAMESH RONGALA/Downloads/chromedriver_win32 (1)/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
System.out.println("browser started");
Thread.sleep(2000);

WebElement ele =driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
System.out.println("Element is Displayed : "+ele.isDisplayed());
System.out.println("Element is Enabled : "+ele.isEnabled());
/*System.out.println("Title is : "+driver.getTitle());
Thread.sleep(2000);
System.out.println("Current Url is : "+driver.getCurrentUrl());
Thread.sleep(2000);
System.out.println("Page Source is :  "+driver.getPageSource());
Thread.sleep(2000);*/


driver.quit();
	
	}
}
