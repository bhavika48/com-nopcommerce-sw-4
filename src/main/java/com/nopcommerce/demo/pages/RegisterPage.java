package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    public String getTitle() {
        return getTextFromElement(By.tagName("h1"));
    }
    public void enterRegistrationDetails(){
        sendTextToElement(By.id("FirstName"),"Ann");
        sendTextToElement(By.id("LastName"),"Martin");
        sendTextToElement(By.id("Email"),"ann456@gmail.com");
        sendTextToElement(By.id("Password"),"ann123");
        sendTextToElement(By.id("ConfirmPassword"),"ann123");

    }
    public void registerButton(){
        clickOnElement(By.id("register-button"));

    }
    public String getRegistrationMessage(){
      return   getTextFromElement(By.xpath("//div[@class='result']"));
    }
    public void selectRegisterSaveAndContinue(){
        clickOnElement(By.xpath("//a[@class='button-1 register-continue-button']"));
    }
}
