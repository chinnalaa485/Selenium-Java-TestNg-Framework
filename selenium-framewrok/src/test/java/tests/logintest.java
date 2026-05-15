package tests;

import org.testng.annotations.Test;

import base.basetest;
import pages.loginpage;

public class logintest extends basetest {
	
	@Test
	public void testvalidlogin() 
	{
		loginpage loginpg = new loginpage(driver);
		loginpg.enterusername("admin@yourstore.com");
		loginpg.enterpassword("admin");
		loginpg.clicklogin();
		
	}
	

}
