package StepDefinition;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.PortalHomepage;
import resources.base;

@RunWith(Cucumber.class)

public class StepDefinitions  {
	

	 WebDriver driver;
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lvenk\\chromedriver.exe");
	driver =new ChromeDriver();
	}

	@Given("^navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://qaclickacademy.com");
	   
	}

	@Given("^Click on Login link in home page to land on signin page$")
	public void click_on_Login_link_in_home_page_to_land_on_signin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("a[href*='sign_in']")).click();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(arg1);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(arg2);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

	@Then("^verify that user is successfully login$")
	public void verify_that_user_is_successfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement search = driver.findElement(By.id("search-courses"));
		Assert.assertTrue(search.isDisplayed());
		
		
		
	   
	}



	}


