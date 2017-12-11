package com.edu.blog;

import org.testng.annotations.Test;

import com.edu.action.Blog_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class DelCategoryTest extends BaseTest{
	//删除类目
	@Test
	public void delCategory() throws InterruptedException{
	Login_Action login=new Login_Action(webtest);
	login.loginBack("admin", "admin");
	Blog_Action category=new Blog_Action(webtest);
	category.delCategory();
	}
}
