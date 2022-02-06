package com.ex.ui.pages.HWpages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreationTestCasePage extends BasePage{
    public CreationTestCasePage(WebDriver webDriver) {
        super(webDriver);
    }

    private By titleField = By.xpath("//input[@id='title']");
    private By templateDropDown = By.xpath("//span[contains(text(),'Test Case (Text)')]");
    private By templateExploratorySession = By.xpath("//li[@id='template_id_chzn_o_0']");
    private By missionsField = By.xpath("//div[@id='custom_mission_display']");
    private By goalsField = By.xpath("//div[@id='custom_goals_display']");
    private By addTestCaseButton = By.xpath("//button[@id='accept']");

    private By desiredText = By.xpath("//div[contains (text(),'Successfully added the new test case')]");




    public CreationTestCasePage enterTitle(String title){
        waitForElementToBeClickable(webDriver, titleField).sendKeys(title);
        return this;
    }

    public CreationTestCasePage chooseOneTemplate(){
        findElement(webDriver, templateDropDown).click();
        findElement(webDriver, templateExploratorySession).click();
        return this;
    }


    public CreationTestCasePage enterSomeValues(String valueForMissions, String valueForGoals){
        findElement(webDriver, missionsField).sendKeys(valueForMissions);
        findElement(webDriver, goalsField).sendKeys(valueForGoals);
        return this;
    }

    public CreationTestCasePage clickCreateTestCase(){
        findElement(webDriver, addTestCaseButton).click();
        return this;
    }

    public CreationTestCasePage checkIfTextPresent(){
        boolean isTextIsVisible = findElement(webDriver, desiredText).isDisplayed();
        Assertions.assertThat(isTextIsVisible).as("There is no Successfully added the new test case. text present").isTrue();
        return this;
    }


}
