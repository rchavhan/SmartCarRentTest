package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class HomeTest {
    HomePage homePage;
    BaseTest baseTest;
    @Parameters({"platformName","platformVersion","deviceName"})
    @BeforeClass
    public void beforeClass(String platformName, String platformVersion , String deviceName) throws Exception{
        baseTest = new BaseTest();
        baseTest.initialiseDriver(platformName,platformVersion,deviceName);
    }
    @BeforeMethod
    public void beforeMethod(Method method){
        homePage = new HomePage();
    }
    @Test
    public void shouldClickOnSignUpButton(){
        homePage.pressSignUpButton();

    }
    /*@Test
    public void shouldClickOnSignInButton(){
        HomePage homePage = new HomePage();
        homePage.pressSignInButton();
    }*/

}
