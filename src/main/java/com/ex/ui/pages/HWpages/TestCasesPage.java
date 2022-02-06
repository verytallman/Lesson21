package com.ex.ui.pages.HWpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage{

    public TestCasesPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By addTestCaseButton = By.xpath("//span[contains(text(),'Add Test Case')]");

    public TestCasesPage clickOnCreateTestCase(){
        findElement(webDriver, addTestCaseButton).click();
        return this;
    }



}
