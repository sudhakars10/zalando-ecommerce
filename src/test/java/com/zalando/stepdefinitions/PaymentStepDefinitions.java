/**
 * Copyright (c) 2024 - Elsevier Assessment.
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of Elsevier Assessment.
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Elsevier Assessment.
 * <p>
 * Created on: September 3, 2024
 * Author: Sudhakar Thangavelu
 */
package com.zalando.stepdefinitions;

import com.zalando.context.TestContext;
import com.zalando.pages.PageFactoryManager;
import com.zalando.pages.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * Step Definitions class for Payment-related actions in Cucumber tests.
 *
 * The `PaymentStepDefinitions` class contains the step definitions that map
 * Gherkin steps in Cucumber feature files to corresponding methods. These
 * methods interact with the PaymentPage to perform various actions related
 * to the payment process.
 */
public class PaymentStepDefinitions {
    private final PaymentPage paymentPage;
    private final TestContext context;

    public PaymentStepDefinitions(TestContext context) {
        this.context = context;
        paymentPage = PageFactoryManager.getPaymentPage(context.driver);
    }

    @Then("user select the payment type")
    public void userSelectThePaymentType() {
        this.paymentPage.userSelectPaymentType();
    }

    @And("user add the Card Holder name")
    public void userAddTheCardHolderName() {
        this.paymentPage.userAddCardHolderName();
    }

    @Then("user add the Card Number")
    public void userAddTheCardNumber() {
        this.paymentPage.userAddCardNumber();
    }

    @Then("user add the Expiry Date")
    public void userAddTheExpiryDate() {
        this.paymentPage.userAddExpiryDate();
    }

    @And("user add the Security Code")
    public void userAddTheSecurityCode() {
        this.paymentPage.userAddSecurityCode();
    }

    @Then("user click the Next button for confirm the payment")
    public void userClickNextButtonConfirmThePayment() {
        this.paymentPage.userClickNextButtonConfirmPayment();
    }
}
