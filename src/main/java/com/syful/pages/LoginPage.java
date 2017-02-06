package com.syful.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MenuPage{

    @FindBy(id = "nw_username")
    public WebElement dockerIdField;

    @FindBy(id = "nw_password")
    public WebElement passwordField;

    @FindBy(id = "nw_submit")
    public WebElement loginButton;

    @FindBy(css = "div [class='styles__error__1v2q-']")
    public WebElement authenticationErrorMessage;


    public void submitLoginInformation(String username, String password){
        dockerIdField.clear();
        dockerIdField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        loginButton.click();
    }


}
