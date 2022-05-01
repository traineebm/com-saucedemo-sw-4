package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPg = new LoginPage();
    InventoryPage inventoryPg = new InventoryPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPg.enterUsernameField("standard_user");
        loginPg.enterPasswordField("secret_sauce");
        loginPg.clickOnLoginButton();
        String actualMessage = inventoryPg.getProductsText();
        Assert.assertEquals(actualMessage, "PRODUCTS", "PRODUCTS text missing");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPg.enterUsernameField("standard_user");
        loginPg.enterPasswordField("secret_sauce");
        loginPg.clickOnLoginButton();

        int expectedNumberOfProducts = 6;
        int actualNumberOfProducts = inventoryPg.findActualNumberOfProducts();
        Assert.assertEquals(actualNumberOfProducts,expectedNumberOfProducts, "Unable to see number of products");
    }
}
