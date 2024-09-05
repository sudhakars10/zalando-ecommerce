/**
 * Copyright (c) 2024 - Elsevier Assessment.
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of Elsevier Assessment.
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Elsevier Assessment.
 * <p>
 * Created on: September 2, 2024
 * Author: Sudhakar Thangavelu
 */
package com.zalando.utils;

import com.zalando.constants.EnvType;
import java.util.Properties;

/**
 * Singleton class for loading configuration properties based on the environment.
 *
 * The `ConfigLoader` class is responsible for loading environment-specific configuration
 * properties from properties files. It follows the Singleton design pattern to ensure
 * that only one instance of the class is created during the application runtime.
 */
public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() {
        String env = System.getProperty("env", String.valueOf(EnvType.PROD));
        switch (EnvType.valueOf(env)) {
            case PROD -> properties = PropertyUtils.propertyLoader("src/test/resources/prod_config.properties");
            case STAGE -> properties = PropertyUtils.propertyLoader("src/test/resources/stage_config.properties");
            default -> throw new IllegalStateException("INVALID ENV: " + env);
        }
    }

    public static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseUrl() {
        String prop = properties.getProperty("baseUrl");
        if (prop != null) return prop;
        else throw new RuntimeException("property baseUrl is not specified in the stage_config.properties file");
    }
}
