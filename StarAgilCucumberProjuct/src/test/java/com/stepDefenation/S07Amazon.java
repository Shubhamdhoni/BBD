package com.stepDefenation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07Amazon {
	public static WebDriver driver;
	
	@Given("open Amazon")
	public void open_amazon() {
	    System.out.println("Launching amazon");
	}

	@When("search for {string}")
	public void search_for(String ph) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ph);
	}

	@When("click on search button")
	public void click_on_search_button() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("search result should display")
	public void search_result_should_display() {
	    Assert.assertTrue(driver.getTitle().contains("iphone"));
	   
	}

}
