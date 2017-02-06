package com.syful.pages;

import com.syful.base.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends PageBase{

    @FindBy(css = ".row.desktop a[href='/what-docker']")
    public WebElement whatIsDockerLink;

    @FindBy(css = ".row.desktop a[href='/products/overview']")
    public WebElement getDockerLink;

    @FindBy(css = ".row.desktop a[href='/pricing']")
    public WebElement pricingLink;

    @FindBy(css = ".row.desktop a[href='/technologies/overview']")
    public WebElement openSourceLink;

    // element locators for new window

    @FindBy(css = ".row.desktop a[href='https://docs.docker.com/']")
    public WebElement docsWindow;

    @FindBy(css = ".row.desktop a[href='https://cloud.docker.com/']")
    public WebElement signUpWindow;

    @FindBy(css = ".row.desktop a[href='https://cloud.docker.com/login/']")
    public WebElement loginWindow;

    @FindBy(css = ".row.desktop a[href='https://blog.docker.com/']")
    public WebElement blogWindow;


}
