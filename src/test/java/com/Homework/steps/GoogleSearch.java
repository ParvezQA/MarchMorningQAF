package com.Homework.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	WebDriver driver;
	
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		WebElement searchBox ;
		searchBox= driver.findElement(By.name("q"));
		searchBox.sendKeys(string);
	    
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		WebElement searchBtn;
		searchBtn= driver.findElement(By.name("btnK"));
		searchBtn.click();
	driver.close();
	    
	}

	@Then("I receive releted search result")
	public void i_receive_releted_search_result() {
		
	    
	}
	


}
