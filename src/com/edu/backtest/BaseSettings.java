package com.edu.backtest;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseSettings {
	public static Properties prop = getProperties();
//	public static String driverType=prop.getProperty("fireFoxDriver");
	//浏览器的类型
	public static int browserCoreType = Integer.parseInt(prop.getProperty("BrowserCoreType", "2"));
	//谷歌浏览器
	public static String ChromeDriverPath = prop.getProperty("ChromeDriverPath","D:\\chrome\\chromedriver.exe");
	//火狐浏览器
	public static String FireFoxDriverPath = prop.getProperty("FireFoxDriverPath","D:\\Selenium\\geckodriver.exe");

	public static String stepInterval = prop.getProperty("StepInterval", "500");

	public static String timeout = prop.getProperty("Timeout", "30000");

	public static String baseStorageUrl = prop.getProperty("baseStorageUrl", System.getProperty("user.dir"));

	public static String getProperty(String property) {
		return prop.getProperty(property);
	}
	
	public static Properties getProperties() {
		Properties prop = new Properties();
		try {
			FileInputStream file = new FileInputStream("conf/prop.properties");
			prop.load(file);
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
}
