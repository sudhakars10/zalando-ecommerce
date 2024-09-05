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

import static com.zalando.constants.Constants.SEARCH_TEXTAREA_IDFIELD_VALUE;
import static com.zalando.constants.Constants.SEARCH_TEXT_CLICKABLE_LINK;

/**
 * Page Object Model (POM) class representing the Product Page.
 *
 * The `ProductPage` class extends the `BasePage` class and provides functionality
 * specific to the store page in the web application. It includes methods for
 * interacting with elements on the product page and navigating to the product page
 * for different countries.
 *
 * This class uses Selenium WebDriver for browser interactions and WebDriverWait
 * for synchronizing actions with the browser.
 *
 * The constructor initializes the ProductPage by calling the parent class
 * constructor, which sets up the WebDriver instance. This allows the
 * ProductPage to interact with the browser through the WebDriver.
 */
public class ProductPage extends BasePage {

    @FindBy(id = SEARCH_TEXTAREA_IDFIELD_VALUE)
    private WebElement searchTextField;

    @FindBy(xpath = SEARCH_TEXT_CLICKABLE_LINK)
    private WebElement searchTextClickableLink;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String searchValue) {
        this.searchTextField.sendKeys(searchValue);
        wait.until(ExpectedConditions.visibilityOf(searchTextField));
    }

    public void searchResultsByEnterKey() {
        this.searchTextField.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(searchTextClickableLink)).click();
    }
}
