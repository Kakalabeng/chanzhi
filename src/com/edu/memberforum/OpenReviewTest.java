package com.edu.memberforum;

import org.testng.annotations.Test;

import com.edu.action.Forum_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class OpenReviewTest extends BaseTest{
	//开启论坛审核功能
	@Test
	public void openReview() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Forum_Action open=new Forum_Action(webtest);
		open.openReview();
	}
	//关闭论坛审核功能
	@Test(dependsOnMethods="openReview")
	public void closeReview() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Forum_Action close=new Forum_Action(webtest);
		close.closeReview();
	}
}
