package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseNum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File DestFile=new File("C:\\Users\\RAMESH RONGALA\\eclipse-workspace\\testNG\\SCREENSHOT");

    //Copy file at destination

    FileUtils.copyFile(SrcFile, DestFile);
	}

}
