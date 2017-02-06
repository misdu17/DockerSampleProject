package com.syful.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends MenuPage {

    @FindBy(id = "username")
    public WebElement usernameField;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    public WebElement signUpButton;

    @FindBy(css = ".lf-field.password.has-error span[class='err']")
    public WebElement passwordErrorMessage;


    public void submitSignUpInformation(String id, String email, String password){
        usernameField.clear();
        usernameField.sendKeys(id);
        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        signUpButton.click();
    }
}
