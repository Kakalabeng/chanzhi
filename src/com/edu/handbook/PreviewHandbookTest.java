package com.edu.handbook;

import org.testng.annotations.Test;

import com.edu.action.Handbook_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class PreviewHandbookTest extends BaseTest{
	//预览手册中的常见问题
	@Test
	public void previewHandbook() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Handbook_Action preview=new Handbook_Action(webtest);
		preview.previewHandbook();
	}
}
