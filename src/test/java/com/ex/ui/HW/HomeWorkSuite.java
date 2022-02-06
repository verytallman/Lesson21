package com.ex.ui.HW;

import com.ex.ui.pages.HWpages.*;
import org.testng.annotations.Test;

public class HomeWorkSuite extends BaseTest{
    @Test
    public void testCaseOne(){
        new LoginPage(webDriver, "https://tallman1.testrail.io/")
                .inputEmail("tallman1@mailforspam.com")
                .inputPassword("Password123")
                .clickOnLoginButton();

        new MainPage(webDriver).clickOnTestCases();
        new TestCasesPage(webDriver).clickOnCreateTestCase();
        new CreationTestCasePage(webDriver)
                .enterTitle("testCase8")
                .chooseOneTemplate()
                .enterSomeValues("Mission One","Goal One")
                .clickCreateTestCase()
                .checkIfTextPresent();
    }

    @Test
    public void testCaseTwo(){
        new LoginPage(webDriver, "https://tallman1.testrail.io/");
        new MainPage(webDriver).clickOnTestRuns();
        new TestRunsPage(webDriver).clickOnCreateTestRun();
        new CreationTestRunPage(webDriver).clickCreateTestRun();
        new TestRunMainPage(webDriver).choseTestCase();
        new TestCaseMainPage(webDriver)
                .clickAddResultButton()
                .choseFailedStatus()
                .addResult()
                .checkIfTextPresent();
    }


}
