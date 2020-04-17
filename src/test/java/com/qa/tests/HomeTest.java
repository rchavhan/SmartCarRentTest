package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
    HomePage homePage ;
    BaseTest baseTest = new BaseTest();

    @Test
    public void shouldClickOnSignUpButton() throws Exception {
        //baseTest.setup();
        homePage = new HomePage();
        homePage.pressSignUpButton();
    }
}
