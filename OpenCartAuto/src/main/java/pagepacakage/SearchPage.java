package pagepacakage;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	@FindBy(name="search")private WebElement searchTF;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")private WebElement searchbtn;
	@FindBy(xpath="//p[text()='There is no product that matches the search criteria.']")private WebElement text;
	@FindBy(id = "input-search")private WebElement inputTF;
	@FindBy(name = "description")private WebElement checkBox;
	@FindBy(id = "button-search")private WebElement btn;
	
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getSearchTF()
	{
		return searchTF;
	}
	public WebElement getSearchbtn()
	{
		return searchbtn;
	}
	public WebElement getText()
	{
		return text;
	}
	public WebElement getInputTF()
	{
		return inputTF;
	}
	public WebElement getChechbox()
	{
		return checkBox;
	}
	public WebElement getBtn()
	{
		return btn;
	}
	
	public void searchProduct(String productname)
	{
		searchTF.sendKeys(productname);
		searchbtn.click();
	}
	public void searchTextofProduct(String Text)
	{
		searchbtn.click();
		inputTF.sendKeys(Text);
		checkBox.click();
		btn.click();
		
	}

}
