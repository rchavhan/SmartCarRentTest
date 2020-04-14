package com.qa;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class BaseTest {
    protected AppiumDriver driver;
    protected Properties props;
    InputStream inputStream;

    public BaseTest(){

    }
    public void setDriver(AppiumDriver driver){
        this.driver=driver;

    }
    public AppiumDriver getDriver(){
        return driver;
    }
    @BeforeTest
    public void initialiseDriver(String platformName, String platformVersion, String deviceName) throws Exception{
        try {
            props = new Properties();
            String propFileName = "config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            props.load(inputStream);

            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("platformName", platformName);
            cap.setCapability("platformVersion", platformVersion);
            cap.setCapability("deviceName", deviceName);
            cap.setCapability("automationName", props.getProperty("androidAutomationName"));
            cap.setCapability("appPackage", props.getProperty("androidAppPackage"));
            cap.setCapability("appActivity", props.getProperty("androidAppActivity"));
            URL url = new URL(props.getProperty("appiumUrl"));
            URL appURL =getClass().getClassLoader().getResource(props.getProperty("androidAppLocation"));
            cap.setCapability("app",appURL);

            driver = new AndroidDriver(url , cap);
            String sessionId = driver.getSessionId().toString();

        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    public void waitForVisibility(MobileElement e){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(e));
    }
    public void click(MobileElement e){
        waitForVisibility(e);
        e.click();
    }
    /*
    public void sendKeys(MobileElement e, String txt){
        waitForVisibility(e);
        e.sendKeys(txt);
    }
    public void getAttribute(MobileElement e, String attribute){
        waitForVisibility(e);
        e.getAttribute(attribute);
    }
*/
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
