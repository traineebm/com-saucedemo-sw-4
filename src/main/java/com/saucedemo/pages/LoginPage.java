package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By login = By.id("login-button");


    public void enterUsernameField(String name){
        sendTextToElement(usernameField,name);
    }

    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(login);
    }

}
