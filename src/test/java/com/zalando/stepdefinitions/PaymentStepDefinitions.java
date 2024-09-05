package com.zalando.stepdefinitions;

import com.zalando.context.TestContext;
import com.zalando.pages.PageFactoryManager;
import com.zalando.pages.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

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
