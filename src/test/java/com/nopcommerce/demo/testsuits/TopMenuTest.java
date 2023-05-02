package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.eletronics.CellPhonesPage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testBase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuPage topMenuPage = new TopMenuPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        topMenuPage.clickOnComputersMenu();
        String expectedMessage = "Computers";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToElectronicsPageSuccessfully() {
        topMenuPage.clickOnElectronicsMenu();
        String expectedMessage = "Electronics";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        topMenuPage.mouseHoverOnComputersMenu();
        topMenuPage.clickOnDesktopsSubMenu();
        String expectedMessage = "Desktops";
        String actualMessage = getTextFromElement(By.xpath("//h1[normalize-space()='Desktops']"));
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        // 1.1 Mouse Hover on “Electronics”Tab
        topMenuPage.mouseHoverOnElectronicsMenu();

        // 1.2 Mouse Hover on “Cell phones” and click
        topMenuPage.mouseHoverAndClickOnCellPhonesMenu();
        //1.3 Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonesPage.getTitle();
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}

