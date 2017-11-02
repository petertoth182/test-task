package com.testinterview.serenity.steps;

import com.testinterview.serenity.pages.AddExpensesPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddExpensesSteps {
    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }


    AddExpensesPage addExpensesPage;

    @When("^User navigates to Add expenses page$")
    public void goto_addexpenses_page() {
        addExpensesPage.open();
    }

    @Then("^Date, category, amount and description of the expense fields are displayed$")
    public void field_displayed() {
        addExpensesPage.fieldsDisplayed();
    }

    @And("^User fills out all the details for$")
    public void fillout_expense() {
        addExpensesPage.fillout_expense();
    }
}
