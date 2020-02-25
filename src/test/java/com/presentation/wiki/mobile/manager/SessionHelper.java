package com.presentation.wiki.mobile.manager;


import com.presentation.wiki.mobile.models.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SessionHelper extends HelperBase {
    public SessionHelper(AppiumDriver md) {
        super(md);
    }

    public void fillLogInForm(User user) throws InterruptedException {
        type(By.id("login_username_text"), user.getUsername());
        pause(3000);
        type(By.id("login_password_input"), user.getPassword());
        pause(3000);



    }
    public void tapMenuButton(){
        tap(By.id("menu_overflow_button"));

    }
    public void tapLogIntoWiki(){
        tap(By.id("explore_overflow_account_name"));

    }
    public void tapLogIn(){
        tap(By.id("login_button"));

    }


}
