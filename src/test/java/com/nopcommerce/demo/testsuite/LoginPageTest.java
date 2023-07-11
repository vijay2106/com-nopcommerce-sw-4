package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {



        HomePage homePage = new HomePage();

        LoginPage loginPage = new LoginPage();

        @Test
        public void verifyUserShouldNavigateToLoginPageSuccessfully(){

            homePage.clickOnLoginLink();
            String expectedText = "Welcome please Sign In !";
            String acualText = loginPage.getWelcomeText();
            Assert.assertEquals(acualText,expectedText,"Login page not displayed");
    }

        @Test
    public void verifyErrorMessageWithInvalidCredentials(){
            homePage.clickOnLoginLink();
            loginPage.enterEmailId("prime123@gmail.com");
            loginPage.enterPassword("prime123");
            String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                    "No customer account found";
            String actualMessage = loginPage.getErrorMessage();
            Assert.assertEquals(actualMessage, expectedMessage, "Error message not displayed");
        }
        }

