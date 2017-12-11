package com.edu.memberfeedback;

import org.testng.annotations.Test;

import com.edu.action.Feedback_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class ReplyTest extends BaseTest{
	//回复未审核的留言
	@Test
	public void reply() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Feedback_Action reply=new Feedback_Action(webtest);
		reply.reply("还可以");
	}
}
