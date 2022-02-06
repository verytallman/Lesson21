package com.ex.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class WebDriverManagerClass {
    private static WebDriver webDriver;

    private WebDriverManagerClass(String browser) {
        setWebDriver(browser);

    }

    private void setWebDriver(String browserName){
        switch (browserName){
            case "chrome":
                webDriver = WebDriverManager.chromedriver().create();
                break;
            case "ff":
                webDriver = WebDriverManager.firefoxdriver().create();
                break;
            default:
                throw new RuntimeException("Incorrect browser name");
        }
    }

    public static WebDriver getWebDriver() {
//        String browser = System.getProperty("browser");
        String browser = "chrome";
        if (webDriver == null){
            new WebDriverManagerClass(browser);
        }
        return webDriver;
    }
}
