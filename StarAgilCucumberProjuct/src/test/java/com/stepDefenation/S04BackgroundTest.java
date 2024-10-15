package com.stepDefenation;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04BackgroundTest {
	WebDriver driver ;

	@Given("open the browser & add url of application")
	public void open_the_browser_add_url_of_application() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter a valid userName")
	public void enter_a_valid_user_name() {
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	}

	@When("Enter a valid password")
	public void enter_a_valid_password() {
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	}

	@When("Click on a login button")
	public void click_on_a_login_button() {
		 driver.findElement(By.xpath("//button[@id='submit']")).click();  
	}

	@Then("Home page display")
	public void home_page_display() {
		 Assert.assertTrue(driver.getCurrentUrl().contains("successfully"));
		 driver.close();
	}

	@When("Enter in-valid userName")
	public void enter_in_valid_user_name() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shubham");
	}

	@When("Enter in-valid password")
	public void enter_in_valid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dhoni");
	}
	
	@When("Click in to login button")
	public void click_in_to_login_button() {
		 driver.findElement(By.xpath("//button[@id='submit']")).click();  
	}

	@Then("Error msg display")
	public void error_msg_display() {
		Assert.assertTrue(driver.getPageSource().contains("Your username is invalid!"));
		driver.close();
	}
}
