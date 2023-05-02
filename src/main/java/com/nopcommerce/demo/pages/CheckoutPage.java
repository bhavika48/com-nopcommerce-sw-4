package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    public void enterFirstNameAndLastName() {
        sendTextToElement(By.id("BillingNewAddress_FirstName"), "Tom");
        sendTextToElement(By.id("BillingNewAddress_LastName"), "Olins");
    }

    public void enterEmail() {
        sendTextToElement(By.id("BillingNewAddress_Email"), "tom123@gmail.com");
    }

    public void enterBillingAddress() {
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "American Samoa");
        sendTextToElement(By.id("BillingNewAddress_City"), "Texas");
        sendTextToElement(By.id("BillingNewAddress_Address1"), "50 Cecli Road");
        sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"), "Tw3 4QP");
        sendTextToElement(By.id("BillingNewAddress_PhoneNumber"), "04562341345");

    }

    public void billingSaveAndContinue() {
        clickOnElement(By.xpath("//button[@onclick='Billing.save()']"));
    }

    public void selectShippingByNextDayAir() {
        clickOnElement(By.xpath("//label[normalize-space()='Next Day Air ($0.00)']"));

    }

    public void selectShippingBySecondDayAir() {
        clickOnElement(By.xpath("//label[normalize-space()='2nd Day Air ($0.00)']"));

    }

    public void shippingSaveAndContinue() {
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));

    }

    public void selectPaymentMethodByCreditCard() {
        clickOnElement(By.xpath("//label[normalize-space()='Credit Card']"));

    }

    public void paymentMethodSaveAndContinue() {
        clickOnElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
    }

    public void selectCreditCardByMasterCard() {
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"), "Master card");
    }

    public void selectCreditCardByVisa() {
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"), "Visa");
    }

    public void enterCreditCardDetails() {
        sendTextToElement(By.id("CardholderName"), "Tom");
        sendTextToElement(By.xpath("//input[@id='CardNumber']"), "5105105105105100");
        selectByVisibleTextFromDropDown(By.id("ExpireMonth"), "02");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireYear']"), "2025");
        sendTextToElement(By.xpath("//input[@id='CardCode']"), "123");
    }

    public void paymentSaveAndContinue() {
        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
    }

    public String getPaymentMethod() {
        return getTextFromElement(By.xpath("//li[@class='payment-method']//span[@class='value']"));
    }

    public String getShippingMethod() {
        return getTextFromElement(By.xpath("//li[@class='shipping-method']//span[@class='value']"));
    }

    public String getTotalPrice() {
        return getTextFromElement(By.xpath("//span[@class='value-summary']//strong"));
    }

    public void selectConfirm() {
        clickOnElement(By.xpath("//button[normalize-space()='Confirm']"));
    }

    public String getThankYouMessage() {
        return getTextFromElement(By.xpath("//h1[normalize-space()='Thank you']"));
    }

    public String getOrderMessage() {
        return getTextFromElement(By.xpath("//div[@class='page checkout-page order-completed-page']"));
    }

    public void selectContinue() {
        clickOnElement(By.xpath("//button[normalize-space()='Continue']"));
    }

    public String getWellComeToOurStore() {
        return getTextFromElement(By.xpath("//h2[normalize-space()='Welcome to our store']"));
    }
    public String get2ndDayAirText(){
      return   getTextFromElement(By.xpath("//li[@class='shipping-method']//span[@class='value']"));
    }
    public void selectLogOut(){
        clickOnElement(By.xpath("//a[normalize-space()='Log out']"));
    }


}
