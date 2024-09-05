/**
 * Copyright (c) 2024 - Elsevier Assessment.
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of Elsevier Assessment.
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Elsevier Assessment.
 * <p>
 * Created on: September 2, 2024
 * Author: Sudhakar Thangavelu
 */
package com.zalando.stepdefinitions;

import com.zalando.context.TestContext;
import com.zalando.pages.CheckoutPage;
import com.zalando.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * Step Definitions class for Checkout-related actions in Cucumber tests.
 *
 * The `CheckoutStepDefinitions` class contains the step definitions that map
 * Gherkin steps in Cucumber feature files to corresponding methods. These
 * methods interact with the CheckoutPage to perform various actions related
 * to the checkout process.
 */
public class CheckoutStepDefinitions {
    private final CheckoutPage checkoutPage;
    private final TestContext context;

    public CheckoutStepDefinitions(TestContext context) {
        this.context = context;
        checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
    }

    @Then("user get search results and click the Add to basket button")
    public void userGetSearchResultsAndClickTheAddToBasketButton() {
        this.checkoutPage.userGetSearchResultsAndClickAddToBasket();
    }

    @And("user should see the item added to the basket")
    public void userShouldSeeItemAddedToBasket() {
        this.checkoutPage.itemAddedToBasket();
    }

    @Then("user click the Go to Bag button and see the items")
    public void userClickGoToBagAndSeeTheItems() {
        this.checkoutPage.goToBagAndCheckout();
    }
}
