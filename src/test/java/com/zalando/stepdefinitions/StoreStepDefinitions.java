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
import com.zalando.pages.StorePage;
import io.cucumber.java.en.Given;

/**
 * Step Definitions class for Store-related actions in Cucumber tests.
 *
 * The `StoreStepDefinitions` class contains the step definitions that map
 * Gherkin steps in Cucumber feature files to corresponding methods. These
 * methods interact with the StorePage to perform various actions related
 * to the store process.
 */
public class StoreStepDefinitions {
    private final StorePage storePage;
    private final TestContext context;

    public StoreStepDefinitions(TestContext context) {
        this.context = context;
        storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @Given("^user navigates to store page \"([^\"]*)\"$")
    public void userNavigatesToStorePage(String country) {
        this.storePage.goToStorePage(country);
    }
}
