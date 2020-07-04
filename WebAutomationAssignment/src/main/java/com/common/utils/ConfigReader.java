package com.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class ConfigReader {

	private static final Logger LOGGER = Logger.getLogger(Class.class.getName());
	public Properties pro = new Properties();


	public ConfigReader() {
		try { 
			File src = new File(System.getProperty("user.dir")+"/config/config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro.load(fis);
		}catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public String getStaticProperty(String str)
	{
		if(pro == null) {
			LOGGER.info("pro is null");
		}
		return pro.getProperty(str);
	}

}
