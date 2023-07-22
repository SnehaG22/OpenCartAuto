package testpacakage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import pagepacakage.LoginPage;
import pagepacakage.Logoutpage;

public class LogoutTestCase extends BaseTest {
	@Test
	public void Logout() throws EncryptedDocumentException, IOException
	{
		LoginTextCase login = new LoginTextCase();
		login.validLogin();
		Logoutpage logout = new Logoutpage(driver);
		logout.Logoutop();
		String Expectedresult="Account Logout";
		String Actualresult=driver.getTitle();
		Assert.assertEquals(Actualresult, Expectedresult,Actualresult);

	}

	
	

}
