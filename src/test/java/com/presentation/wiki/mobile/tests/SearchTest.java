package com.presentation.wiki.mobile.tests;

import com.presentation.wiki.mobile.models.Article;
import com.presentation.wiki.mobile.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends TestBase{
    @Test
    public void testSearch() throws InterruptedException {
        String searchText="Java";
        app.getArticle().pause(4000);
        app.getArticle().tapSearchBar();
        app.getArticle().pause(4000);
        app.getArticle().searchArticle(new Article().withArticleName("Java"));
        app.getArticle().pause(4000);
//        app.getArticle().getArticleName();
//        app.getArticle().pause(3000);
//        String articleName = app.getArticle().getArticleName();
//        Assert.assertEquals(searchText,articleName);

    }



}
