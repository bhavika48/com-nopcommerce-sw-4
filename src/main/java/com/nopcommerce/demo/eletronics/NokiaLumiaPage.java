package com.nopcommerce.demo.eletronics;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {
    public String getTitleNokiaLumia() {
        return getTextFromElement(By.linkText("Nokia Lumia 1020"));
    }

    public String getPriceOfNokiaLumia() {
        return getTextFromElement(By.xpath("//span[@id='price-value-20']"));
    }

    public void addQuantity() {
        sendTextToElement(By.id("product_enteredQuantity_20"), "2");
    }

    public void selectAddToCart() {
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-20']"));
    }

    public String getTitleMessageOfNokiaLumia() {
        return getTextFromElement(By.xpath("//div[@class='bar-notification success']"));
    }

    public void closeTab() {
        clickOnElement(By.xpath("//span[@title='Close']"));
    }

    public void mouseHoverToShoppingCartAnd() {
        mouseHoverToElement(By.xpath("//span[@class='cart-label']"));
    }

    public void selectGoToCart() {
        clickOnElement(By.xpath("//button[text()='Go to cart']"));
    }


}
