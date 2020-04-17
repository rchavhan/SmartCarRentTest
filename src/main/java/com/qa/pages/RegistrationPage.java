package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegistrationPage  {
    public RegistrationPage(){

    }

    @AndroidFindBy(accessibility = "imgHead") private MobileElement imgHead;
    @AndroidFindBy(accessibility = "etName") private MobileElement name;
    @AndroidFindBy(accessibility = "etEmail_id") private MobileElement emailId;
    @AndroidFindBy(accessibility = "etPhone_no") private MobileElement phoneNo;
    @AndroidFindBy(accessibility = "et_Password") private MobileElement password;
    @AndroidFindBy(accessibility = "etCpassword") private MobileElement confirmPassword;
    @AndroidFindBy(accessibility = "etCity") private MobileElement city;
    @AndroidFindBy(accessibility = "etPincode") private MobileElement pinCode;
    @AndroidFindBy(accessibility = "etWallet") private MobileElement walletBalance;
    @AndroidFindBy(accessibility = "radioMale") private MobileElement radioMale;
    @AndroidFindBy(accessibility = "radioFemale") private MobileElement radioFemale;
    @AndroidFindBy(accessibility = "etLicenceNo") private MobileElement licenceNo;
    @AndroidFindBy(accessibility = "radioUser") private MobileElement radioUser;
    @AndroidFindBy(accessibility = "radioOwner") private MobileElement radioOwner;
    @AndroidFindBy(accessibility = "btnSubmit") private MobileElement sumbit;
    @AndroidFindBy(accessibility = "txtBacktosignup") private MobileElement backToSignUp;


}
