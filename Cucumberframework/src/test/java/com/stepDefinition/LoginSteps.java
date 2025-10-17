package com.stepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;
	LoginPage lp;
	
	@Given("the user is already in login page")
	public void the_user_is_already_in_login_page() {
		System.out.println("Step1: User is on Login Page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
	}

//    @When("^user enters \"(.*)\" and \"(.*)\"$")--when not using Examples tag
	@When("^user enters (.*) and (.*)$")
	public void user_enters_the_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("Step2: User enters username and password");

		lp.usernamepassword(username, password);
	}

	@When("user enters credentials with datatable")
	public void user_enters_credentials_with_datatable(DataTable datatable) {
		List<List<String>> data = datatable.cells();
		System.out.println("Step2: User enters username and password");

		// Assuming driver is already defined
		driver.findElement(By.id("user-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));

	}

	@Then("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Step3: User clicks on login button");
		lp.loginbutton();
		
		
		
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
	    if(driver.getCurrentUrl().contains("inventory")) {
	    	System.out.println("Step4: User is on home Page");
	    }
	    else {
	    	System.out.println("Step4: User is not on home Page!!!Closing window");
	    	driver.quit();
	    }
	}



	@Then("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
		System.out.println("Step5: user is on home page ");
	}

	@Then("user adds items")
	public void user_adds_items() throws InterruptedException {
		System.out.println("Step6: user adds items");
		lp.enterelements();
		driver.close();
	}
}
