package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
       //  Assert.assertEquals(actualText, expectedText,"Login page not displayed");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        clickOnElement(By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        String expectedText = "Reset Password";
        String actualText = getTextFromElement(By.xpath("//h6[@class ='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));

        Assert.assertEquals(expectedText, actualText);

    }
}



