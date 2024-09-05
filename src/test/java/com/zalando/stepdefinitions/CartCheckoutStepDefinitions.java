package com.zalando.stepdefinitions;

import com.zalando.context.TestContext;
import com.zalando.pages.CartCheckoutPage;
import com.zalando.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartStepDefinitions {
    private final CartCheckoutPage cartCheckoutPage;
    private final TestContext context;

    public CartStepDefinitions(TestContext context) {
        this.context = context;
        cartCheckoutPage = PageFactoryManager.getCartPage(context.driver);
    }

    @And("user get search results and click the Add to basket button")
    public void userGetSearchResultsAndClickTheAddToBasketButton() {
        this.cartCheckoutPage.userGetSearchResultsAndClickAddToBasket();
    }

    @Then("user should see the item added to the basket")
    public void userShouldSeeItemAddedToBasket() {
        this.cartCheckoutPage.itemAddedToBasket();
    }

    @And("user click the Go to Bag button and see the items")
    public void userClickGoToBagAndSeeTheItems() {
        this.cartCheckoutPage.goToBagAndCheckout();
    }
}
