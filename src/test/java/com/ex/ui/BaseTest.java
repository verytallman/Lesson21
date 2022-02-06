package com.ex.ui;

import com.ex.ui.pages.WebHelpers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static WebDriver webDriver;

    @BeforeClass
    public void setUp(){
        webDriver = WebDriverManagerClass.getWebDriver();
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void shutDown(){
        webDriver.quit();
    }
}
