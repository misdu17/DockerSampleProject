package com.syful.tests;

import com.syful.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase{

    /**
     * This test case focus on signup error
     * when user enter invalid error
     */
    @Test
    public void testSignUpWithInvalidPasswordLength(){
        menuPage.signUpWindow.click();
        menuPage.switchToNewWindow();
        Assert.assertEquals(signUpPage.getPageTitle(), "Docker Cloud - Build, Ship and Run any App, Anywhere");
        signUpPage.submitSignUpInformation("mdjamaddar", "mdjamaddar@mail.com", "md");
        Assert.assertTrue(signUpPage
                .passwordErrorMessage
                .getText()
                .contains("Ensure this value has at least 6 characters"));
    }

}
