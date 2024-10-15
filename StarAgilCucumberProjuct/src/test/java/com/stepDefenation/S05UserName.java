package com.stepDefenation;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S05UserName {
	WebDriver driver;
	
	@Given("Open Practice test application")
	public void open_practice_test_application() {
		 driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://practicetestautomation.com/practice-test-login/");
		}

	@When("Enter userName as {string}")
	public void enter_user_name_as(String un) {
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
			}

	@When("Enter password {string}")
	public void enter_password(String ps) {
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
			}

	@When("Click login button")
	public void click_login_button() {
		 driver.findElement(By.xpath("//button[@id='submit']")).click();  
			}

	@Then("Home page should  be display")
	public void home_page_should_be_display() {
		 Assert.assertTrue(driver.getCurrentUrl().contains("successfully"));
		 driver.close();
	}


}
