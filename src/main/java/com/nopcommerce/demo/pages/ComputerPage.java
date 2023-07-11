package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilites.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ComputerPage extends Utility {
    By computerMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktopTab = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");
    By sortByZtoA = By.xpath("//option[normalize-space()='Name: Z to A']");

    By sortByAtoZ = By.xpath("//option[@value='5']");

    By addtocard = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    //Verify the Text "Build your own computer"
    By buildyourowncomputer = By.xpath("//h1[normalize-space()='Build your own computer']");

    //Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By selectProcessor = By.name("product_attribute_1");
    By selectprocessor8Gb = By.name("product_attribute_2");
    By selectradioHdd = By.xpath("//*[@id=\"product_attribute_input_3\"]/ul/li[2]/label");
    By vistaPremium = By.xpath("//*[@id=\"product_attribute_input_4\"]/ul/li[2]/label");

    By microsoftOffice = By.xpath("//input[@id='product_attribute_5_12']");

    By priceMatch = By.xpath("//*[@id=\"price-value-1\"]");

    By addtocard1 = By.xpath("//button[@id='add-to-cart-button-1']");

    By productAddCradMsg = By.xpath("//p[@class='content']");

    By crossButton = By.xpath("//span[@title='Close']");

    By gotoCrad = By.xpath("//span[contains(text(),'Shopping cart')]");
    By shoppingCrat = By.xpath("//*[@id=\"flyout-cart\"]/div/div[4]/button");

    By ShoopingCardMsg = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");

    By addQunty = By.xpath("//input[@class='qty-input']");
    By updatecard = By.xpath("//button[@id='updatecart']");
    By totalPrice = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By agree = By.xpath("//label[contains(text(),'I agree with the terms of service and I adhere to ')]");
    By checkout = By.xpath("//button[@id='checkout']");
    By welcome = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By guest = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By name = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    // By state=By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipcode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phone = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continu = By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");
    By air = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]");
    By airContinu = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By craditradio = By.xpath("//label[contains(text(),'Credit Card')]");
    By aftershopContinue = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
    By selectcraditcard = By.xpath("//select[@id='CreditCardType']");
    By cardholdername = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By cardexYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continuEnd = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By creditMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By totalFinal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirmOder = By.xpath("//button[normalize-space()='Confirm']");
    By thankYouMsg = By.xpath("//h1[normalize-space()='Thank you']");
    By oderProcessed = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueConfirmOder = By.xpath("//button[normalize-space()='Continue']");
    By textWelcome = By.xpath("//h2[normalize-space()='Welcome to our store']");

    public void clickOnComputerMenu() {
        clickOnElement(computerMenu);
    }

    public void clickOnDeskTopMenu() {
        clickOnElement(desktopTab);
    }

    public String getSortByText() {
        return getTextFromElement(sortByZtoA);
    }

    public void setSortByZtoA() {
        clickOnElement(sortByZtoA);
    }

    public void setSortByAtoZ() {
        clickOnElement(sortByAtoZ);
    }

    public void addtocard() {
        clickOnElement(addtocard);
    }

    public String getBuildYourComputerText() {
        return getTextFromElement(buildyourowncomputer);
    }

    public void selectProcessor() {
        WebElement dropDown = driver.findElement(selectProcessor);
        Select select = new Select(dropDown);
        select.selectByValue("1");
    }

    public void selectprocessor8Gb() {
        WebElement dropDown = driver.findElement(selectprocessor8Gb);
        Select select = new Select(dropDown);
        select.selectByValue("5");
    }

    public void radioHdd() {
        clickOnElement(selectradioHdd);
    }

    public void vistaPremiumOsRadio() {
        clickOnElement(vistaPremium);
    }

    public void microsoftOfficeSoftwer() {
        clickOnElement(microsoftOffice);
    }

    public String processorPriceMatch() {
        return getTextFromElement(priceMatch);
    }

    public void selectAddtocard1() {
        clickOnElement(addtocard1);
    }

    public String productAddCradMsgMatch() {
        return getTextFromElement(productAddCradMsg);
    }

    public void clickCrossButton() {
        clickOnElement(crossButton);
    }

    public void gotocard() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(gotoCrad)).perform();
    }

    public void goToShoppingCart() {
        clickOnElement(shoppingCrat);
    }

    public String shoppingCardMatch() {
        return getTextFromElement(ShoopingCardMsg);
    }

    public void clearAndAddQuantity() {
        clearTextToElement(By.className("qty-input"));
        sendTextToElement(By.className("qty-input"), "2");
        clickOnElement(addQunty);
    }

    public void updateShoppingcard() {
        clickOnElement(updatecard);
    }

    public String totalpricematch() {
        return getTextFromElement(totalPrice);
    }

    public void agreeTurm() {
        clickOnElement(agree);
    }

    public void gotoCheckout() {
        clickOnElement(checkout);
    }

    public String welcomeSign() {
        return getTextFromElement(welcome);
    }

    public void checkoutAsGuest() {
        clickOnElement(guest);
    }

    public void firstName() {
        sendTextToElement(firstName, "vijay");
    }

    public void lastName1() {
        sendTextToElement(lastName, "bamaniya");
    }

    public void emailaddress() {
        sendTextToElement(email, "vijay123@gmail.com");
    }

    public void addCountry() {
        WebElement dropDown = driver.findElement(country);
        Select select = new Select(dropDown);
        select.selectByValue("233");
    }

    /*public void addState(){
         WebElement dropDown = driver.findElement(state);
         Select select = new Select(dropDown);
         select.selectByVisibleText("");}*/
    public void addCity() {
        sendTextToElement(city, "London");
    }

    public void addAddress() {
        sendTextToElement(address, "Talbot Road");
    }

    public void addzipcode() {
        sendTextToElement(zipcode, "Ha3 5QA");
    }

    public void addPhoneNumber() {
        sendTextToElement(phone, "1234567890");
    }

    public void clickContinue() {
        clickOnElement(continu);
    }

    public void byAir() {
        clickOnElement(air);
    }

    public void addAirContinue() {
        clickOnElement(airContinu);
    }

    public void addReadioButton() {
        clickOnElement(craditradio);
    }

    public void continuButton() {
        clickOnElement(aftershopContinue);
    }

    public void craditCardType() {
        WebElement dropDown = driver.findElement(selectcraditcard);
        Select select4 = new Select(dropDown);
        select4.selectByValue("MasterCard");
    }

    public void cardHolderName() {
        sendTextToElement(cardholdername, "Viju");
    }

    public void addCardNumber() {
        sendTextToElement(cardNumber, "7895555566554433");
    }

    public void expireYear() {
        sendTextToElement(cardexYear, "2026");
    }

    public void addCardCodeNumber() {
        sendTextToElement(cardCode, "456");
    }

    public void clickContinueend() {
        clickOnElement(continuEnd);
    }

    public String checkCreditMethod() {
        return getTextFromElement(creditMethod);
    }

    public String checkShippingMethod() {
        return getTextFromElement(shippingMethod);
    }

    public String checkTotalFinal() {
        return getTextFromElement(totalFinal);
    }

    public void clickConfirmOder() {
        clickOnElement(confirmOder);
    }

    public String checkThankYou() {
        return getTextFromElement(thankYouMsg);
    }

    public String yourOrderProcessed() {
        return getTextFromElement(oderProcessed);
    }


    public void clickContinueConfirmOder() {
        clickOnElement(continueConfirmOder);
    }

    public String textWelcomeStore() {
        return getTextFromElement(textWelcome);
}
}