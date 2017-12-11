package com.edu.memberforum;

import org.testng.annotations.Test;

import com.edu.action.Forum_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class TransferTopicTest extends BaseTest{
	//转移主题帖
	@Test
	public void transferTopic() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Forum_Action transfer=new Forum_Action(webtest);
		transfer.transfer("测试1");
	}
}
