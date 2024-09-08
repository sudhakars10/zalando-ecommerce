/**
 * Copyright (c) 2024 - Elsevier Assessment.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Elsevier Assessment.
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Elsevier Assessment.
 *
 * Created on: September 2, 2024
 * Author: Sudhakar Thangavelu
 */
package com.zalando.hooks;

import com.zalando.context.TestContext;
import com.zalando.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

/**
 *  The Hooks class is a setup and teardown utility for managing WebDriver instances
 *  in a Cucumber testing environment. It utilizes Cucumber's Before and After
 *  hooks to execute code before and after each test scenario.
 *
 *  The Hooks class is responsible for initializing the WebDriver before each test
 *  scenario begins and ensuring that the WebDriver instance is properly shut down after
 *  each scenario completes. This class also prints thread and scenario information
 *  to the console, aiding in debugging and tracking test execution.
 *
 *  The WebDriver is initialized using the DriverFactory class, which supports
 *  different browser types. The default browser is Chrome, but this can be overridden
 *  by setting the "browser" system property. The initialized WebDriver is stored in the
 *  TestContext for use in test steps.
 */
public class Hooks {
    private WebDriver driver;
    private final TestContext context;

    public Hooks(TestContext context){
        this.context = context;
    }

    @Before
    public void before(Scenario scenario){
        System.out.println("BEFORE: THREAD ID : " + Thread.currentThread().threadId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        driver = DriverFactory.initializeDriver(System.getProperty("browser", "chrome"));
        context.driver = driver;
    }

    @After
    public void after(Scenario scenario){
        System.out.println("AFTER: THREAD ID : " + Thread.currentThread().threadId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        driver.quit();
    }
}
