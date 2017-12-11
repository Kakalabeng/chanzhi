package com.edu.handbook;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.edu.action.Handbook_Action;
import com.edu.action.Login_Action;
import com.edu.dataprovide.Provide;
import com.webtest.core.BaseTest;

public class AddHandbookTest extends BaseTest{
	//添加手册数据提供者
	@DataProvider(name="handbookProvider")
	public Object[][] pro4(){
		Provide pd=new Provide();
		return pd.getTestDataByTxt("data/addHandbook.txt");
	}
	//批量添加手册
	@Test(dataProvider="handbookProvider")
	public void addHandbook(String title,String alias,String content) throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Handbook_Action handbook=new Handbook_Action(webtest);
		handbook.addHandbook(title,alias, content);
	}
}
