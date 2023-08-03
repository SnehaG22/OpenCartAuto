package testpacakage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CoustomeListners;
import generic.Flib;
import pagepacakage.LoginPage;
@Listeners(CoustomeListners.class)

public class LoginTextCase extends BaseTest {
	@Test
	public void validLogin() throws EncryptedDocumentException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib fi = new Flib();
		lp.validLogin(fi.readExcelData(Excelpath, "validcred", 1, 0),fi.readExcelData(Excelpath, "validcred", 1, 1));
		String Expectedresult="My Account";
		String Actualresult=driver.getTitle();
		Assert.assertEquals(Actualresult, Expectedresult);
	}
	@Test
	public void invalidLoogin() throws EncryptedDocumentException, IOException
	{
		LoginPage l = new LoginPage(driver);
		Flib f = new Flib();
		int rc = f.rowCount(Excelpath, "invalidcred");
		for(int i=1;i<=rc;i++)
		{
			l.InvalidLogin(f.readExcelData(Excelpath, "invalidcred", i, 0),f.readExcelData(Excelpath, "invalidcred", i,1));
		}

     }
	@Test
	public void forPassLink()
	{ 
		LoginPage l = new LoginPage(driver);
		l.forpass();
		String ExpectedResult="Forgot Your Password?";
		String ActualResult=driver.getTitle();
		Assert.assertEquals(ActualResult, ExpectedResult);
	   
	}
}
