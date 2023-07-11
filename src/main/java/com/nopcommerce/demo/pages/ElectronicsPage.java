package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilites.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElectronicsPage extends Utility {

    By electronicsMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By verifyCellPhone = By.xpath("//h1[normalize-space()='Cell phones']");
    By listView = By.xpath("//a[normalize-space()='List']");

    By nokiaLumia = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    By nokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By nokiaPrice = By.xpath("//*[@id=\"price-value-20\"]");
    By addQunty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addTocard = By.xpath("//button[@id='add-to-cart-button-20']");

    By shoppingCartMsg = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");//add new

    By shoppingCrat = By.xpath("//li[@id='topcartlink']");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')");//not work

    By shopCartMsg = By.xpath("//h1[normalize-space()='Shopping cart']");
    By addQunty2 = By.xpath("//input[@id='itemquantity11243']");

    By updateshopcart = By.xpath("//*[@id=\"updatecart\"]");
    By totalPrice = By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[6]/span");
    By agreeterms = By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]/label");
    By checkOut = By.xpath("//button[@id='checkout']");
    By welcome = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By register = By.xpath("//button[normalize-space()='Register']");
    By registerText = By.xpath("//h1[contains(text(),'Register')]");

    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//*[@id=\"Password\"]");
    By cinfirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    By registerButttion =By.xpath("//button[@id='register-button']");
    By registerTextMsg =By.xpath("//div[@class='result']");
    By clickOnContinue =By.xpath("//a[contains(text(),'Continue')]");
    By shopCartText=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By login=By.xpath("//a[contains(text(),'Log in')]");
    By clickToLoginButtion=By.xpath("//button[contains(text(),'Log in')]");
    By terumService =By.xpath("//input[@id='termsofservice']");
    By finalCheckout=By.xpath("//button[@id='checkout']");
    By country=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city=By.xpath("//input[@id='BillingNewAddress_City']");
    By address=By.xpath("//input[@id='BillingNewAddress_Address1']");

    By zipCode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By billContinue=By.xpath("//button[@onclick='Billing.save()']");

    By dayByAir=By.xpath("//label[contains(text(),'2nd Day Air ($0.00)')]");
    By shippingContinewMothod=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By craditCard=By.xpath("//input[@id='paymentmethod_1']");
    By craditcradContinue=By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By selectcraditcard =By.xpath("//*[@id=\"CreditCardType\"]");
    By cardHolderName=By.xpath("//input[@id='CardholderName']");
    By cardNumber=By.xpath("//input[@id='CardNumber']");
    By exYear=By.xpath("//select[@id='ExpireYear']");
    By cardCode=By.xpath("//input[@id='CardCode']");


    public void clickOnElectronicsMenu() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(electronicsMenu)).perform();
    }

    public void clickCellPhone() {
        clickOnElement(cellPhone);
    }

    public String textCellPhone() {
        return getTextFromElement(verifyCellPhone);
    }

    public void clickListView() {
        clickOnElement(listView);
    }

    public void clickNokiaLumia() {
        clickOnElement(nokiaLumia);
    }

    public String textNokialumia() {
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifiyNokiaPrice() {
        return getTextFromElement(nokiaPrice);
    }

    public void clearAndAddQuantity() {
        clearTextToElement(By.className("qty-input"));
        sendTextToElement(By.className("qty-input"), "2");
        clickOnElement(addQunty);
    }

    public void clickAddToCard() {
        clickOnElement(addTocard);
    }

    public String addtoshoppingCartMsg() {
        return getTextFromElement(shoppingCartMsg);
    }

    public void addtoClickCloseBar() {
        clickOnElement(closeBar);
    }

    public void goToShoppingCart() {
        clickOnElement(shoppingCrat);
    }

    public void mouseHoverShoppingCart() {

        mouseHoverToElement(shoppingCrat);
    }
    // public void clickToGoCart() {
    // clickOnElement(goToCart);
    // }


    public String shoppingCardMatchText() {
        return getTextFromElement(shopCartMsg);
    }

    public void clearAndAddQuantity2() {
        clearTextToElement(By.className("qty-input"));
        sendTextToElement(By.className("qty-input"), "2");
        clickOnElement(addQunty2);
    }

    public void updateShoppingcard2() {
        clickOnElement(updateshopcart);
    }

    public String CheckTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    public void agreeTurmService() {
        clickOnElement(agreeterms);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }

    public String welcomeSign() {
        return getTextFromElement(welcome);
    }

    public void clickOnRegister() {
        clickOnElement(register);
    }

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    public void checkoutAsRegister() {
        clickOnElement(register);
    }

    public void firstName() {
        sendTextToElement(firstName, "anu");
    }

    public void lastName1() {
        sendTextToElement(lastName, "patel");
    }

    public void emailaddress() {
        sendTextToElement(email, "Anu113@gmail.com");
    }


    public void addPassword() {
        sendTextToElement(password, "anu123456");
    }

    public void addconfirmPassword() {
        sendTextToElement(cinfirmPassword, "anu123456");
    }

    public void addToRegisterButton() {
        clickOnElement(registerButttion);
    }

    public String verifyRegisterTextMsg() {
        return getTextFromElement(registerTextMsg);
    }

    public void clickOnContinewafterRegister() {
        clickOnElement(clickOnContinue);
    }

    public String verifyShoppingCardText() {
        return getTextFromElement(shopCartText);
    }

    public void clickInLogin() {
        clickOnElement(login);
    }

    public void clickOnLoginButton() {
        clickOnElement(clickToLoginButtion);
    }

    public void agreeWithTuermService() {
        clickOnElement(terumService);
    }

    public void clickFinalCheckOut() {
        clickOnElement(finalCheckout);

    }
    public void addCountry() {
        WebElement dropDown = driver.findElement(country);
        Select select = new Select(dropDown);
        select.selectByValue("233");


    }

    public void addCity() {
        sendTextToElement(city, "London");
    }

    public void address1() {
        sendTextToElement(address, "12 High Road");
    }

    public void zipPostalCode() {
        sendTextToElement(zipCode, "ha9 4ru");

    }

    public void addPhoneNumber() {
        sendTextToElement(phoneNumber, "15974567890");
    }

    public void clickBillContinu() {
        clickOnElement( billContinue);
    }

    public void click2DayByAir() {
        clickOnElement(dayByAir);
    }

    public void ShippingContinue() {
        clickOnElement(shippingContinewMothod);
    }

    public void addRadioCraditCard() {
        clickOnElement(craditCard);
    }

    public void addtoConitnueButton() {
        clickOnElement(craditcradContinue);
    }
    public void craditCardType() {
        WebElement dropDown = driver.findElement(selectcraditcard);
        Select select4 = new Select(dropDown);
        select4.selectByValue("Visa");
    }

    public void addCardHolderName() {
        sendTextToElement(cardHolderName, "V Bamaniya");

    }

    public void addCardNumber() {
        sendTextToElement(cardNumber, "5368597055488705");
}
}