package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	private WebDriver driver;
	
	private By usernamebox = By.id("Email");
	private By passwordbox = By.id("Password");
	private By loginbutton = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");
	
	public loginpage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void enterusername(String username) {
		driver.findElement(usernamebox).clear();
		driver.findElement(usernamebox).sendKeys(username);
	}
	public void enterpassword(String pass) {
		driver.findElement(passwordbox).clear();
		driver.findElement(passwordbox).sendKeys(pass);	
	}
	public void clicklogin() {
	    driver.findElement(loginbutton).click();
	}
	

}
