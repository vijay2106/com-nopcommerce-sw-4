package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    ComputerPage computer = new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        //click on computer Menu
        computer.clickOnComputerMenu();

        //Click on Desktop
        computer.clickOnDeskTopMenu();

        //Select sort by position"Name :"Z to A"
        computer.setSortByZtoA();

        //Verify the product will arrange in Descending order.
        String actualText = computer.getSortByText();
        String expectedTest = "Name: Z to A";
        Assert.assertEquals(actualText, expectedTest);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //click on computer Menu
        computer.clickOnComputerMenu();

        //Click on Desktop
        computer.clickOnDeskTopMenu();

        //Click on a to z
        computer.setSortByAtoZ();
        Thread.sleep(1000);

        //Click on "Add To Cart"
        computer.addtocard();

        //Verify the Text "Build your own computer"
        String actualText = computer.getBuildYourComputerText();
        String expectedTest = "Build your own computer";
        Assert.assertEquals(actualText, expectedTest);

        //Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computer.selectProcessor();

        //Select "8GB [+$60.00]" using Select class.
        computer.selectprocessor8Gb();

        //Select HDD radio "400 GB [+$100.00]"
        computer.radioHdd();

        //Select OS radio "Vista Premium [+$60.00]"
        computer.vistaPremiumOsRadio();

        //Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        computer.microsoftOfficeSoftwer();
        Thread.sleep(4000);

        //Verify the price "$1,475.00"
        String actualText1 = computer.processorPriceMatch();
        String expectedTest1 = "$1,475.00";
        //Assert.assertEquals(actualText1, expectedTest1);

        //Click on "ADD TO CARD" Button.
        computer.selectAddtocard1();

        //Verify the Text "Build your own computer"
        String actualshoppingText = computer.productAddCradMsgMatch();
        String expectedshoppingText = "The product has been added to your shopping cart";
        Assert.assertEquals(actualshoppingText, expectedshoppingText);

        //After that close the bar clicking on the cross button.
        computer.clickCrossButton();

        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        computer.goToShoppingCart();
        computer.gotocard();


        //Verify the message "Shopping cart"
        String actualshoppingMsg = computer.shoppingCardMatch();
        String expectedshoppingMsg = "Shopping cart";
        Assert.assertEquals(actualshoppingMsg, expectedshoppingMsg);

        //Change the Qty to "2"
        computer.clearAndAddQuantity();

        //Click on "Update shopping cart"
        computer.updateShoppingcard();

        //Verify the Total"$2,950.00"
        computer.totalpricematch();
        String actualTotal = computer.shoppingCardMatch();
        String expectedTotal = "Shopping cart";
        Assert.assertEquals(actualTotal, expectedTotal);

        //click on checkbox “I agree with the terms of service”
        computer.agreeTurm();

        //Click on “CHECKOUT”
        computer.gotoCheckout();

        //Verify the Text “Welcome, Please Sign In!”
        String actualWelcome = computer.welcomeSign();
        String expectedWelcome = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcome, expectedWelcome);
        computer.welcomeSign();

        //Click on “CHECKOUT AS GUEST” Tab
        computer.checkoutAsGuest();

        //Add first name
        computer.firstName();

        //Add last name
        computer.lastName1();
        //add email address
        computer.emailaddress();
        //add country
        computer.addCountry();
        //add state
        computer.addCity();
        //add Address
        computer.addAddress();
        //add zipcode
        computer.addzipcode();
        //add phone
        computer.addPhoneNumber();

        //Click on Continue
        computer.clickContinue();

        //Click on Radio Button “Next Day Air($0.00)”
        computer.byAir();

        //Click on “CONTINUE”
        computer.addAirContinue();

        //Select Radio Button “Credit Card”
        computer.addReadioButton();

        //Click on “CONTINUE”
        computer.continuButton();

        //Select CREDIT CARD TYPE
        computer.craditCardType();

        //Add card holder name
        computer.cardHolderName();

        //Add card number
        computer.addCardNumber();

        //Add ExpireYear
        computer.expireYear();

        //Add card code number
        computer.addCardCodeNumber();

        //Click on “CONTINUE”
        computer.clickContinueend();

        //Verify “Payment Method” is “Credit Card”
        String actualCreditMethod = computer.checkCreditMethod();
        String expectedCreditMethod = "Credit Card";
        Assert.assertEquals(actualCreditMethod, expectedCreditMethod);
        computer.checkCreditMethod();

        //Verify “Shipping Method” is “Next Day Air”
        String actualShippingMethod = computer.checkShippingMethod();
        String expectedShippingMethod = "Next Day Air";
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod);
        computer.checkShippingMethod();

        //Verify Total is “$2,950.00”
        String actualTotalFinal = computer.checkTotalFinal();
        String expectedTotalFinal = "$2,950.00";
        Assert.assertEquals(actualTotalFinal, expectedTotalFinal);
        computer.checkTotalFinal();

        //Click on “CONFIRM”
        computer.clickConfirmOder();

        //Verify the Text “Thank You”
        String actualThankYou = computer.checkThankYou();
        String expectedThankYou = "Thank you";
        Assert.assertEquals(actualThankYou, expectedThankYou);
        computer.checkThankYou();

        //Verify the message “Your order has been successfully processed!”
        String actualorderprocessed = computer.yourOrderProcessed();
        String expectedorderprocessed = "Your order has been successfully processed!";
        Assert.assertEquals(actualorderprocessed, expectedorderprocessed);
        computer.yourOrderProcessed();

        //Click on “CONFIRM”
        computer.clickContinueConfirmOder();

        //Verify the text “Welcome to our store”
        String actualWelcomeStore = computer.textWelcomeStore();
        String expectedWelcomeStore = "Welcome to our store";
        Assert.assertEquals(actualWelcomeStore, expectedWelcomeStore);
        computer.textWelcomeStore();

}
}