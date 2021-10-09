package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	By login=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector("div[class='text-center'] h2");
	By navbar=By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[8]/a");
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getNavbar()
	{
		return driver.findElement(navbar);
	}

}
