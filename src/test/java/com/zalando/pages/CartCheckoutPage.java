package com.zalando.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static com.zalando.constants.Constants.*;

public class CartCheckoutPage extends BasePage {

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

    public CartCheckoutPage(WebDriver driver) {
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
