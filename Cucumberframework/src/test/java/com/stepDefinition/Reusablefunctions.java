package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reusablefunctions {

	WebDriver driver;

	public Reusablefunctions(WebDriver driver) {
		this.driver = driver;
	}

	public void clicking(WebElement ele) {
		ele.click();
	}

}
