package com.ex.ui.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private By emailField = By.xpath("//input[@id='email']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[contains(.,'Login')]");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage inputEmail(String email){
        findElement(webDriver, emailField).sendKeys(email);
        return this;
    }

    public LoginPage inputPassword(String password){
        findElement(webDriver, passwordField).sendKeys(password);
        return this;
    }

    public LoginPage clickOnLoginButton (){
        findElement(webDriver,loginButton).click();
        return this;
    }

    public LoginPage verifyPasswordFieldIsEmpty(){
        boolean isPasswordFieldEmpty = findElement(webDriver, passwordField).getAttribute("value").isEmpty();
        Assertions.assertThat(isPasswordFieldEmpty).as("Password field should be empty").isTrue();
        return this;
    }
}
