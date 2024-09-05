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

import org.openqa.selenium.WebDriver;

/**
 * Factory class for managing the creation and reuse of page objects.
 *
 * The `PageFactoryManager` class provides a centralized way to create and retrieve
 * instances of various page classes, such as `StorePage`, `CheckoutPage`,
 * `ProductPage`, and `PaymentPage`. This class implements a lazy initialization
 * pattern, ensuring that each page object is only created once and reused
 * across the test execution.
 *
 * This approach helps optimize memory usage and improve performance by avoiding
 * the creation of multiple instances of the same page object.
 */
public class PageFactoryManager {
    private static StorePage storePage;
    private static CheckoutPage checkoutPage;
    private static ProductPage productPage;
    private static PaymentPage paymentPage;

    public static StorePage getStorePage(WebDriver driver) {
        return storePage == null ? new StorePage(driver) : storePage;
    }

    public static CheckoutPage getCheckoutPage(WebDriver driver) {
        return checkoutPage == null ? new CheckoutPage(driver) : checkoutPage;
    }

    public static ProductPage getProductPage(WebDriver driver) {
        return productPage == null ? new ProductPage(driver) : productPage;
    }

    public static PaymentPage getPaymentPage(WebDriver driver) {
        return paymentPage == null ? new PaymentPage(driver) : paymentPage;
    }
}
