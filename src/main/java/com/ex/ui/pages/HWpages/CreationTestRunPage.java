package com.ex.ui.pages.HWpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreationTestRunPage extends BasePage{

    public CreationTestRunPage(WebDriver webDriver) {
        super(webDriver);
    }
    private By addTestRunButton = By.xpath("//button[@id='accept']");


    public CreationTestRunPage clickCreateTestRun(){
        findElement(webDriver, addTestRunButton).click();
        return this;
    }
}
