package com.ex.ui.pages;

import org.openqa.selenium.WebDriver;

public class BasePage extends WebHelpers{
    WebDriver webDriver;

     BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

     BasePage(WebDriver webDriver, String url) {
        webDriver.get(url);
        this.webDriver = webDriver;
    }

}
