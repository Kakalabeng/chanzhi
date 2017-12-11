package com.edu.action;

import com.webtest.core.WebDriverEngine;

public class Blog_Action {
	WebDriverEngine webtest=null;
	public Blog_Action(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	//博客类目为空的条件下，新增类目
	public void addCategory(String name,String alias) throws InterruptedException{
		Thread.sleep(5000);
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'博客')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@name='children[1]']",name);
		webtest.type("xpath=//input[@name='alias[1]']",alias);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(2000);
	}
	//删除无子类目的类目
	public void delCategory() throws InterruptedException{
		Thread.sleep(5000);
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'博客')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'删除')]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(2000);
	}
	//新增子类目
	public void addChild(String chname,String chalias) throws InterruptedException{
		Thread.sleep(5000);
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'博客')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'子类目')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@name='children[1]']",chname);
		webtest.type("xpath=//input[@name='alias[1]']",chalias);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(2000);
	}
	//删除子类目
	public void delChild() throws InterruptedException{
		Thread.sleep(5000);
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'博客')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'删除')]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(2000);
	}
	//在子类目下发布博客
	public void addBlog(String title,String content) throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'内容')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'博客')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'子类目一')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,' 发布博客')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@name='title']", title);
		Thread.sleep(3000);
//		webtest.enterFrame(0);
//		Thread.sleep(3000);
//		webtest.type("class=article-content",content);
		webtest.tabClick();
		webtest.tabClick();
		webtest.tabClick();
		webtest.tabClick();
		webtest.tabClick();
		webtest.tabType(content);
		Thread.sleep(8000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
}
