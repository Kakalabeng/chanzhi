package com.edu.memberforum;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.action.Forum_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class HideTopicTest extends BaseTest{
	//隐藏主题帖
	@Test
	public void hideTopic() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Forum_Action hide=new Forum_Action(webtest);
		hide.hide("加黑");
		assertTrue(webtest.getHtmlSource().contains("已隐藏"));
	}
}
