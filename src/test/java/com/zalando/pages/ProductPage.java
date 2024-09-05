package com.zalando.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.zalando.constants.Constants.SEARCH_TEXTAREA_IDFIELD_VALUE;
import static com.zalando.constants.Constants.SEARCH_TEXT_CLICKABLE_LINK;

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
