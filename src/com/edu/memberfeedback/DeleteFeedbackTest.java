package com.edu.memberfeedback;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.action.Feedback_Action;
import com.edu.action.Login_Action;
import com.edu.dataprovide.Provide;
import com.webtest.core.BaseTest;

public class DeleteFeedbackTest extends BaseTest{
	//批量增加
	@DataProvider(name="feedbackProvider")
	public Object[][] pro6(){
		Provide pd=new Provide();
		return pd.getTestDataByTxt("data/addfeedback.txt");
	}
	@Test(priority=0,dataProvider="feedbackProvider")
	public void addFeedback(String name,String content) throws InterruptedException{
		Feedback_Action add=new Feedback_Action(webtest);
		add.addfeedback(name, content);
	}
	//删除此条未审核的留言
	@Test(priority=1)
	public void delThis() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Feedback_Action del=new Feedback_Action(webtest);
		del.delThis();
	}
	//删除此条包括之前的未审核留言
	@Test(priority=2)
	public void delBefore() throws InterruptedException{
		Feedback_Action delb=new Feedback_Action(webtest);
		delb.delBefore();
	}
	//删除审核通过的一条留言
	@Test(priority=3)
	public void delPass() throws InterruptedException{
		Feedback_Action delp=new Feedback_Action(webtest);
		delp.delPass();
	}
}
