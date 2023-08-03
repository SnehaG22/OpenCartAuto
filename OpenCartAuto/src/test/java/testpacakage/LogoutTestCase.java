package testpacakage;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic.CoustomeListners;

import generic.BaseTest;

import generic.Flib;
import pagepacakage.LoginPage;
import pagepacakage.Logoutpage;
@Listeners(CoustomeListners.class)

public class LogoutTestCase extends BaseTest {
	@BeforeMethod
	public void Login() throws EncryptedDocumentException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib fi = new Flib();
		lp.validLogin(fi.readExcelData(Excelpath, "validcred", 1, 0),fi.readExcelData(Excelpath, "validcred", 1, 1));
	}
	@Test
	public void LogoutfrmAcc()
	{
		Logoutpage logout = new Logoutpage(driver);
		logout.logoutfrmAcc();
		String Expectedresult="Account Logout";
		String Actualresult=driver.getTitle();
		Assert.assertEquals(Actualresult, Expectedresult,Actualresult);
		
	}
	@Test
	public void LogoutfrmRightClm() throws EncryptedDocumentException, IOException
	{
		Logoutpage logout = new Logoutpage(driver);
		logout. LogoutopfrmRightClm();
		String Expectedresult="Account Logout";
		String Actualresult=driver.getTitle();
		Assert.assertEquals(Actualresult, Expectedresult,Actualresult);

	}
	@Test
	public void closingBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		setup();
		String ExpectedResult="My Account";
		String ActualResult=driver.getTitle();
		Assert.assertEquals(ActualResult, ExpectedResult, ActualResult);
		
	}

	
	

}
