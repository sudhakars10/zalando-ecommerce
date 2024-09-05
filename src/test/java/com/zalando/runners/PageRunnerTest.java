/**
 * Copyright (c) 2024 - Elsevier Assessment.
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of Elsevier Assessment.
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Elsevier Assessment.
 * <p>
 * Created on: September 3, 2024
 * Author: Sudhakar Thangavelu
 */
package com.zalando.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * Test runner class for executing Cucumber tests with TestNG.
 *
 * The `PageRunnerTest` class is configured to run Cucumber tests tagged with "@smoke".
 * It extends `AbstractTestNGCucumberTests` to integrate Cucumber with TestNG, allowing
 * Cucumber scenarios to be executed as TestNG tests.
 *
 *  Override the `scenarios` method to provide data for parallel execution of test scenarios.
 *  This method is overridden to enable parallel execution of Cucumber scenarios. The `@DataProvider`
 *  annotation with `parallel = true` allows the scenarios to be executed concurrently, improving test
 *  execution time, especially in large test suites.
 */
@CucumberOptions(tags = "@smoke", features = {"src/test/resources/features"}, glue = {"com.zalando"},
        plugin = {"pretty", "html:target/cucumber/cucumber.html"})
public class PageRunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}