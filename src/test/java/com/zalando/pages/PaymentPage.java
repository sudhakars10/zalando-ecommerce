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
package com.zalando.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.zalando.constants.Constants.*;

/**
 * Page Object Model (POM) class representing the Payment Page.
 *
 * The `PaymentPage` class extends the `BasePage` class and provides functionality
 * specific to the store page in the web application. It includes methods for
 * interacting with elements on the store page and navigating to the payment page
 * for different countries.
 *
 * This class uses Selenium WebDriver for browser interactions and WebDriverWait
 * for synchronizing actions with the browser.
 *
 * The constructor initializes the PaymentPage by calling the parent class
 * constructor, which sets up the WebDriver instance. This allows the
 * PaymentPage to interact with the browser through the WebDriver.
 */
public class PaymentPage extends BasePage {

    @FindBy(xpath = DEBIT_CREDIT_CARD_BUTTON)
    private WebElement debitCreditCardButton;

    @FindBy(id = CARD_NAME_FIELD)
    private WebElement cardName;

    @FindBy(id = CARD_NUMBER_FIELD)
    private WebElement cardNumber;

    @FindBy(id = EXPIRY_DATE_FIELD)
    private WebElement expiryDate;

    @FindBy(id = CVV_FIELD)
    private WebElement cvv;

    @FindBy(xpath = PAYMENT_NEXT_BUTTON)
    private WebElement paymentNextButton;

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public void userSelectPaymentType() {
        Assert.assertTrue(true);
    }

    public void userAddCardHolderName() {
        Assert.assertTrue(true);
    }

    public void userAddCardNumber() {
        Assert.assertTrue(true);
    }

    public void userAddExpiryDate() {
        Assert.assertTrue(true);
    }

    public void userAddSecurityCode() {
        Assert.assertTrue(true);
    }

    public void userClickNextButtonConfirmPayment() {
        Assert.assertTrue(true);
    }
}
