package com.edu.memberfeedback;

import org.testng.annotations.Test;

import com.edu.action.Feedback_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class BoldTest extends BaseTest{
	//加黑未审核的留言
	@Test
	public void bold() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Feedback_Action bold=new Feedback_Action(webtest);
		bold.forbid();
	}
}
