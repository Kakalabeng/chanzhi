package com.edu.backtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.edu.backtest.BaseSettings;
import com.webtest.util.Log;

public class BaseTest extends BaseSettings{
	public WebDriver driver = null;
	@BeforeClass
	public void setUpBrowser() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",BaseSettings.FireFoxDriverPath);
		driver = new FirefoxDriver();
		new Actions(driver);
		Thread.sleep(5000);
		driver.get("http://localhost:8032/chanzhieps/www/admin.php?");
		Thread.sleep(5000);
	}

	@AfterClass
	public void doAfterMethod() {
		if(driver != null){
			driver.quit();
		}
		Log.info("Quitted Browser");
	}
}
