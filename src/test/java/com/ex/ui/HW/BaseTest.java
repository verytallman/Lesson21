package com.ex.ui.HW;

import com.ex.ui.WebDriverManagerClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
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
        webDriver.close();
    }
}
