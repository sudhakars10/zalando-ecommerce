package com.zalando.pages;

import com.zalando.constants.EnvType;
import com.zalando.utils.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.zalando.constants.Constants.SEARCH_TEXTAREA_IDFIELD_VALUE;

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
