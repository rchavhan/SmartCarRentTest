package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @AndroidFindBy(accessibility = "btSignUp") private MobileElement signUpButton;
    @AndroidFindBy(accessibility = "btSignIn") private MobileElement signInButton;

    BaseTest baseTest;
    public HomePage(){
        baseTest = new BaseTest();
        PageFactory.initElements(new AppiumFieldDecorator(baseTest.getDriver()),this);
    }
    public RegistrationPage pressSignUpButton(){
        getSignUpButton().click();
        return new RegistrationPage();
    }
    public MobileElement getSignUpButton() {
        return signUpButton;
    }

    public LoginPage pressSignInButton(){
        baseTest.click(signInButton);
        return new LoginPage();
    }
    public MobileElement getSignInButton() {
        return signInButton;
    }
}
