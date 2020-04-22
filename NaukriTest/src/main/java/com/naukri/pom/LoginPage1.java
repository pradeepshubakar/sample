package com.naukri.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
@FindBy(xpath="//div[.='Login']")
private WebElement loginLink;
@FindBy(xpath="//input[contains(@placeholder,'Enter your a')]")	
private WebElement userNameTbx;

@FindBy(xpath="//input[contains(@placeholder,'Enter your password')]")
private WebElement passwordTbx;
@FindBy(xpath="//button[.='Login']")
private WebElement loginButton;

public  LoginPage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickLoginLink() {
	loginLink.click();
}
public WebElement getUserNameTbx() {
	return userNameTbx;
}
public WebElement getPasswordTbx() {
	return passwordTbx;
}
public void clickLoginButton() {
	loginButton.click();
}
}

