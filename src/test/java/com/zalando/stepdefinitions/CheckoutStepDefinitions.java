package com.zalando.stepdefinitions;

import com.zalando.context.TestContext;
import com.zalando.pages.CheckoutPage;
import com.zalando.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutStepDefinitions {
    private final CheckoutPage checkoutPage;
    private final TestContext context;

    public CheckoutStepDefinitions(TestContext context) {
        this.context = context;
        checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
    }

    @And("user get search results and click the Add to basket button")
    public void userGetSearchResultsAndClickTheAddToBasketButton() {
        this.checkoutPage.userGetSearchResultsAndClickAddToBasket();
    }

    @Then("user should see the item added to the basket")
    public void userShouldSeeItemAddedToBasket() {
        this.checkoutPage.itemAddedToBasket();
    }

    @And("user click the Go to Bag button and see the items")
    public void userClickGoToBagAndSeeTheItems() {
        this.checkoutPage.goToBagAndCheckout();
    }
}
