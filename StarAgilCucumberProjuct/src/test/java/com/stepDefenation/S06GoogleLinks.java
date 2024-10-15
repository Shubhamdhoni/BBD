package com.stepDefenation;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S06GoogleLinks {
	
	WebDriver driver;

	@Given("Open an a google application")
	public void open_an_a_google_application() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.google.com/");
	}

	@When("Click on a gmail link")
	public void click_on_a_gmail_link() {
	    driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).click();
	}

	@Then("Gmail page should display")
	public void gmail_page_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("about"));
	    driver.close();	
	}

	@When("Click on a Images link")
	public void click_on_a_images_link() {
	   driver.findElement(By.xpath("//a[contains(@aria-label,'Search for Images')]")).click();
	}

	@Then("Images page should display")
	public void images_page_should_display() {
		 Assert.assertTrue(driver.getTitle().contains("Google Images"));
		 driver.close();
	}

	@When("Click on a Advt link")
	public void click_on_a_advt_link() {
	    driver.findElement(By.xpath("//a[normalize-space()='Advertising']")).click();
	}

	@Then("Advt page should display")
	public void advt_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Google Ads"));
		driver.close();	
	}

	@When("Click on a Business link")
	public void click_on_a_business_link() {
	   driver.findElement(By.xpath("//a[normalize-space()='Business']")).click();
	}

	@Then("Business page should display")
	public void business_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("business"));
		driver.close();
		}
}
