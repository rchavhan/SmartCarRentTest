package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseTest{
    @AndroidFindBy (accessibility = "com.example.cc14.smartcarrent:id/btnSignIn") private MobileElement signUP;

    public void click(MobileElement e){
        waitforVisibility(e);
        e.click();
    }
public RegistrationPage press(){
        click(signUP);
        return new RegistrationPage();


}

}

