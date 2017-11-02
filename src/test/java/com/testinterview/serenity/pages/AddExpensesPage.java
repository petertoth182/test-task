package com.testinterview.serenity.pages;

import com.testinterview.serenity.CATEGORIES;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.ThreadLocalRandom;

@DefaultUrl("/addexpense")
public class AddExpensesPage extends PageObject {

    public AddExpensesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "day")
    WebElementFacade day;

    @FindBy(id = "month")
    WebElementFacade month;

    @FindBy(id = "year")
    WebElementFacade year;

    @FindBy(id = "category")
    WebElementFacade category;

    @FindBy(id = "amount")
    WebElementFacade amount;

    @FindBy(id = "reason")
    WebElementFacade reason;

    @FindBy(id = "reset")
    WebElementFacade reset;

    @FindBy(id = "submit")
    WebElementFacade submit;


    public void submit() {
       submit.click();
    }

    public void reset() {
        reset.click();
    }

    public void setDay(String s) {
        day.clear();
        day.sendKeys(s);
    }

    public void setMonth(String s) {
        month.clear();
        month.sendKeys(s);
    }

    public void setYear(String s) {
        year.clear();
        year.sendKeys(s);
    }

    public void setAmount(String s) {
        amount.sendKeys(s);
    }

    public void setReason(String s) {
        reason.sendKeys(s);
    }

    public void chooseCategory(String s) {
        category.selectByVisibleText(s);
    }

    public void fieldsDisplayed() {
        Assert.assertTrue(day.isDisplayed());
        Assert.assertTrue(month.isDisplayed());
        Assert.assertTrue(year.isDisplayed());
        Assert.assertTrue(category.isDisplayed());
        Assert.assertTrue(amount.isDisplayed());
        Assert.assertTrue(reason.isDisplayed());
    }

    public void fillout_expense() {
        int amount = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        int reason = ThreadLocalRandom.current().nextInt(1, 100000 + 1);

        chooseCategory(CATEGORIES.CATEGORY1);
        setAmount(Integer.toString(amount));
        setReason(Integer.toString(reason));

        Serenity.getCurrentSession().put("category", CATEGORIES.CATEGORY1);
        Serenity.getCurrentSession().put("amount", Integer.toString(amount));
        Serenity.getCurrentSession().put("reason", Integer.toString(reason));

        submit.click();
    }
}
