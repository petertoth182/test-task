package com.testinterview.serenity.pages;

import com.testinterview.serenity.USERS;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by Peter on 01/11/2017
 */
@DefaultUrl("/login")
public class LoginPage extends PageObject{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "submit")
    WebElementFacade login;

    @FindBy(id = "login")
    WebElementFacade username;

    @FindBy(id = "password")
    WebElementFacade password;

    public void login() {
        username.waitUntilVisible().sendKeys(USERS.USER1);
        password.waitUntilVisible().sendKeys(USERS.PASSWORD1);
        login.click();
    }
}
