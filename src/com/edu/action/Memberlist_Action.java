package com.edu.action;

import com.webtest.core.WebDriverEngine;

public class Memberlist_Action {
	WebDriverEngine webtest=null;
	public Memberlist_Action(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	//全选功能
	public void checkAll() throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'全选')]");
	}
	//反选功能
	public void inverse() throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'反选')]");
	}
	//对某一用户赋予管理员权限
	public void adminPower(String username) throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@placeholder='请输入用户名']",username);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'编辑')]");
		Thread.sleep(2000);
		webtest.selectByValue("xpath=//select[@id='admin']","common");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@id='groups1']");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//对某一用户赋予超级管理员权限
	public void superPower(String username) throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@placeholder='请输入用户名']",username);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'编辑')]");
		Thread.sleep(2000);
		webtest.selectByValue("xpath=//select[@id='admin']","super");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//更改某一用户权限为普通会员
	public void noPower(String username) throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@placeholder='请输入用户名']",username);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'编辑')]");
		Thread.sleep(2000);
		webtest.selectByValue("xpath=//select[@id='admin']","no");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//奖励某一用户固定的积分
	public void rewardPoints(String username,String points) throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@placeholder='请输入用户名']",username);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(4000);
		webtest.click("xpath=.//*[@id='userList']/tbody/tr/td[13]/span[1]/a");
		Thread.sleep(3000);
		webtest.click("link=奖励积分");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='count']",points);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//扣除某一用户固定的积分
	public void takeOutPoints(String username,String points) throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@placeholder='请输入用户名']",username);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(4000);
		webtest.click("xpath=.//*[@id='userList']/tbody/tr/td[13]/span[1]/a");
		Thread.sleep(3000);
		webtest.click("link=扣除积分");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='count']",points);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//删除某一用户
	public void delUser(String username,String adminpassword) throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@placeholder='请输入用户名']",username);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'删除')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@placeholder='请输入当前帐号的密码']",adminpassword);
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'删除')]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(3000);
	}
	//禁用某一用户一天
	public void forbidUser(String username) throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@placeholder='请输入用户名']",username);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=.//*[@id='userList']/tbody/tr[1]/td[13]/span[2]/a");
		Thread.sleep(3000);
		webtest.click("link=一天");
		Thread.sleep(2000);
		webtest.enterClick();
		Thread.sleep(3000);
	}
	//解禁被禁用的用户
	public void liftBan(String username) throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@placeholder='请输入用户名']",username);
		webtest.click("xpath=//input[@value='搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'解禁')]");
		Thread.sleep(2000);
		webtest.enterClick();
		Thread.sleep(3000);
	}
}
