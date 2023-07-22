package generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Flib implements Ioconstant {
	protected static WebDriver driver;
	@BeforeMethod
	public void setup() throws IOException
	{  Flib fil = new Flib();
	String brovalue = fil.readPropertyData(Propath, "browser");
	String url = fil.readPropertyData(Propath, "url");
	if(brovalue.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	else
	{
		
	}
}
	@AfterMethod
	public void close()
	{
		driver.close();
		
	}
}
		


