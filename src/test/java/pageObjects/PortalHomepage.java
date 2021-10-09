package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomepage {

	public WebDriver driver;
	By Searchbox=By.name("Search");
	
	
	public PortalHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSearchBox()
	{
		return driver.findElement(Searchbox);
	}
	
	
	
}
