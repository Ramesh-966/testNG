package testNG;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Mobile {
	static WebDriver driver;
	
	public static void screenshot() throws Exception {
		
		WebElement element = driver.findElement(ByCssSelector.id("a#nav-link-accountList"));

		element.click();
	String acttxt = driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).getText();
String Exptxt= "Create your Amazon account1";



	if(acttxt==Exptxt) {
		System.out.println("correct");
		
	}else {
		
		File destFile= new File(".//SCREENSHOT/screenshot.png");
		TakesScreenshot sch = (TakesScreenshot)driver;
		File srcfile= sch.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,destFile);
	}
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/RAMESH RONGALA/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		Mobile.screenshot();
		/**WebElement ele =driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("samsung mobile");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(7000);


		List<WebElement> mobmodels=driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']//span[@class='a-size-medium a-color-base a-text-normal']"));
		int count =mobmodels.size();
		System.out.println(count);
		for(int i=0;i<=count-1;i++) {
			String modelname = mobmodels.get(i).getText();

			if(modelname.equals("Samsung Galaxy M12 (Blue,4GB RAM, 64GB Storage) 6000 mAh with 8nm Processor | True 48 MP Quad Camera | 90Hz Refresh Rate")) {
				System.out.println("selected Mobile data is displayed"+" ========== "+mobmodels.get(i).getText());
				mobmodels.get(i).click();
				break;

			}else {
				System.out.println(i+" : "+modelname);
			}

		}
		System.out.println("2nd title "+" : "+driver.getTitle());**/
	}
}


