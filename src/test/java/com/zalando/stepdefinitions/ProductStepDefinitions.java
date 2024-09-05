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
import com.zalando.pages.PageFactoryManager;
import com.zalando.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Step Definitions class for Product-related actions in Cucumber tests.
 *
 * The `ProductStepDefinitions` class contains the step definitions that map
 * Gherkin steps in Cucumber feature files to corresponding methods. These
 * methods interact with the ProductPage to perform various actions related
 * to the product process.
 */
public class ProductStepDefinitions {
    private final ProductPage productPage;
    private final TestContext context;

    public ProductStepDefinitions(TestContext context) {
        this.context = context;
        productPage = PageFactoryManager.getProductPage(context.driver);
    }

    @When("^user searches for \"([^\"]*)\"$")
    public void userSearchesFor(String searchValue) {
        this.productPage.searchFor(searchValue);
    }

    @Then("user press the Enter key and get search results")
    public void userSeeSearchResultsByEnterKey() {
        this.productPage.searchResultsByEnterKey();
    }
}
