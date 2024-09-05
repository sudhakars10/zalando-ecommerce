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
package com.zalando.constants;

/**
 * Constants class for storing static final values used across the test framework.
 *
 * The `Constants` class holds constant values such as XPath, ID, and CSS selectors
 * that are used to locate web elements in various page classes. By centralizing
 * these values, the class enhances maintainability and prevents hardcoding
 * of selectors directly in the test scripts.
 *
 * This class is designed to be non-instantiable, following best practices for utility classes.
 */
public class Constants {
    // Prevent instantiation
    private Constants() {
        throw new AssertionError("Cannot instantiate constants class");
    }

    // XPath/ID/CSS Selectors
    public static final String SEARCH_TEXTAREA_IDFIELD_VALUE = "header-search-input";
    public static final String SEARCH_TEXT_CLICKABLE_LINK = "//h3[contains(text(), 'PHOENIX LOGO UNISEX - Cap - navy')]";
    public static final String ADD_TO_BASKET_BUTTON = "//div[@data-testid='pdp-add-to-cart']//button/span[text()='Add to bag']";
    public static final String COUNT_ON_BASKET_ICON = "//div[@data-testid='shopping-bag-badge']/span";
    public static final String GO_TO_BAG_BUTTON = "//div[@data-testid='to-cart-button']//a/span[text()='Go to bag']";
    public static final String GO_TO_CHECKOUT_BUTTON = "//button[@data-id='proceed-to-checkout-button']/span[text()='Go to checkout']";
    public static final String DEBIT_CREDIT_CARD_BUTTON = "//div/span[text()='Credit / Debit Card']";
    public static final String CARD_NAME_FIELD = "name-on-card-input-field";
    public static final String CARD_NUMBER_FIELD = "card-number-input-field";
    public static final String EXPIRY_DATE_FIELD = "exp-input-field";
    public static final String CVV_FIELD = "cvv-input-field";
    public static final String PAYMENT_NEXT_BUTTON = "//button[@data-id='payment-selection-btn']/span[text()='Next']";
}
