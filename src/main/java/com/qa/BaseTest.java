package com.qa;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.URL;

public class BaseTest {
    public AppiumDriver driver;
    public WebDriverWait wait;
    public BaseTest(){

    }
    public void setDriver(AppiumDriver driver){
        this.driver = driver;
    }
    public AppiumDriver getDriver(){
        return driver;
    }
  //  @BeforeTest
    public void setup () throws Exception{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Android");
        caps.setCapability("udid", "RZ8M7442VWR"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.example.cc14.smartcarrent");
        caps.setCapability("appActivity","com.example.cc14.smartcarrent.SplashScreenActivity");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 30);
    }

    @AfterTest
    public void quitDriver(){
        driver.quit();
    }

}
