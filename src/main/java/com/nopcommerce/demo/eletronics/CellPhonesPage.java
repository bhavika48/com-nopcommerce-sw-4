package com.nopcommerce.demo.eletronics;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {

    By title = By.tagName("h1");


    public String getTitle(){
        return getTextFromElement(title);
    }
    public void checkListViewOfCellPhones(){
        clickOnElement(By.xpath("//a[normalize-space()='List']"));
    }
    public void selectproductNameByNokiaLumia1020(){
        clickOnElement(By.linkText("Nokia Lumia 1020"));
    }

    }



