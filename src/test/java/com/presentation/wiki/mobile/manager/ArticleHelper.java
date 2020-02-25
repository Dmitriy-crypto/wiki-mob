package com.presentation.wiki.mobile.manager;

import com.presentation.wiki.mobile.models.Article;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ArticleHelper extends HelperBase{
    public ArticleHelper(AppiumDriver md) {
        super(md);
    }

    public void tapSearchBar() throws InterruptedException {
tap(By.id("search_container"));
pause(3000);
    }


    public void searchArticle(Article article) throws InterruptedException {
        pause(3000);
        type(By.id("search_src_text"), article.getArticleName());
        md.getKeyboard().sendKeys(Keys.ENTER);// Keys.RETURN also doesn't work
        pause(4000);

    }
    public String getArticleName() {
        return md.findElement(By.id("view_page_title_text")).getText();
    }




}
