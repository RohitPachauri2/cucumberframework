package com.Pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "login-button")
	WebElement lbutton;
	@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button")
	WebElement element1;
	@FindBy(css = "div.inventory_item:nth-child(5) > div:nth-child(3) > button:nth-child(2)")
	WebElement element2;

	public void usernamepassword(String uname, String pass) throws InterruptedException {
		username.sendKeys(uname);
		password.sendKeys(pass);
		Thread.sleep(2000);
	}

	public void loginbutton() {
		lbutton.click();
	}

	public void enterelements() throws InterruptedException {
		element1.click();
		element2.click();
		Thread.sleep(2000);
	}
}