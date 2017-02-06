package com.syful.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocsPage extends MenuPage{

    @FindBy(css = "#DocumentationText>h1")
    public WebElement documentationHeader;

}
