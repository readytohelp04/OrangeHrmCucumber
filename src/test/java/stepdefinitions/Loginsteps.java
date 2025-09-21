package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class Loginsteps {
	public WebDriver driver =CucumberHooks.driver;
	LoginPage loginPage = new LoginPage(driver);
	DashboardPage dashboardPage = new DashboardPage(driver);
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
		loginPage.launchURL();
		
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		System.out.println("in login page");
			
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		loginPage.enterUsernamePassword();
//		 System.out.println("enters username and password");
//		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginButton();
//	    System.out.println("user clicks on login button");
//	    driver.findElement(By.xpath("//button[text()=' Login ']")).click(); 
	}
	@Then("validate homepage is displayed")
	public void validate_homepage_is_displayed() {
		dashboardPage.validatePageisDisplayed();
		dashboardPage.clickLeaveMenu();
		//Click Calendar button
		driver.findElement(By.xpath("//label[text()='From Date']/parent::div/following-sibling::div//i")).click();
		//Click year Dropdown Button
		String year ="2024";
		driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']//p")).click();
		driver.findElement(By.xpath("//ul//li[text()='"+year+"']")).click();;
		
		
	}
	
	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String uname,String pwd) {
//		System.out.println("username is:"+uname +"and password is: "+pwd);
//		 System.out.println("enters username and password");
		 loginPage.enterUsernamePassword(uname,pwd);
	}

}
