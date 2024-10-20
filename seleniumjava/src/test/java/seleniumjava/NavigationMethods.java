package seleniumjava;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        NavigationMethods.pageload();
	}
	@Test
public static void pageload() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://www.snapdeal.com/"); 
	driver.get("https://www.amazon.in/");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	driver.navigate().to("https://www.facebook.com/");
		
}
}
