package com.edu.memberforum;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.action.Forum_Action;
import com.edu.action.Login_Action;
import com.edu.dataprovide.Provide;
import com.webtest.core.BaseTest;

public class DeleteTopicTest extends BaseTest{
	//批量删除论坛主题帖
	@DataProvider(name="topicProvider")
	public Object[][] pro5(){
		Provide pd=new Provide();
		return pd.getTestDataByTxt("data/deleteTopic.txt");
	}
	//批量删除论坛主题帖
	@Test(dataProvider="topicProvider")
	public void deleteTopic(String title) throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Forum_Action del=new Forum_Action(webtest);
		del.delete(title);
		assertFalse(webtest.getHtmlSource().contains(title));
	}
}
