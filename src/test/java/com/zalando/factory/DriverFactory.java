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
package com.zalando.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * The {@code DriverFactory} class is responsible for initializing WebDriver instances
 * based on the specified browser type. This class provides a method to create and
 * configure WebDriver objects for different browsers such as Chrome and Firefox.
 */
public class DriverFactory {
    public static WebDriver initializeDriver(String browser){
        WebDriver driver;
        switch (browser) {
            case "chrome" -> {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("['start-maximized']");
                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
            }
            case "firefox" -> {
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }
            default -> throw new IllegalStateException("INVALID BROWSER: " + browser);
        }
        driver.manage().window().maximize();
        return driver;
    }
}
