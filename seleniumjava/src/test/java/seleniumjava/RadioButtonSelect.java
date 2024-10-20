package seleniumjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonSelect {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RadioButtonSelect RBS = new RadioButtonSelect();
		RBS.test();
		
	}
	@Test()
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//System.out.println("browser started");
			Thread.sleep(2000);
			WebElement mele =driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement fele =driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Female radio button selected : "+fele.isSelected());
		System.out.println("male radio button selected : "+mele.isSelected());
		
		fele.click();
		
		System.out.println("Female radio button selected : "+fele.isSelected());
		System.out.println("male radio button selected : "+mele.isSelected());
		
		mele.click();
		System.out.println("Female radio button selected : "+fele.isSelected());
		System.out.println("male radio button selected : "+mele.isSelected());
	
		driver.close();
	}
	

}
