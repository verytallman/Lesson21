package com.ex.ui.pages.HWpages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCaseMainPage extends BasePage{
    public TestCaseMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By addResult = By.xpath("//a[@id='sidebar-tests-addresult']");
    private By statusDropDown = By.xpath("//span[contains(text(),'Passed')]");


    private By statusFailed = By.xpath("//li[@id='addResultStatus_chzn_o_3']");
    private By statusPassed = By.xpath("//span[contains(text(),'Passed')]");

    private By addResultButton = By.xpath("//button[@id='addResultSubmit']");
    private By desiredText = By.xpath("//em[contains(text(),\"This test was marked as 'Failed'.\")]");







    public TestCaseMainPage clickAddResultButton(){
        findElement(webDriver, addResult).click();
        return this;
    }
    public TestCaseMainPage choseFailedStatus(){
        findElement(webDriver,statusPassed).click();
        findElement(webDriver,statusFailed).click();
        return this;
    }
    public TestCaseMainPage addResult(){
        findElement(webDriver, addResultButton).click();
        return this;
    }
    public TestCaseMainPage checkIfTextPresent(){
        boolean isTextIsVisible = findElement(webDriver, desiredText).isDisplayed();
        Assertions.assertThat(isTextIsVisible).as("There is no Failed test Case").isTrue();
        return this;
    }

}
