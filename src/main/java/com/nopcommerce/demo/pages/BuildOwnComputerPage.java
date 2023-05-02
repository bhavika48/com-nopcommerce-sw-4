package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildOwnComputerPage extends Utility {
    public String getPageTitle() {
        return getTextFromElement(By.tagName("h1"));

    }

    public void selectProcessorBy2_2() {
        selectByVisibleTextFromDropDown(By.id("product_attribute_1"), "2.2 GHz Intel Pentium Dual-Core E2200");

    }

    public void selectProcessorBy2_5() {

    }

    public void selectRamBy2GB() {

    }

    public void selectRamBy4GB() {

    }

    public void selectRamBy8GB() {
        selectByVisibleTextFromDropDown(By.id("product_attribute_2"), "8GB [+$60.00]");
    }

    public void selectHddBy320GB() {

    }

    public void selectHddBy400GB() {
        clickOnElement(By.xpath("//label[contains(text(),'400 GB [+$100.00]')]"));
    }

    public void selectOSByVistaHome() {

    }

    public void selectOSByVistaPremium() {
        clickOnElement(By.xpath(" //label[contains(text(),'Vista Premium [+$60.00]')]"));
    }

    public void selectSoftwareByTotalCommander() {
        clickOnElement(By.xpath("//label[contains(text(),'Total Commander [+$5.00]')]"));
    }

    public String getPrice() {
        return getTextFromElement(By.xpath("//span[@id='price-value-1']"));
    }

    public void clickOnAddToCart() {
        clickOnElement(By.id("add-to-cart-button-1"));
    }

    public String getTextProductBeenAddedToYourCart() {
        return getTextFromElement(By.xpath("//p[@class='content']"));
    }

    public void clickOnCloseMessage() {
        clickOnElement(By.xpath("//span[@title='Close']"));
    }

    public void mouseHoverShoppingCart() {
        mouseHoverToElement(By.xpath("//span[@class='cart-label']"));
    }

    public void clickOnGoToCart() {
        clickOnElement(By.xpath("//button[text()='Go to cart']"));
    }


}
