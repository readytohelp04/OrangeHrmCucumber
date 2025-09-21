package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {

	public static String getProperty(String key) throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
