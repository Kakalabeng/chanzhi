package com.edu.action;

import com.webtest.core.WebDriverEngine;

public class Forum_Action {
	WebDriverEngine webtest=null;
	public Forum_Action(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	//隐藏论坛某一特定主题
	public void hide(String title) throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='searchWord']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'隐藏')]");
		Thread.sleep(3000);
	}
	//将隐藏的某一主题进行显示
	public void display(String title) throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='searchWord']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='reload']");
		Thread.sleep(3000);
	}
	//转移某一特定主题到别的板块
	public void transfer(String title) throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='searchWord']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'转移')]");
		Thread.sleep(2000);
		webtest.selectByValue("xpath=//select[@id='targetBoard']","6");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//删除某一特定主题
	public void delete(String title) throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='searchWord']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'删除')]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(3000);
	}
	//删除某一特定主题过程取消删除操作
	public void cancel(String title) throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='searchWord']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'删除')]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'取消')]");
		Thread.sleep(3000);
	}
	//加黑某一特定主题
	public void forbid(String title) throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='searchWord']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'加黑')]");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(2000);
	}
	//删除某一特定的回帖
	public void delReply(String title) throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'回帖列表')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='searchWord']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'删除')]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(3000);
	}
	//加黑某一特定回帖
	public void forbidReply(String title) throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'回帖列表')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='searchWord']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'加黑')]");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//新增论坛第二板块
	public void addBoard(String title) throws InterruptedException{
		Thread.sleep(2000);
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'版块管理')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@name='children[5]']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(2000);
	}
	//在新增的第二板块下新增子版块
	public void addChildBoard(String title) throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='treeMenuBox']/ul/li[2]/a[2]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@name='children[1]']",title);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//删除新增子版块
	public void delChild() throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'版块管理')]");
		Thread.sleep(2000);
		webtest.click("xpath=.//*[@id='treeMenuBox']/ul/li[2]/ul/li/a[2]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(2000);
	}
	//删除子版块后，删除板块
	public void delBoard() throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("xpath=.//*[@id='treeMenuBox']/ul/li[2]/a[3]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(3000);
	}
	//开启论坛发帖审核功能
	public void openReview() throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'论坛设置')]");
		Thread.sleep(2000);
		webtest.radio("xpath=//input[@value='open']");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//关闭论坛发帖审核功能
	public void closeReview() throws InterruptedException{
		webtest.click("link=会员");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'论坛设置')]");
		Thread.sleep(2000);
		webtest.radio("xpath=//input[@value='close']");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
}
