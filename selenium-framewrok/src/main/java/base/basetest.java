package base;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class basetest {
	protected WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setup(String br) throws IOException {
		
		switch(br)
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		default: System.out.println("invalid");return; //return will completely exit from the code if no browser is found
		}
		
		
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?returnUrl=%2Fadmin%2F");
		
		//full page screenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\loginpage.png");
		FileUtils.copyFile(src, trg);	
		
	}
	
	@AfterMethod
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}

