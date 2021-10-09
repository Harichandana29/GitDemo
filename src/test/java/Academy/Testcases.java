package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import resources.base;

public class Testcases extends base {
	public WebDriver driver;
	@Test(dataProvider="getData")

	public void browserTest(String username,String password) throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		HomePage hp=new HomePage(driver);
		hp.getLogin().click();
		Loginpage lp=new Loginpage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//Row stands for how many test cases
		//column stands for how many elements of data we are sending
		Object[][] data=new Object[2][2];
		data[0][0]="harichandana199629@gmail.com";
		data[0][1]="1234";
		data[1][0]="hjdfhjca@gmail.com";
		data[1][1]="jsbkjd";
		return data;
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}

