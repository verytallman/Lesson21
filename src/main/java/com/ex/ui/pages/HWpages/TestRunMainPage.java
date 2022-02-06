package com.ex.ui.pages.HWpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestRunMainPage extends BasePage{
    public TestRunMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By testCaseOne = By.xpath("//a[contains(text(),'testCase1')]");


    public TestRunMainPage choseTestCase(){
        findElement(webDriver, testCaseOne).click();
        return this;
    }

}
