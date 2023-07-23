package pagepacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class Logoutpage {
	@FindBy(linkText ="Logout")private WebElement logoutbtn;
	@FindBy(xpath="//i[@class='fa fa-user']")private WebElement accLink;
	//@FindBy(linkText = "Logout")private WebElement logbt;
	
	public Logoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAcclink()
	{
		return accLink;
	}
	public WebElement getLogoutbtn()
	{
		return logoutbtn;
	}
	public void logoutfrmAcc()
	{
		accLink.click();
		logoutbtn.click();
	}
	public void LogoutopfrmRightClm()
	{
		logoutbtn.click();
	}

}
