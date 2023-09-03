package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterProgram 
{
	public WebDriver d;

	
	@Given("I launch the site")
	public void i_launch_the_site() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.firefoxdriver().setup();
		d=new FirefoxDriver();
		
		d.get("https://thedemosite.co.uk/");
		d.manage().window().maximize();
	}
	
	@When("I click on about us hyperlink")
	public void i_click_on_about_us_hyperlink() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement about=d.findElement(By.xpath("//*[@id=\'menu-item-22\']/a/span[2]"));
		about.click();	
	
	}
	@When("Open the about us page")
	public void open_the_about_us_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("About us page is open now");
	}
	@When("I click on back button")
	public void i_click_on_back_button() {
	    // Write code here that turns the phrase above into concrete actions
		d.navigate().back();
	
	}
	@When("Go to the home page")
	public void go_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on home page now");
	
	}
	@When("when i click on contact us hyperlink")
	public void when_i_click_on_contact_us_hyperlink() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement contactus=d.findElement(By.xpath("//*[@id=\'menu-item-25\']/a/span[2]"));
		contactus.click();
	
	}
	@When("Contant us page should open")
	public void contant_us_page_should_open() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on contact us page");
	
	}
	@When("Enter the last name")
	public void enter_the_last_name() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement lname=d.findElement(By.xpath("//*[@id=\'post-24\']/div/div/form/div[2]/input"));
		lname.sendKeys("Thakur");
		
		
	}
	@When("Enter the email ID")
	public void enter_the_email_id() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement email=d.findElement(By.xpath("//*[@id=\'post-24\']/div/div/form/div[3]/input"));
		email.sendKeys("a@cmail.com");
	
	}
	@When("Enter the message")
	public void enter_the_message() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement message=d.findElement(By.xpath("//*[@id=\'post-24\']/div/div/form/div[4]/textarea"));
		message.sendKeys("Delhi");
	
	}
	@When("Click on submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement submit=d.findElement(By.xpath("//*[@id=\'post-24\']/div/div/form/div[7]/button"));
		submit.click();
	
	}
	@Then("Validation message should displayed")
	public void validation_message_should_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validation message");
	
	}


}
