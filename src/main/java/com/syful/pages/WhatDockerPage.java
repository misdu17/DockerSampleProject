package com.syful.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatDockerPage extends MenuPage {

    @FindBy(css = "a[class='button white-btn'][href='/products/docker#mac']")
    public WebElement getStartedWithDockerButton;

    @FindBy(css = "a[class='button white-btn'][href='http://docs.docker.com/docker-for-mac/']")
    public WebElement getStartedTutorialButton;

}
