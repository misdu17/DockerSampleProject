package com.syful.tests;

import com.syful.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogSearchTest extends TestBase{

    /**
     * This test case focus on search a specific article
     * and validate the search title
     */
    @Test
    public void testSearchPostOnBlogPage(){
        menuPage.blogWindow.click();
        menuPage.switchToNewWindow();
        Assert.assertEquals(blogPage.getPageTitle(), "Docker Blog - News and versions will be announced here");
        blogPage.searchYourText("Q&A: 15 Questions AWS Users Ask About DDC For AWS");
        Assert.assertTrue(blogPage
                .searchTitle
                .getText()
                .contains("15 Questions AWS Users Ask About DDC"));
    }
}
