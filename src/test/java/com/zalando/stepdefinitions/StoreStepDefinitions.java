package com.zalando.stepdefinitions;

import com.zalando.context.TestContext;
import com.zalando.pages.PageFactoryManager;
import com.zalando.pages.StorePage;
import io.cucumber.java.en.Given;

public class StoreStepDefinitions {
    private final StorePage storePage;
    private final TestContext context;

    public StoreStepDefinitions(TestContext context){
        this.context = context;
        storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @Given("^user navigates to store page \"([^\"]*)\"$")
    public void userNavigatesToStorePage(String country) { this.storePage.goToStorePage(country); }
}
