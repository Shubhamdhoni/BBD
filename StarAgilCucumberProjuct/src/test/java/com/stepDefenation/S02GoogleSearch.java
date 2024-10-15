package com.stepDefenation;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S02GoogleSearch {
	
	WebDriver driver;
	
	@Given("I Open Google")
	public void i_open_google() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.google.com");
	}

	@When("I enter text in searchbox")
	public void i_enter_text_in_searchbox() {
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Dhoni");
//		driver.findElement(By.name("q")).sendKeys("Dhoni");
	}

	@When("I hit enter")
	public void i_hit_enter() {
	   driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Valid search should display")
	public void valid_search_should_display() {
	  Assert.assertTrue(driver.getTitle().contains("Dhoni"));
	  driver.close();
	  
	}
}
