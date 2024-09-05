package com.zalando.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.zalando.constants.Constants.*;

public class PaymentPage extends BasePage{

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
