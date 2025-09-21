package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage {
public WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		System.out.println("Entered Dashboard Constructor");
		this.driver = driver;
	}
	public void validatePageisDisplayed() {
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed(),true);
		
	}
	
	public void clickLeaveMenu() {
		driver.findElement(By.xpath("//span[text()='Leave']/parent::a")).click();
	}
}
