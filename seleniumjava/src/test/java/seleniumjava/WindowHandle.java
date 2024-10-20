package seleniumjava;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {

	WebDriver driver;
	@Test
	public void test() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
	
	Thread.sleep(5000);
	
	//WebElement links = driver.findElement(By.xpath("//div[@class='wikipedia-search-main-container']/div//a"));
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	for(WebElement link:links) {
//System.out.println(link.getText());
		
		String str = link.getText();

if((str.equals ("Selenium")||str.equals("Selenium in biology")||str.equals("Selenium (software)")||str.equals("Selenium disulfide")||str.equals("Selenium dioxide"))) {
	
	link.click();
	
	
}else {
}
	}
	
	String parentwinid=driver.getWindowHandle();
	
	
Set<String> childwinids = driver.getWindowHandles();

//Iterator<String> it=childwinids.iterator();


for(String chiwid : childwinids) {
	
	driver.switchTo().window(chiwid);
	
	Thread.sleep(7000);
	
	String title = driver.getTitle();
	
	System.out.println(title);
	if( title .equals ("Selenium disulfide - Wikipedia")){
		
		driver.close();
		
		System.out.println("The child browser closed");
		
		break;
		
	}
	else{
		System.out.println("the child browser tab still opened");
	}
	
	
	}

Thread.sleep(5000);

driver.switchTo().window(parentwinid);

System.out.println(driver.getCurrentUrl());

Thread.sleep(5000);

driver.quit(); 
	}
	
}
