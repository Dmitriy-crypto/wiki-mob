package com.presentation.wiki.mobile.tests;

import com.presentation.wiki.mobile.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testLogin() throws InterruptedException {
        app.getSession().pause(5000);
        app.getSession().tapMenuButton();
        app.getSession().pause(3000);
        app.getSession().tapLogIntoWiki();
        app.getSession().fillLogInForm(new User().withUsername("matvey.telran").withPassword("a0Z70F56"));
        app.getSession().pause(3000);
        app.getSession().tapLogIn();
        app.getSession().pause(3000);
        app.getSession().tapMenuButton();


    }





}
