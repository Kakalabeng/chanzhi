package com.edu.memberfeedback;

import org.testng.annotations.Test;

import com.edu.action.Feedback_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class PassFeedbackTest extends BaseTest{
	//通过这条未审核的留言
	@Test
	public void pass() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Feedback_Action pass=new Feedback_Action(webtest);
		pass.agree();
	}
	//通过这条未审核留言以及之前的留言
	@Test
	public void passBefore() throws InterruptedException{
		Feedback_Action passb=new Feedback_Action(webtest);
		passb.agreeBefore();
	}
}
