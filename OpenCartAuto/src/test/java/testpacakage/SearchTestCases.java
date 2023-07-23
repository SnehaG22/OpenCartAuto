package testpacakage;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepacakage.SearchPage;

public class SearchTestCases extends BaseTest {
	@Test
	public void searchExistingProduct() throws EncryptedDocumentException, IOException
	{
		SearchPage SP = new SearchPage(driver);
		Flib f = new Flib();
		SP.searchProduct(f.readExcelData(Excelpath, "ProductDeatils", 1, 0));
		String ExpectedResult="Search - iMac";
		String ActualResult=driver.getTitle();
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	@Test
	public void searchNonExistingproduct() throws EncryptedDocumentException, IOException
	{
		SearchPage SP = new SearchPage(driver);
		Flib f = new Flib();
		SP.searchProduct(f.readExcelData(Excelpath, "ProductDeatils", 1, 1));
		String ExpectedErrormsg="There is no product that matches the search criteria.";
		String ActualErromsg = SP.getText().getText();
		
	}
	@Test
	public void searchWithoutAnyName()
	{
	   SearchPage SP = new SearchPage(driver);
	   SP.getSearchbtn().click();
	   String ExpectedErrormsg="There is no product that matches the search criteria.";
	   String ActualErrormsg=SP.getText().getText();
	   Assert.assertEquals(ActualErrormsg, ExpectedErrormsg);
	
		
	}
	@Test
	public void searchWithTextinDes() throws EncryptedDocumentException, IOException
	{
		SearchPage SP = new SearchPage(driver);
		Flib f = new Flib();
		SP.searchTextofProduct(f.readExcelData(Excelpath,"ProductDeatils", 1, 2));
	
		
	}

}
