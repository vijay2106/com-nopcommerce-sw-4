package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest
{
    ElectronicsPage electronics = new ElectronicsPage();


    @Test
    public void verifyUserShouldNavigateToCellPhonePageSuccessFully() {
        //1.1 Mouse Hover on “Electronics” Tab
        electronics.clickOnElectronicsMenu();

        //1.2 Mouse Hover on “Cell phones” and click
        electronics.clickCellPhone();

        //1.3 Verify the text “Cell phones”
        String expectedCellPhone = electronics.textCellPhone();
        String actualCellPhone = "Cell phones";
        Assert.assertEquals(expectedCellPhone, actualCellPhone);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        // 2.1 Mouse Hover on “Electronics”
        electronics.clickOnElectronicsMenu();
        // 2.2 Mouse Hover on “Cell phones” and click
        electronics.clickCellPhone();
        // 2.3 Verify the text “Cell phones”
        String expectedCellPhone = electronics.textCellPhone();
        String actualCellPhone = "Cell phones";
        Assert.assertEquals(expectedCellPhone, actualCellPhone);
        //2.4 Click on List View Tab
        electronics.clickListView();
        Thread.sleep(2000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        electronics.clickNokiaLumia();
        //2.6 Verify the text “Nokia Lumia 1020”
        String expectednNokialumiaText = electronics.textNokialumia();
        String actualNokialumiaText = "Nokia Lumia 1020";
        Assert.assertEquals(expectednNokialumiaText, actualNokialumiaText);
        //2.7 Verify the price “$349.00”
        String expectednokialumiaprice = electronics.verifiyNokiaPrice();
        String actualnokialumiaprice = "$349.00";
        Assert.assertEquals(expectednokialumiaprice, actualnokialumiaprice);
        // 2.8 Change quantity to 2
        //Change the Qty to "2"
        electronics.clearAndAddQuantity();
        //Click on "Update shopping cart"
        electronics.clearAndAddQuantity();
        //2.9 Click on “ADD TO CART” tab
        electronics.clickAddToCard();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        electronics.addtoshoppingCartMsg();
        String expectedshoppingCartMsg = electronics.addtoshoppingCartMsg();
        String actualshoppingCartMsg = "The product has been added to your shopping cart";
        Assert.assertEquals(expectedshoppingCartMsg, actualshoppingCartMsg);
        //After that close the bar clicking on the cross button.
        electronics.addtoClickCloseBar();
        electronics.mouseHoverShoppingCart();
        Thread.sleep(2000);
        electronics.goToShoppingCart();
        //2.11 hen MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(2000);
        // electronics.clickToGoCart();
        //2.12 Verify the message "Shopping cart"
        String actualshoppingMsg = electronics.shoppingCardMatchText();
        String expectedshoppingMsg = "Shopping cart";
        Assert.assertEquals(actualshoppingMsg, expectedshoppingMsg);
       /* //2.13 Verify the quantity is 2
        //Change the Qty to "2"
        //electronics.clearAndAddQuantity2();
        Thread.sleep(2000);*/
        //Click on "Update shopping cart"
        electronics.updateShoppingcard2();
        Thread.sleep(2000);
        //2.14 Verify the Total $698.00
        //electronics.CheckTotalPrice();
        String actualtotal = electronics.CheckTotalPrice();
        String expectedtotal = "$698.00";
        Assert.assertEquals(actualtotal, expectedtotal,"null value");
        //2.15 click on checkbox “I agree with the terms of service”
        electronics.agreeTurmService();
        //2.16 Click on “CHECKOUT”
        electronics.clickOnCheckOut();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        String actualWelcome = electronics.welcomeSign();
        String expectedWelcome = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcome, expectedWelcome);
        electronics.welcomeSign();
        //2.18 Click on “REGISTER” tab
        electronics.clickOnRegister();
        //2.19 Verify the text “Register”
        String actualregisterText = electronics.verifyRegisterText();
        String expectedregisterText = "Register";
        Assert.assertEquals(actualregisterText, expectedregisterText);
        // 2.20 Fill the mandatory fields
        electronics.checkoutAsRegister();
        electronics.firstName();
        electronics.lastName1();
        electronics.emailaddress();
        electronics.addPassword();
        electronics.addconfirmPassword();
        // 2.21 Click on “REGISTER” Button
        electronics.addToRegisterButton();

        //2.22 Verify the message “Your registration completed”
        String actualregisterTextMsg = electronics.verifyRegisterTextMsg();
        String expectedregisterTextMsg = "Your registration completed";
        Assert.assertEquals(actualregisterTextMsg, expectedregisterTextMsg);

        //2.23 Click on “CONTINUE” tab
        electronics.clickOnContinewafterRegister();
        //2.24 Verify the text “Shopping card”
        String actualShoppingCardText = electronics.verifyShoppingCardText();
        String expectedShoppingCardText = "Shopping cart";
        Assert.assertEquals(actualShoppingCardText, expectedShoppingCardText);
        //Click On Log in Page
        electronics.clickInLogin();
        //Enter Valid Email address//reUse
        electronics.emailaddress();
        //  Enter valid password//ReUse
        electronics.addPassword();
        //Click on ‘LOGIN’ button
        electronics.clickOnLoginButton();
        // 2.25 click on checkbox “I agree with the terms of service”
        electronics.agreeWithTuermService();
        //  2.26 Click on “CHECKOUT”
        electronics.clickFinalCheckOut();
        // 2.27 Fill the Mandatory fields
        electronics.addCountry();
        electronics.addCity();
        electronics.address1();
        electronics.zipPostalCode();
        electronics.addPhoneNumber();
        // 2.28 Click on “CONTINUE”
        electronics.clickBillContinu();
        //  2.29 Click on Radio Button “2nd Day Air ($0.00)”
        electronics.click2DayByAir();
        //  2.30 Click on “CONTINUE”
        electronics.ShippingContinue();
        //  2.31 Select Radio Button “Credit Card”
        electronics.addRadioCraditCard();
        electronics.addtoConitnueButton();
        //  2.32 Select “Visa” From Select credit card dropdown
        electronics.craditCardType();
        //   2.33 Fill all the details
        electronics.addCardHolderName();
        electronics.addCardNumber();

        //2.33 Fill all the details
        sendTextToElement(By.id("CardholderName"), "v bamaniya");
        sendTextToElement(By.id("CardNumber"), "5368597055488705");
        WebElement expiryDate = driver.findElement(By.id("ExpireMonth"));
        Select date = new Select(expiryDate);
        date.selectByVisibleText("09"); //Select by visible text
        WebElement expiryYear = driver.findElement(By.id("ExpireYear"));
        Select year = new Select(expiryYear);
        year.selectByVisibleText("2023"); //Select by visible text
        sendTextToElement(By.id("CardCode"), "000");

        //   2.34 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));

        // 2.35 Verify “Payment Method” is “Credit Card”
        String expectedPaymentMethod = "Credit Card";
        String actualPaymentMethod = getTextFromElement(By.xpath("//*[@id=\"checkout-confirm-order-load\"]/div/div/div/div/div[1]/div[2]/ul/li/span[2]"));
        Assert.assertEquals("Text Matched", expectedPaymentMethod, actualPaymentMethod);

        //  2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedShippingMethod = "2nd Day Air";
        String actualShippingMethod = getTextFromElement(By.xpath("//*[@id=\"checkout-confirm-order-load\"]/div/div/div/div/div[2]/div[2]/ul/li/span[2]"));
        Assert.assertEquals("Text Matched", expectedShippingMethod, actualShippingMethod);
        //2.37 Verify Total is “$698.00”

        String expectedPayment1 = "$698.00";
        String actualPayment1 = getTextFromElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div/div/table/tbody/tr[4]/td[2]/span/strong"));
        Assert.assertEquals(expectedPayment1, actualPayment1);

        // 2.38 Click on “CONFIRM”
        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));

        //2.39 Verify the Text “Thank You”
        String expectedThankYou = "Thank you";
        String actualThankYou = driver.findElement(By.xpath("//h1[contains(text(),'Thank you')]")).getText();
        Assert.assertEquals(expectedThankYou, actualThankYou);

        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedMessage1 = "Your order has been successfully processed!";
        String actualMessage1 = driver.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]")).getText();
        Assert.assertEquals(expectedMessage1, actualMessage1);

        //2.41 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));

        //2.42 Verify the text “Welcome to our store”
        String expectedWelcomeText1 = "Welcome to our store";
        String actualWelcomeText1 = driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).getText();
        Assert.assertEquals(expectedWelcomeText1, actualWelcomeText1);

        //2.43 Click on “Logout” link
        clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));

        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}


