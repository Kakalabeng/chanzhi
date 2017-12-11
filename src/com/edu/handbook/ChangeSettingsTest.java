package com.edu.handbook;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.edu.action.Handbook_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class ChangeSettingsTest extends BaseTest{
	//更改手册内常见问题设置为全屏
	@Test
	public void changeSettings() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Handbook_Action change=new Handbook_Action(webtest);
		change.changeSettings();
		assertFalse(webtest.getHtmlSource().contains("保存成功"));
	}
}
