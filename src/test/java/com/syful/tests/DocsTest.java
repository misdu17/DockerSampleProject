package com.syful.tests;

import com.syful.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocsTest extends TestBase {

    /**
     * This test case focus on window handlers
     * It's click on a link that opens a new window and validate its title
     */
    @Test
    public void testDocPageDetailsWhenOpenInAnotherWindow(){
        menuPage.docsWindow.click();
        menuPage.switchToNewWindow();
        Assert.assertEquals(docsPage.getPageTitle(), "Docker Documentation - Docker");
        docsPage.switchToDefaultWindow();
        Assert.assertEquals(menuPage.getPageTitle(), "Docker - Build, Ship, and Run Any App, Anywhere");
    }
}
