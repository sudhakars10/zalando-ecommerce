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
package com.zalando.constants;

/**
 * Enum representing different environment types for the application.
 *
 * The `EnvType` enum defines the possible environments in which the application
 * can run, such as production (PROD) and staging (STAGE). This enum is used
 * to configure the environment-specific properties and settings for test execution.
 *
 * By using an enum, the code ensures type safety and prevents invalid environment
 * values from being passed or used in the configuration.
 */
public enum EnvType {
    PROD,
    STAGE
}
