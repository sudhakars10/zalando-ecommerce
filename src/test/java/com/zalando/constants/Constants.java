package com.zalando.constants;

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

}
