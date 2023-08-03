package testpacakage;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CoustomeListners;
import generic.Flib;
import pagepacakage.SearchPage;
@Listeners(CoustomeListners.class)

public class SearchTestCases extends BaseTest {
	static SearchPage SP;
	static Flib f;
	@BeforeMethod
	public void searchPage()
	{
		SP = new SearchPage(driver);
		f = new Flib();
		
	}
		@Test
		public void searchExistingProduct() throws EncryptedDocumentException, IOException
		{    	SP = new SearchPage(driver);
			f = new Flib();
			SP.searchProduct(f.readExcelData(Excelpath, "ProductDeatils", 1, 0));
			String ExpectedResult="Search - iMac";
			String ActualResult=driver.getTitle();
			Assert.assertEquals(ActualResult, ExpectedResult);
		}
		@Test
		public void searchNonExistingproduct() throws EncryptedDocumentException, IOException
		{
			SP.searchProduct(f.readExcelData(Excelpath, "ProductDeatils", 1, 1));
			String ExpectedErrormsg="There is no product that matches the search criteria.";
			String ActualErromsg = SP.getTextAssertion().getText();
		}
		@Test
		public void searchWithoutAnyName()
		{
		   SP.getSearchbtn().click();
		   String ExpectedErrormsg="There is no product that matches the search criteria.";
		   String ActualErrormsg=SP.getTextAssertion().getText();
		   Assert.assertEquals(ActualErrormsg, ExpectedErrormsg);
		
		}
		@Test
		public void searchWithTextinDes() throws EncryptedDocumentException, IOException
		{
			
			SP.searchTextofProduct(f.readExcelData(Excelpath,"ProductDeatils", 1, 2));
		}
		@Test
		public void searchWithCategory() throws EncryptedDocumentException, IOException
		{
			SP.selectSubCate(f.readExcelData(Excelpath,"ProductDeatils",1, 0),f.readExcelData(Excelpath,"ProductDeatils",1,4));
			String ExpectedResult="iMac";
			String ActualResult=SP.getsubcateassertion().getText();
			Assert.assertEquals(ActualResult, ExpectedResult);
			
		}
		@Test
		public void sortBy() throws EncryptedDocumentException, IOException 
		{
			SP.searchProduct(f.readExcelData(Excelpath,"ProductDeatils", 2, 0));
			SP.sortBy(f.readExcelData(Excelpath,"ProductDeatils",1, 5));
        }

}


