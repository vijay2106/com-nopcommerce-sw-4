package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilites.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {

    By computerMenu = By.xpath("//a[text()='Computers ']");
    By computerText = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

    public void clickOnComputerMenu(){
        clickOnElement(computerMenu);
    }

    public String getComputerText(){
        return getTextFromElement(computerText);
}

}