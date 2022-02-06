package com.ex.ui.pages.HWpages;

import com.ex.ui.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private By testCasesLink = By.xpath("//a[contains(text(),'Test Cases')]");
    private By testRunsLink = By.xpath("//a[contains(text(),'Test Runs')]");


    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage clickOnTestCases(){
        findElement(webDriver, testCasesLink).click();
       return this;
    }
    public MainPage clickOnTestRuns(){
        findElement(webDriver, testRunsLink).click();
        return this;
    }
}
