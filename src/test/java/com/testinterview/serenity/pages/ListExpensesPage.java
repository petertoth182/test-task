package com.testinterview.serenity.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("/listexpenses")
public class ListExpensesPage extends PageObject {

    public ListExpensesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "table")
    WebElementFacade table;

    public boolean findExpense() {
        String category = (String) Serenity.getCurrentSession().get("category");
        String amount = (String) Serenity.getCurrentSession().get("amount");
        String reason = (String) Serenity.getCurrentSession().get("reason");

        List<WebElement> tr_collection = table.findElements(By.xpath("tbody/tr"));

        for (WebElement trElement : tr_collection) {
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));

            if (td_collection.get(1).equals(category)
                    && td_collection.get(2).equals(amount) && td_collection.get(3).equals(reason)) {
                return true;
            }
        }
        return false;
    }
}
