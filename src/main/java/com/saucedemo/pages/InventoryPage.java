package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage extends Utility {

    By productsText = By.xpath("//span[contains(text(),'Products')]");

    public String getProductsText(){
        return getTextFromElement(productsText);
    }

    public int findActualNumberOfProducts(){
        List<WebElement> actualNumberOfProducts = driver.findElements((By.className("inventory_item")));
        int totalNumberOfProducts = actualNumberOfProducts.size();
        return totalNumberOfProducts;
    }

}
