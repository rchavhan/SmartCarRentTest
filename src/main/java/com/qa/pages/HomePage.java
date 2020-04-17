package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseTest{
    @AndroidFindBy(accessibility = "com.example.cc14.smartcarrent:id/btnSignUp")
    public MobileElement signUpButton;

    @AndroidFindBy(accessibility = "btnSignIn")
    public MobileElement signInButton;
    BaseTest baseTest;
    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(baseTest.getDriver()),this);
    }

    public void waitForVisibility(MobileElement e){
        WebDriverWait wait =new WebDriverWait(baseTest.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
    }

    public RegistrationPage pressSignUpButton() {
        click(signUpButton);
        return new RegistrationPage();
    }














    /*
   public LoginPage pressSignInButton() {
        click(signInButton);
        return new LoginPage();
    }*/
}

