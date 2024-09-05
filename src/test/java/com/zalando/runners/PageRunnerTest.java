package com.zalando.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(tags = "@smoke", features = {"src/test/resources/features"}, glue = {"com.zalando"},
        plugin = {"pretty","html:target/cucumber/cucumber.html"})
public class PageRunnerTest extends AbstractTestNGCucumberTests{
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}