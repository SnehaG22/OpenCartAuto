package pagepacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//i[@class='fa fa-user']")private WebElement accLink;
	@FindBy(linkText ="Login")private WebElement login;
	@FindBy(name="email")private WebElement emailTB;
	@FindBy(name="password")private WebElement passTB;
	@FindBy(xpath = "//input[@class='btn btn-primary']")private WebElement loginbtn;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAccLink()
	{
		return accLink;
	}
	public WebElement getLogin()
	{
		return login;
	}
	public WebElement getEmailTB()
	{
		return emailTB;
	}
	public WebElement getPassTB()
	{
		return passTB;
	}
	public WebElement getLoginbtn()
	{
		return loginbtn;
	}
	public void validLogin(String validemail,String validpass) 
	{
       accLink.click();
       login.click();
       emailTB.sendKeys(validemail);
       passTB.sendKeys(validpass);
       loginbtn.click();
	}
	public void InvalidLogin(String invalidemail,String invalidpasss) 
	{
		   accLink.click();
	       login.click();
	       emailTB.sendKeys(invalidemail);
	       passTB.sendKeys(invalidpasss);
	       loginbtn.click();
	       
		
	}
	

}
