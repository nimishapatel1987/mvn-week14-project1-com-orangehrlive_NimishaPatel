package com.orangehrmlive.demo.pages;

import org.openqa.selenium.By;
import com.orangehrmlive.demo.utility.Utility;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h5[@class = 'oxd-text oxd-text--h5 orangehrm-login-title']");
    By userName = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By getTextAfterLogin=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");

    By forgotPassword = By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']");


    public void enterUserName(String userNameText){
        sendTextToElement(userName,userNameText);
    }
    public void enterPassword(String passwordText){
        sendTextToElement(password,passwordText);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(getTextAfterLogin);
    }
    public String forgotPassword(){
        return getErrorMessage();
    }


}





