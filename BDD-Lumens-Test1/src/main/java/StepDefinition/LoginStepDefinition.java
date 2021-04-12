package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^user create an account$")
	public void user_create_an_account() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromeselenium\\chromedriver89\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lumens.com");
		driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
	    driver.findElement(By.xpath("//a[@id='my_account_hdr_link']")).click();
	    driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_firstname']")).sendKeys("sailaja");
	    driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_lastname']")).sendKeys("G");
	    driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_email']")).sendKeys("sailaja.gottipati@gmail.com");
	    driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_emailconfirm']")).sendKeys("sailaja.gottipati@gmail.com");
	    driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_password']")).sendKeys("jailalithajai");
	    driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_passwordconfirm']")).sendKeys("jailalithajai");
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
	}

	
	@Then("^user enters Email and password$")
	public void user_enters_Email_and_password() throws InterruptedException {
		driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
	    driver.findElement(By.xpath("//a[@id='my_account_hdr_link']")).click();
		driver.findElement(By.xpath("//input[@id='dwfrm_login_username']")).sendKeys("sailaja.gottipati@gmail.com");
		//Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='dwfrm_login_password']")).sendKeys("jailalithajai");
        
	}
        
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		 
	}
	
	@When("^title of login page$")
	public void title_of_login_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Modern Lighting, Ceiling Fans, Furniture &amp; Home Decor!",
				title);

	}

	
	@Then("^user click logout$")
	public void user_clicks_logout() {
	driver.findElement(By.xpath("//header/div[2]/div[2]/div[4]/ul/li[1]")).click();
	driver.findElement(By.xpath("//header/div[2]/div[4]/ul/li[2]/div/div/div/span/a")).click();

		
	}



}


