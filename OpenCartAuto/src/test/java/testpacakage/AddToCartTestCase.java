package testpacakage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pagepacakage.AddToCartPage;

public class AddToCartTestCase extends BaseTest {
	@Test
	public void addProductIntoCart() throws EncryptedDocumentException, IOException
	{   Flib f = new Flib();
	    String productName = f.readExcelData(Excelpath, "ProductDeatils",1, 0);
		SearchTestCases SC = new SearchTestCases();
		SC.searchExistingProduct();
		AddToCartPage AP = new AddToCartPage(driver);
		AP.getSearchProduct().click();
		AP.getAddCartBtn().click();
		String ExpectedMsg="Success: You have added "+productName+" to your shopping cart!×";
		String ActualMsg=AP.getSucessMsg().getText();
	
	Assert.assertEquals(ActualMsg, ExpectedMsg);
		AP.getShoppingCartLink().click();
	}
	

}
