package com.edu.memberforum;

import org.testng.annotations.Test;

import com.edu.action.Forum_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class ForbidTopicTest extends BaseTest{
	//加黑主题帖
	@Test
	public void forbidTopic() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Forum_Action forbid=new Forum_Action(webtest);
		forbid.forbid("隐藏");
	}
}
