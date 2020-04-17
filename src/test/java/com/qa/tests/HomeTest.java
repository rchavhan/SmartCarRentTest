package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.RegistrationPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class HomeTest extends BaseTest{
    public AndroidDriver driver;
    public WebDriverWait wait;
    HomePage homePage;


    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Android");
        caps.setCapability("udid", "RZ8M7442VWR"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.example.cc14.smartcarrent");
        caps.setCapability("appActivity","com.example.cc14.smartcarrent.SplashScreenActivity");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void basicTest () {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.example.cc14.smartcarrent:id/btnSignUp"))).click();
       // return new RegistrationPage();
    }
    @Test
    public void basicTest1 () throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.example.cc14.smartcarrent:id/btnSignIn"))).click();
        // return new RegistrationPage();
    }/*
    @BeforeMethod
    public void before(){
        homePage = new HomePage();
    }
   @Test
   public void basicTest () {
        homePage.press();

   }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }*/
}
