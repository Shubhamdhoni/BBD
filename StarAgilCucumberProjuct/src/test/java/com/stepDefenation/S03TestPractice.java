package com.stepDefenation;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03TestPractice {
	
	WebDriver driver;
//	Actions act;
	
	@Given("Open Practice test")
	public void open_practice_test() {
		driver = new ChromeDriver();
	//	act = new Actions(driver);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter valid userName")
	public void enter_valid_user_name() {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	}

	@When("Click on login button")
	public void click_on_login_button() {
	  driver.findElement(By.xpath("//button[@id='submit']")).click();  
	}

	@Then("Home page should display")
	public void home_page_should_display() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("successfully"));
	   driver.close();
	}

	// Invalid Data
	
	@When("Enter In-valid userName")
	public void enter_in_valid_user_name() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shubham");
	}

	@When("Enter In-valid password")
	public void enter_in_valid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dhoni");
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("error message should display")
	public void error_message_should_display() {
	    Assert.assertTrue(driver.getPageSource().contains("Your username is invalid!"));
	    driver.close();
	}


}
