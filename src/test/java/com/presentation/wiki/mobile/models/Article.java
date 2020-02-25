package com.presentation.wiki.mobile.models;

public class Article {
    private  String articleName;


    public String getArticleName() {

        return articleName;
    }
    public Article withArticleName(String articleName) {
        this.articleName = articleName;
        return this;
    }

}
