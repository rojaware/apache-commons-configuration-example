/**
 * 
 */
package com.bluelotussoftware.example.apache.commons;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * @author giwon
 *
 */
public class ConfigManager {
    private static final String PROPERTIES_FILE_NAME = "configuration.properties";
    static private ConfigManager _instance = null;
    private  PropertiesConfiguration config;
    
    public  PropertiesConfiguration getConfig() {
		return config;
	}
	
	protected ConfigManager() {
        config = new PropertiesConfiguration();
        try {
			config.load(PROPERTIES_FILE_NAME);
			createProperties();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			System.out.println("error" + e);
			e.printStackTrace();
		}
        
  
    }
    static public ConfigManager instance(){
        if (_instance == null) {
            _instance = new ConfigManager();
        }
        return _instance;
    }
    /**
     * <p>Creates a property file on the local system disk.</p>
     * @throws ConfigurationException if an <code>Exception</code> is encountered.
     */
    public void createProperties() throws ConfigurationException {
        // Create a new property and save it.
//		PropertiesConfiguration  config = ConfigManager.instance().getConfig();

        config.save(PROPERTIES_FILE_NAME);
    }
}
