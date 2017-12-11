package com.edu.blog;

import org.testng.annotations.Test;
import com.edu.action.Blog_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class AddCategoryTest extends BaseTest{
	
	//增加类目，在无类目情况下
	@Test
	public void addCategory() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Blog_Action category=new Blog_Action(webtest);
		category.addCategory("类目一", "类目一");
	}
	//在新增类目下新增子类目
	@Test(dependsOnMethods="addCategory")
	public void addChildCategory() throws InterruptedException{
		Blog_Action category=new Blog_Action(webtest);
		category.addChild("子类目一", "子类目一");
	}
}
