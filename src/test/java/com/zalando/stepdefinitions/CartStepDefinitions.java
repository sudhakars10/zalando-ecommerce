package com.zalando.stepdefinitions;

import com.zalando.context.TestContext;
import com.zalando.pages.CartPage;
import com.zalando.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartStepDefinitions {
    private final CartPage cartPage;
    private final TestContext context;

    public CartStepDefinitions(TestContext context) {
        this.context = context;
        cartPage = PageFactoryManager.getCartPage(context.driver);
    }

    @And("user get search results and click the Add to basket button")
    public void userGetSearchResultsAndClickTheAddToBasketButton() {
        this.cartPage.userGetSearchResultsAndClickAddToBasket();
    }

    @Then("user should see the item added to the basket")
    public void userShouldSeeItemAddedToBasket() {
        this.cartPage.itemAddedToBasket();
    }

    @And("user click the Go to Bag button and see the items")
    public void userClickGoToBagAndSeeTheItems() {
        this.cartPage.goToBagAndCheckout();
    }
}
