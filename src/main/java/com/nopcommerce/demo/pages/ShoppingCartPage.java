package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    public String getTitle() {
        return getTextFromElement(By.tagName("h1"));
    }

    public void addQuantityBy2() {
        sendTextToElement(By.xpath("//input[@class='qty-input']"), "2");
    }

    public void updateShoppingCart() {
        clickOnElement(By.id("updatecart"));
    }

    public void acceptTermsAndCondition() {
        clickOnElement(By.xpath("//label[contains(text(),'I agree with the terms of service and I adhere to ')]"));
    }

    public void checkOut() {
        clickOnElement(By.id("checkout"));
    }

    public String getTotalPrice() {
        return getTextFromElement(By.xpath("//span[@class='value-summary']//strong"));
    }
    public void updateQuantity(){
        sendTextToElement(By.xpath("//input[@class='qty-input']"), "2");
    }


}


