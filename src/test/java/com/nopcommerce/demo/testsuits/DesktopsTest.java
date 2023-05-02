package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DesktopsTest extends BaseTest {
    DesktopsPage desktopsPage = new DesktopsPage();
    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        topMenuPage.mouseHoverOnComputersMenu();
        topMenuPage.clickOnDesktopsSubMenu();
        ArrayList<String> actualProducts = desktopsPage.getProductsNameByOriginalOrder();
        // select drop down
        desktopsPage.selectProductsByAscendingOrder();
        Thread.sleep(3000);

        ArrayList<String> expectedProducts = desktopsPage.getProductsNameByAscendingOrder();
        Assert.assertEquals(actualProducts,expectedProducts);
       

    }
    @Test
    public void verifyProductArrangeInDescendingOrder() throws InterruptedException {
        topMenuPage.mouseHoverOnComputersMenu();
        topMenuPage.clickOnDesktopsSubMenu();
        ArrayList<String> actualProducts = desktopsPage.getProductsNameByOriginalOrder();

        desktopsPage.selectProductsByDescendingOrder();
        Thread.sleep(3000);

        ArrayList<String> expectedProducts = desktopsPage.getProductsNameByDescendingOrder();
        Assert.assertEquals(actualProducts,expectedProducts);

    }

}
