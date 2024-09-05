package com.zalando.stepdefinitions;

import com.zalando.context.TestContext;
import com.zalando.pages.PageFactoryManager;
import com.zalando.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinitions {
    private final ProductPage productPage;
    private final TestContext context;

    public ProductStepDefinitions(TestContext context) {
        this.context = context;
        productPage = PageFactoryManager.getProductPage(context.driver);
    }

    @When("^user searches for \"([^\"]*)\"$")
    public void userSearchesFor(String searchValue) {
        this.productPage.searchFor(searchValue);
    }

    @Then("user press the Enter key and get search results")
    public void userSeeSearchResultsByEnterKey() { this.productPage.searchResultsByEnterKey();}
}
