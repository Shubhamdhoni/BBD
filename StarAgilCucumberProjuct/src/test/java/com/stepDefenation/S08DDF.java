package com.stepDefenation;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S08DDF {
	
	WebDriver driver;
	
	@Given("open application{String}")
	public void open_application(String url) {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get(url);
	}

	@When("Enter the username as {string}")
	public void enter_the_username_as(String un) {
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}

	@When("Enter the password as {string}")
	public void enter_the_password_as(String pw) {
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pw);
	}

	@Then("home page should be display")
	public void home_page_should_be_display() {
	    Assert.assertTrue(driver.getTitle().contains(""));
	}
}
