package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import resources.base;

public class Testcase1 extends base {
	//private static Logger log=LogManager.getLogger(Testcase1.class.getName());
	public WebDriver driver;
	@Test
	public void titleValid() throws IOException
	{
		driver=initializeDriver();
		//log.info("initializing driver");
		driver.get(prop.getProperty("url"));
		//log.info("navigated to home page");
		
		HomePage hp=new HomePage(driver);
		AssertJUnit.assertEquals(hp.getTitle().getText(), "FEATURED COURSES");
		//log.info("valiadating title");
		AssertJUnit.assertTrue(hp.getNavbar().isDisplayed());
		//log.info("validating navigation bar");
		
	}
	
@AfterTest
public void close()
{
	driver.close();
}
}
 