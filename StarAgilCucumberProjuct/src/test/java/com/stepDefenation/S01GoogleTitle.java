package com.stepDefenation;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
public class S01GoogleTitle {
	WebDriver driver;
	String title;
	
	@Given("Open Google")
	public void open_google() {
//	    System.out.println("Opening google");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.google.com");
	    }

	@When("Read the Title")
	public void read_the_title() {
//	System.out.println("Reading the title");
		title = driver.getTitle();
		System.out.println(title);
		System.out.println("-------");
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
//	   System.out.println("Verifying the title");
		if(title.equals("Google")) 
			System.out.println("Title Matching");
		else
			System.out.println("Title Not-Maching");
		driver.close();
	}
	


}
