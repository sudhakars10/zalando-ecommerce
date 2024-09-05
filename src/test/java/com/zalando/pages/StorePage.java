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

import com.zalando.utils.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.zalando.constants.Constants.SEARCH_TEXTAREA_IDFIELD_VALUE;

/**
 * Page Object Model (POM) class representing the Store Page.
 *
 * The `StorePage` class extends the `BasePage` class and provides functionality
 * specific to the store page in the web application. It includes methods for
 * interacting with elements on the store page and navigating to the store page
 * for different countries.
 *
 * This class uses Selenium WebDriver for browser interactions and WebDriverWait
 * for synchronizing actions with the browser.
 *
 * The constructor initializes the StorePage by calling the parent class
 * constructor, which sets up the WebDriver instance. This allows the
 * StorePage to interact with the browser through the WebDriver.
 */
public class StorePage extends BasePage {

    @FindBy(id = SEARCH_TEXTAREA_IDFIELD_VALUE)
    private WebElement searchTextField;

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public void goToStorePage(String country) {
        driver.get(ConfigLoader.getInstance().getBaseUrl() + country);
        wait.until(ExpectedConditions.visibilityOf(searchTextField));
    }
}
