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
package com.zalando.context;

import org.openqa.selenium.WebDriver;

/**
 * The {@code TestContext} class serves as a container for sharing context or state
 * between different test components in a Cucumber testing framework. This class
 * allows for the sharing of a single WebDriver instance across multiple steps within
 * a scenario, ensuring consistent test execution.
 *
 * In this implementation, the {@code TestContext} class holds a reference to a
 * {@code WebDriver} instance, which can be initialized and accessed by different
 * parts of the test framework, such as Hooks and step definitions.
 *
 * The default constructor is provided to create an instance of {@code TestContext},
 * though additional context-related variables or methods could be added in the future
 * to expand its functionality.
 *
 */
 public class TestContext {
    public WebDriver driver;

    public TestContext() {

    }
}
