package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public WebDriver driver;
	By Email=By.name("email");
	By password=By.id("user_password");
	By login=By.name("commit");
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}

	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
}
