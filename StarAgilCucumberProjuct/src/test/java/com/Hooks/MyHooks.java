package com.Hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import static com.stepDefenation.S07Amazon.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

	//@Before
	public void openBrowser() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.amazon.in/");
	}
	
	//@After
	public void closeBrowser() {
		if (driver != null) {
            driver.quit();  
        }
    }	
	}



