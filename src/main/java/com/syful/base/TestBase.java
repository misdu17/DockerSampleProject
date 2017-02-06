package com.syful.base;

import com.syful.listener.TestSessionListener;
import com.syful.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Listeners(TestSessionListener.class)
public class TestBase extends Driver{
    // Data read from property file
    protected String environment 	= myTestProperty.getEnvironment();
    protected String browserType 	= myTestProperty.getBrowser();
    protected String userId 		= myTestProperty.getProperty(environment, "userId");
    protected String password 		= myTestProperty.getProperty(environment, "password");
    protected String appURL 		= myTestProperty.getProperty(environment, "appURL");

    // Instance of all the pages
    protected static MenuPage menuPage;
    protected static WhatDockerPage whatDockerPage;
    protected static DocsPage docsPage;
    protected static SignUpPage signUpPage;
    protected static LoginPage loginPage;
    protected static BlogPage blogPage;

    @BeforeClass()
    public void setUp() {
        try {
            setDriver(browserType);
            driver.get(appURL);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }

        menuPage             = PageFactory.initElements(driver, MenuPage.class);
        whatDockerPage       = PageFactory.initElements(driver, WhatDockerPage.class);
        docsPage             = PageFactory.initElements(driver, DocsPage.class);
        signUpPage           = PageFactory.initElements(driver, SignUpPage.class);
        loginPage            = PageFactory.initElements(driver, LoginPage.class);
        blogPage             = PageFactory.initElements(driver, BlogPage.class);
    }

    @AfterClass()
    public void tearDown() {
        driver.quit();
    }
}
