package com.ex.ui.pages.HWpages;

import com.ex.ui.pages.WebHelpers;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebHelpers {
   public WebDriver webDriver;

     BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

     BasePage(WebDriver webDriver, String url) {
        webDriver.get(url);
        this.webDriver = webDriver;
    }

}
