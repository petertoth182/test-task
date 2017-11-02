package com.testinterview.serenity.steps;

import com.testinterview.serenity.pages.ListExpensesPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ListExpenses {
    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }


    ListExpensesPage listExpensesPage;

    @Then("^the new expense gets created and added to the List Expenses$")
    public void verify_new_expense() {
        listExpensesPage.findExpense();
    }
}
