package com.edu.action;

import com.webtest.core.WebDriverEngine;

public class Feedback_Action {
	WebDriverEngine webtest=null;
	public Feedback_Action(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	//回复未审核反馈
	public void reply(String content) throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'反馈')]");
		Thread.sleep(2000);
		webtest.click("xpath=html/body/div/div/div[2]/div[1]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.type("xpath=//textarea[@id='content']",content);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//加黑未审核反馈
	public void forbid() throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'反馈')]");
		Thread.sleep(2000);
		webtest.click("xpath=html/body/div/div/div[2]/div[1]/div[2]/a[2]");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(2000);
	}
	//通过未审核的反馈
	public void agree() throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'反馈')]");
		Thread.sleep(2000);
		webtest.click("xpath=html/body/div/div/div[2]/div[1]/div[2]/a[3]");
		Thread.sleep(2000);
	}
	//通过之前未审核的反馈
	public void agreeBefore() throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'反馈')]");
		Thread.sleep(2000);
		webtest.click("xpath=html/body/div/div/div[2]/div[1]/div[2]/a[4]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(2000);
	}
	//删除此条未通过的反馈
	public void delThis() throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'反馈')]");
		Thread.sleep(2000);
		webtest.click("xpath=html/body/div/div/div[2]/div[1]/div[2]/a[5]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(2000);
	}
	//添加留言
	public void addfeedback(String name,String content) throws InterruptedException{
		Thread.sleep(3000);
		webtest.open("http://localhost:8032/chanzhieps/www/");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'留言')]");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@id='from']",name);
		Thread.sleep(2000);
		webtest.type("xpath=//textarea[@id='content']",content);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(3000);
	}
	//删除此条之前未通过的反馈
	public void delBefore() throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'反馈')]");
		Thread.sleep(2000);
		webtest.click("xpath=html/body/div/div/div[2]/div[1]/div[2]/a[6]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(2000);
	}
	//删除审核通过的反馈留言
	public void delPass() throws InterruptedException{
		webtest.click("link=会员");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'反馈')]");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'已审核')]");
		Thread.sleep(2000);
		webtest.click("xpath=html/body/div/div/div[2]/div[1]/div[2]/a[3]");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(2000);
	}
}
