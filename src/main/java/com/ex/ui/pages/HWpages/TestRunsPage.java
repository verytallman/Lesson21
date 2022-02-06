package com.ex.ui.pages.HWpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestRunsPage extends BasePage{
    public TestRunsPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By addTestRunButton = By.xpath("//span[contains(text(),'Add Test Run')]");

    public TestRunsPage clickOnCreateTestRun(){
        findElement(webDriver, addTestRunButton).click();
        return this;
    }


}
