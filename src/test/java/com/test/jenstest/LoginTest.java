package com.test.jenstest;

import org.testng.annotations.Test;

import com.test.jenslogin.LoginPage;


public class LoginTest extends BaseTest{
	

	@Test
	public void InvalidLoginTC01()
	{
		String TCName = "InvalidLoginTC01";
       // logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver);
		lp.login("admin1","adm");
		lp.verifyErrorMsg();
		//extent.flush();
	}
	
	@Test
	public void validLoginTC02()
	{
		String TCName = "validLoginTC02";
        //logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver);
		lp.login("admin","admin");
		//HomePage hp = new HomePage(driver);	
		//hp.logout();		
		//extent.flush();
	}
	
	@Test
	public void verifyLogoTC03()
	{
		String TCName = "verifyLogoTC03";
       // logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver);
		lp.verifyLogo();
		//extent.flush();
	}
}