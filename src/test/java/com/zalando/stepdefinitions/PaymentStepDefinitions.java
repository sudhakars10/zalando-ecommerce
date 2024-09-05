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
        this.paymentPage.userSelectThePaymentType();
    }

    @And("user add the Card Holder name")
    public void userAddTheCardHolderName() {
        this.paymentPage.userAddTheCardHolderName();
    }

    @And("user add the Card number")
    public void userAddTheCardNumber() {
        this.paymentPage.userAddTheCardNumber();
    }

    @And("user add the Expiry date")
    public void userAddTheExpiryDate() {
        this.paymentPage.userAddTheExpiryDate();
    }

    @And("user add the Security code")
    public void userAddTheSecurityCode() {
        this.paymentPage.userAddTheSecurityCode();
    }

    @Then("user click the Next button for confirm the payment")
    public void userClickNextButtonConfirmThePayment() {
        this.paymentPage.userClickNextButtonConfirmThePayment();
    }
}
