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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Base class for all Page Object Model (POM) classes in the test framework.
 *
 * The `BasePage` class serves as a foundation for all other page classes
 * such as `CheckoutPage`, `ProductPage`, and `PaymentPage`. It provides
 * common functionality and initialization that is required across different
 * pages of the web application.
 *
 * This class initializes WebDriver, WebDriverWait, and PageFactory, which
 * are essential for interacting with web elements and ensuring synchronization
 * during test execution.
 *
 * The constructor initializes the WebDriver and WebDriverWait objects,
 * which are shared by all pages that extend this class. Additionally,
 * it initializes the web elements on the page using the PageFactory.
 */
public class BasePage {
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    protected WebDriver driver;
    protected WebDriverWait wait;
}
