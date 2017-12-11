package com.edu.singlepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.backtest.BaseTest;
import com.edu.dataprovide.Provide;
import com.edu.login.Login;

public class AddTest extends BaseTest{

	@BeforeClass
	public void  bc() throws InterruptedException{
		Login loginPage =null;
		loginPage=new Login(driver);
		loginPage.LoginSuccess();
	}
	//添加单页数据提供者
	@DataProvider(name="singlePageProvider")
	public Object[][] pro2(){
		Provide pd = new Provide();
		return pd.getTestDataByTxt("data/addSinglePage.txt");
	}
	@Test(dataProvider="singlePageProvider")
	public void addSinglePage(String i,String j) throws InterruptedException{
		//进入内容模块
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'内容')]")).click();
		Thread.sleep(2000);
		//单页部分，发布单页
		driver.findElement(By.xpath("//a[contains(.,'单页')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,' 添加单页')]")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(i);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		for(int m=0;m<6;m++){
			action.sendKeys(Keys.TAB);
		}
		action.sendKeys(j).perform();
		Thread.sleep(3000);
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//input[@id='submit']")).click();
		Thread.sleep(3000);
	}
}
