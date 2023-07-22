package pagepacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class Logoutpage {
	@FindBy(linkText ="Logout")private WebElement logoutbtn;
	
	public Logoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogoutbtn()
	{
		return logoutbtn;
	}
	public void Logoutop()
	{
		logoutbtn.click();
	}

}
