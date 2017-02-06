package com.syful.tests;

import com.syful.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WhatDockerTest extends TestBase {

    /**
     * This test case will navigate with different page and
     * verify page title, current url, and text on certain docs page
     */

    @Test
    public void testWhatDockerPageDetails(){
        menuPage.whatIsDockerLink.click();
        Assert.assertEquals(menuPage.getPageTitle(), "What is Docker?");
        whatDockerPage.getStartedWithDockerButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.docker.com/products/docker#/mac");
        whatDockerPage.getStartedTutorialButton.click();
        Assert.assertEquals(docsPage.documentationHeader.getText(), "Get started with Docker for Mac");
    }
}
