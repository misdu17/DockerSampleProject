package com.syful.tests;

import com.syful.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    /**
     * This test case focus on login error
     * when user enter invalid data
     */
    @Test
    public void testLoginWithInvalidData(){
        menuPage.loginWindow.click();
        menuPage.switchToNewWindow();
        Assert.assertEquals(loginPage.getPageTitle(), "Log in to Docker");
        loginPage.submitLoginInformation("mdjamaddar", "mdjamaddar");
        Assert.assertTrue(loginPage
                .authenticationErrorMessage
                .getText()
                .contains("Incorrect authentication credentials."));
    }

}
