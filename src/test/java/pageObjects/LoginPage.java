package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		System.out.println("Entered Login Constructor");
		this.driver = driver;
	}

	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By btnLogin = By.xpath("//button[text()=' Login ']");
	
	public void launchURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void enterUsernamePassword() {
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
	}
	
	public void clickLoginButton() {
		driver.findElement(btnLogin).click();
	}
	
	public void enterUsernamePassword(String uname,String pwd) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
	}
	
	
}
