package com.test.jenslogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.jensUtilities.CommonActions;



public class LoginPage {

	private WebDriver driver; 
	CommonActions actions;
	//public ExtentTest logger;
//	By username = By.xpath("//input[@name ='user_name']");
//	By password = By.xpath("//input[@name ='user_password']");
//	By loginClk = By.xpath("//input[@name='Login']");
//	
//	By errorMSG = By.xpath("//*[contains(text(),'You must specify a valid username and password.')]");
//	By logo = By.xpath("//img[@src='include/images/vtiger-crm.gif\"']");
//	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}
   
	@FindBy(xpath = "//input[@name ='user_name']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name ='user_password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='Login']")
	WebElement loginClk;
	
	@FindBy(xpath ="//*[contains(text(),'You must specify a valid username and password.')]")
	WebElement errorMSG;
	
	@FindBy(xpath = "//img[@src='include/images/vtiger-crm.gif\"']")
	WebElement logo;
	
	public void login(String userName , String pass) {
		
//		username.clear();
//		username.sendKeys(userName);
//		password.clear();
//		password.sendKeys(pass);
//		loginClk.click();
		actions.enterValue(username, userName, "Text "+userName+" entered into username field");
		actions.enterValue(password, pass,"Text "+pass+" entered into password field");
		actions.clickElement(loginClk,"Login button clicked");
	}

	public void verifyErrorMsg() {
		//errorMSG.isDisplayed();
		//actions.ElementExist(errorMSG,"Error Message validated successfully");
	}
	
	public void verifyLogo() {
	//actions.ElementExist(logo,"Logo is present on login page");
	}
}
