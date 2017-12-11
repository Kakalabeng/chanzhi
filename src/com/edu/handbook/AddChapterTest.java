package com.edu.handbook;

import org.testng.annotations.Test;

import com.edu.action.Handbook_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class AddChapterTest extends BaseTest{
	//为已存在的手册一添加章节或文章
	@Test
	public void addChapter() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Handbook_Action chapter=new Handbook_Action(webtest);
		chapter.addChapter("标题一", "别名一");
	}
}
