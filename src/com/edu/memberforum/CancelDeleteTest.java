package com.edu.memberforum;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.action.Forum_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class CancelDeleteTest extends BaseTest{
	//取消删除论坛主题帖
	@Test
	public void cancelDelete() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Forum_Action cancel=new Forum_Action(webtest);
		cancel.cancel("测试1");
		assertTrue(webtest.getHtmlSource().contains("测试1"));
	}
}
