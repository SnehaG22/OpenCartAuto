package pagepacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Flib;

public class AddToCartPage {
	
	@FindBy(xpath ="//img[@alt='iMac']")private WebElement serchProduct;
	@FindBy(id="button-cart")private WebElement addCartBtn;
	@FindBy(linkText ="shopping cart")private WebElement shoppingCartlink;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") private WebElement successMsg;
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getSearchProduct()
	{
		return serchProduct;
	}
	public WebElement getAddCartBtn()
	{
		return addCartBtn;
	}
	public WebElement getShoppingCartLink()
	{
		return shoppingCartlink;
	}
	public WebElement getSucessMsg()
	{
		return successMsg;
	}

}
