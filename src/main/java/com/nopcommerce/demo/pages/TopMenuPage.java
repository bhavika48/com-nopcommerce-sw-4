package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    //String login = new String();
    By logInLink = By.linkText("Log in");
    By computersLink = By.linkText("Computers");
    By electronicsLink = By.linkText("Electronics");
    By registerLink = By.linkText("Register");
    By desktopsLink = By.linkText("Desktops");

    public void clickOnLoginLink() {
        clickOnElement(logInLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnComputersMenu() {
        clickOnElement(computersLink);
    }

    public void clickOnElectronicsMenu() {
        clickOnElement(electronicsLink);
    }

    public void mouseHoverOnComputersMenu() {
        mouseHoverToElement(computersLink);
    }

    public void clickOnDesktopsSubMenu() {

        clickOnElement(desktopsLink);
    }

    public void mouseHoverOnElectronicsMenu() {
        mouseHoverToElement(electronicsLink);
    }

    public void mouseHoverAndClickOnCellPhonesMenu() {
        mouseHoverToElementAndClick(By.linkText("Cell phones"));
    }

}
