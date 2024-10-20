package seleniumjava;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxhandle {
static WebDriver driver;

public  Checkboxhandle(){
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
}

public void selectcheckbox() throws Exception {
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
	
	/*for(WebElement cb : checkboxes) {
		cb.click();
	}
	
	for(int i=0;i<checkboxes.size();i++) {
		checkboxes.get(i).click();
	}*/
	for(int i=0;i<3;i++) {
		checkboxes.get(i).click();
	}
	Thread.sleep(5000);
	for(int i=0;i<checkboxes.size();i++) {
		if(checkboxes.get(i).isSelected()) {
			checkboxes.get(i).click();
		}
	}
}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Checkboxhandle ch=new Checkboxhandle();
		
		Thread.sleep(2000);
		
		ch.selectcheckbox();
		Thread.sleep(2000);
		
		System.out.println("checkboxes selected successfully");
		driver.quit();
	}

}
