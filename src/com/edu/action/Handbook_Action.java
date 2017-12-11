package com.edu.action;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.webtest.core.WebDriverEngine;

public class Handbook_Action {
	WebDriverEngine webtest=null;
	public Handbook_Action(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	//添加手册
	public void addHandbook(String title,String alias,String content) throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'手册')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' 添加手册')]");
		Thread.sleep(3000);
		webtest.type("id=title",title);
		webtest.type("xpath=//input[@name='alias']", alias);
		webtest.tabClick();
		webtest.tabClick();
		webtest.tabClick();
		webtest.tabType(content);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(4000);
		assertTrue(webtest.getHtmlSource().contains(title));
	}
	//预览手册中常见问题
	public void previewHandbook() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'手册')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'预览')]");
		Thread.sleep(5000);
		assertTrue(webtest.getHtmlSource().contains("蝉知企业门户"));
	}
	//为已存在的手册一添加章节
	public void addChapter(String title,String alias) throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'手册')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'手册一')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'章节')]");
		Thread.sleep(3000);
		webtest.click("id=type");
		webtest.click("xpath=//option[contains(.,'文章')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@name='title[1]']",title);
		webtest.type("xpath=//input[@name='alias[1]']",alias);
		Thread.sleep(5000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(4000);
		assertTrue(webtest.getHtmlSource().contains(title));
	}
	//删除已存在的手册三
	public void delHandbook() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'手册')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'手册三')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'删除')]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(3000);
		assertFalse(webtest.getHtmlSource().contains("手册三"));
	}
	//更改手册中常见问题的设置为全屏显示
	public void changeSettings() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'手册')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(@href,'/chanzhieps/www/admin.php?m=book&f=setting')]");
		Thread.sleep(2000);
		webtest.radio("id=fullScreen1");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(2000);
	}
}
