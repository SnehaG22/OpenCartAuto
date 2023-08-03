package pagepacakage;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	@FindBy(name="search")private WebElement searchTF;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")private WebElement searchbtn;
	@FindBy(xpath="//p[text()='There is no product that matches the search criteria.']")private WebElement text;
	@FindBy(id = "input-search")private WebElement inputTF;
	@FindBy(name = "description")private WebElement checkBox;
	@FindBy(id = "button-search")private WebElement btn;
	@FindBy(name="category_id")private WebElement categorybtn;
	@FindBy(name="sub_category")private WebElement subCeckbox;
	@FindBy(xpath ="//a[text()='iMac']")private WebElement subcateassertion;
	@FindBy(id="input-sort")private WebElement sortBy;
	
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getSortBy()
	{
		return sortBy;
	}
	public WebElement getsubcateassertion()
	{
		return subcateassertion;
	}
	public WebElement getSearchTF()
	{
		return searchTF;
	}
	public WebElement getSearchbtn()
	{
		return searchbtn;
	}
	public WebElement getTextAssertion()
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
	public WebElement getcategory()
	{
		return categorybtn;
	}
	public WebElement getSubCheckBox()
	{
		return subCeckbox;
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
	public void selectSubCate(String Text , String name )
	{
		searchbtn.click();
		inputTF.sendKeys(Text);
		getcategory().click();
        Select dropdown = new Select(getcategory());
		 dropdown.selectByVisibleText(name);
		subCeckbox.click();
		btn.click();
  }
	public void sortBy(String sortValue) 
	{  
		Select sel = new Select(sortBy);
		sel.selectByVisibleText(sortValue);
	}

}
