package com.syful.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends MenuPage{

    @FindBy(id = "st-search-input")
    public WebElement searchField;

    @FindBy(css = ".search-submit.btn.btn-default")
    public WebElement searchSubmitButton;

    @FindBy(css = ".entry-title>a")
    public WebElement searchTitle;

    public void searchYourText(String text){
        searchField.clear();
        searchField.sendKeys(text);
        searchSubmitButton.click();
    }
}
