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
package com.zalando.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static com.zalando.constants.Constants.*;

/**
 * Page Object Model (POM) class representing the Checkout Page.
 *
 * The `CheckoutPage` class extends the `BasePage` class and provides functionality
 * specific to the store page in the web application. It includes methods for
 * interacting with elements on the product page and navigating to the checkout page
 * for different countries.
 *
 * This class uses Selenium WebDriver for browser interactions and WebDriverWait
 * for synchronizing actions with the browser.
 *
 * The constructor initializes the CheckoutPage by calling the parent class
 * constructor, which sets up the WebDriver instance. This allows the
 * CheckoutPage to interact with the browser through the WebDriver.
 */
public class CheckoutPage extends BasePage {
    @FindBy(id = SEARCH_TEXTAREA_IDFIELD_VALUE)
    private WebElement searchTextField;

    @FindBy(xpath = SEARCH_TEXT_CLICKABLE_LINK)
    private WebElement searchTextClickableLink;

    @FindBy(xpath = ADD_TO_BASKET_BUTTON)
    private WebElement addToBasket;

    @FindBy(xpath = COUNT_ON_BASKET_ICON)
    private WebElement basketIconCount;

    @FindBy(xpath = GO_TO_BAG_BUTTON)
    private WebElement goToBagButton;

    @FindBy(xpath = GO_TO_CHECKOUT_BUTTON)
    private WebElement goToCheckoutButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void userGetSearchResultsAndClickAddToBasket() {
        this.searchTextField.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(searchTextClickableLink)).click();
        wait.until(ExpectedConditions.visibilityOf(addToBasket));
        this.addToBasket.click();
    }

    public void itemAddedToBasket() {
        wait.until(ExpectedConditions.visibilityOf(this.basketIconCount));
        String itemCount = this.basketIconCount.getText();
        Assert.assertTrue(itemCount.contains("1"));
    }

    public void goToBagAndCheckout() {
        wait.until(ExpectedConditions.visibilityOf(this.goToBagButton));
        this.goToBagButton.click();
        wait.until(ExpectedConditions.visibilityOf(this.goToCheckoutButton));
        this.goToCheckoutButton.click();
    }
}
