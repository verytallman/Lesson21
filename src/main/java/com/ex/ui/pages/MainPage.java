package com.ex.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    private By myAccountLink = By.xpath("//a[contains(text(),'My Account')]");

    public MainPage(WebDriver webDriver, String url) {
        super(webDriver, url);
    }

    public LoginPage clickOnMyAccountLink(){
        findElement(webDriver, myAccountLink).click();
        return new LoginPage(webDriver);
    }
}
