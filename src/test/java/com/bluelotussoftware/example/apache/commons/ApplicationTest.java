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
package com.bluelotussoftware.example.apache.commons;

import java.io.File;
import org.apache.commons.configuration.ConfigurationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit Tests
 * @author John Yeary <jyeary@bluelotussoftware.com>
 * @version 1.0-SNAPSHOT
 */
public class ApplicationTest {

    /**
     * <p>Default no-arg constructor.</p>
     */
    public ApplicationTest() {
    }

    /**
     * <p>Used to setup the application state before each test.</p>
     * @throws ConfigurationException
     */
    @Before
    public void setUp() throws ConfigurationException {
        Application application = new Application();
       
    }

    /**
     * <p>Used to reset the application state and parameters between
     * unit tests.</p>
     */
    @After
    public void tearDown() {
        // Delete the configuration file between tests.
        File f = new File("configuration.properties");
//        f.delete();
    }

    /**
     * <p>Test of setBackground method, of class Application.</p>
     */
    @Test
    public void testSetBackground() throws Exception {
        System.out.println("setBackground");
        String backgroundColor = "#ABCDEF";
        Application instance = new Application();
        instance.setBackground(backgroundColor);
        assertEquals(instance.getBackground(), backgroundColor);
    }

    /**
     * <p>Test of setBackground method, of class Application.</p>
     */
    @Test
    public void testSetBackgroundDefault() throws Exception {
        System.out.println("setBackground");
        String backgroundColor = null;
        Application instance = new Application();
        instance.setBackground(backgroundColor);
        assertEquals(instance.getBackground(), "#000000");
    }

    /**
     * <p>Test of getBackground method, of class Application.</p>
     * <p> This is expected to return null since we have not set any
     * properties at this point.</p>
     */
    @Test
    public void testGetBackground() throws Exception {
        System.out.println("getBackground");
        Application instance = new Application();
        String expResult = null;
        String result = instance.getBackground();
        assertEquals(expResult, result);
    }
}
