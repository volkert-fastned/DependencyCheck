/*
 * Copyright 2014 OWASP.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.owasp.dependencycheck.utils;

import org.junit.After;
import org.junit.Before;

/**
 *
 * @author Jeremy Long
 */
public class BaseTest {

    /**
     * The configured settings.
     */
    private Settings settings;

    /**
     * Initialize the {@link Settings}.
     */
    @Before
    public void setUp() {
        settings = new Settings();
    }

    /**
     * Clean the {@link Settings}.
     */
    @After
    public void tearDown() {
        settings.cleanup(true);
    }

    /**
     * Returns the settings for the test cases.
     *
     * @return
     */
    protected Settings getSettings() {
        return settings;
    }
}