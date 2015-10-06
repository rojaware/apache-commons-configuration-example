/*
 * Copyright 2010 Blue Lotus Software, LLC.
 * Copyright 2010 John Yeary <jyeary@bluelotussoftware.com>.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
/*
 * $Id: Application.java 168 2010-01-19 03:09:36Z jyeary $
 */
package com.bluelotussoftware.example.apache.commons;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * <p>Example application to demonstrate the Apache Commons
 * Configuration framework.</p>
 * @author John Yeary <jyeary@bluelotussoftware.com>
 * @version 1.0-SNAPSHOT
 */
public class Application {

    private static final String PROPERTIES_FILE_NAME = "configuration.properties";

    /**
     * <p>Default no-arg constructor.</p>
     */
    public Application() {
    }

    /**
     * <p>Main application entry point.</p>
     * @param args
     * @throws ConfigurationException
     */
    public static void main(String[] args) throws ConfigurationException {
        Application application = new Application();
        application.createProperties();
        application.setBackground("#c53478");
        String background = application.getBackground();
        System.out.println("background-color:" + background);
    }

    /**
     * <p>Creates a property file on the local system disk.</p>
     * @throws ConfigurationException if an <code>Exception</code> is encountered.
     */
    public void createProperties() throws ConfigurationException {
        // Create a new property and save it.
        PropertiesConfiguration config = new PropertiesConfiguration();
        config.save(PROPERTIES_FILE_NAME);
    }

    /**
     * <p>Sets a property called <code>colors.background</code> to the value provided, or assigns a color
     * value{@literal #000000} if none is provided .</p>
     * @param backgroundColor
     * @throws ConfigurationException if an <code>Exception</code> is encountered. 
     */
    public void setBackground(String backgroundColor) throws ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration();
        config.load(PROPERTIES_FILE_NAME);
        if (backgroundColor == null) {
            config.setProperty("colors.background", "#000000");
        } else {
            config.setProperty("colors.background", backgroundColor);
        }
        config.save(PROPERTIES_FILE_NAME);
    }

    /**
     * <p>Retrieves the background property from the properties file on
     * the system disk.</p>
     * @return the background color assigned in the properties file.
     * @throws ConfigurationException if an <code>Exception</code> is encountered.
     */
    public String getBackground() throws ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration();
        config.load(PROPERTIES_FILE_NAME);
        String background = (String) config.getProperty("colors.background");
        return background;
    }
}
