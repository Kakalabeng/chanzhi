package com.edu.blog;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.action.Blog_Action;
import com.edu.action.Login_Action;
import com.edu.dataprovide.Provide;
import com.webtest.core.BaseTest;

public class AddBlogTest extends BaseTest{
	//添加博客数据提供者
	@DataProvider(name="blogProvider")
	public Object[][] pro3(){
		Provide pd=new Provide();
		return pd.getTestDataByTxt("data/addBlog.txt");
	}
	//发布博客
	@Test(dataProvider="blogProvider")
	public void addBlog(String title,String content) throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Blog_Action blog=new Blog_Action(webtest);
		blog.addBlog(title,content);
	}
}
