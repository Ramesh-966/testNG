package seleniumjava;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//without creating xml file of testNG
@Listeners(seleniumjava.MyListener.class)
public class OrangeHRM {
	WebDriver driver;

	@BeforeClass
	void Setup() throws InterruptedException {

		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000); 

	}

	@Test(priority=1)
	void testLogo() {

		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(true,status);
	}

	@Test(priority=2)
	void testAppUrl() {

		String URL=driver.getCurrentUrl();
		Assert.assertEquals(URL,"https://opensource-demo.orangehrmlive.com/web/index.pip/auth/login");
	}

	@Test(priority=3 , dependsOnMethods= {"testAppUrl"})
	void testHomepageTitle() {

		Assert.assertEquals((driver.getTitle()), "OrangeHRM");
	}

	@AfterClass
	void teardown() {
		driver.quit();
	}
}
