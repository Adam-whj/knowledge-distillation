package com.mobvoi.knowledgegraph.scui.jsp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConfigReader {
	protected static Logger logger = Logger.getLogger(ConfigReader.class);
	private static Properties props;
	static {
		InputStream is = ConfigReader.class.getResourceAsStream("/cfg.properties");
		if (is == null) {
			throw new RuntimeException("can't find cfg.properties in classpath");
		}
		props = new Properties();
		try {
			props.load(is);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static Properties getProps() {
		return props;
	}
}
