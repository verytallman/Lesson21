package com.ex.ui;

import com.ex.ui.pages.LoginPage;
import com.ex.ui.pages.MainPage;
import org.testng.annotations.Test;

public class TestRailSuite extends BaseTest{
    @Test
    public void testLoginForm(){

       new MainPage(webDriver, "https://www.gurock.com/testrail/")
               .clickOnMyAccountLink()
               .inputEmail("asd@asd.com")
               .inputPassword("somepass")
               .clickOnLoginButton()
               .verifyPasswordFieldIsEmpty();
    }

}
