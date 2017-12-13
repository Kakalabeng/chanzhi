package com.edu.memberforum;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.action.Forum_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class DisplayTopicTest extends BaseTest{
	//取消隐藏主题帖
	@Test
	public void displayTopic() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Forum_Action display=new Forum_Action(webtest);
		display.display("加黑");
		assertTrue(webtest.getHtmlSource().contains("正常"));
	}
}
