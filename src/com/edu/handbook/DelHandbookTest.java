package com.edu.handbook;

import org.testng.annotations.Test;

import com.edu.action.Handbook_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class DelHandbookTest extends BaseTest{
	//删除已存在的手册三
	@Test
	public void delHandbook() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Handbook_Action del=new Handbook_Action(webtest);
		del.delHandbook();
	}
}
