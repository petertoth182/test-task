package com.testinterview.serenity.steps;

import com.testinterview.serenity.pages.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

/**
 * Created by Peter on 01/11/2017
 */
public class LoginSteps {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    LoginPage loginPage;

    @Given("^User logged in$")
    public void goto_login_page() {
        loginPage.open();
        loginPage.login();
    }
}
