package com.edu.memberforum;

import org.testng.annotations.Test;

import com.edu.action.Forum_Action;
import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class AddBoardTest extends BaseTest{
	Forum_Action board=new Forum_Action(webtest);
	//新增第二板块
	@Test(priority=0)
	public void addBoard() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Forum_Action board=new Forum_Action(webtest);
		board.addBoard("测试");
	}
	//新增第二板块子版块
	@Test(priority=1)
	public void addChildBoard() throws InterruptedException{
		Forum_Action board=new Forum_Action(webtest);
		board.addChildBoard("子版块");
	}
	//删除子版块
	@Test(priority=2)
	public void delChild() throws InterruptedException{
		Forum_Action board=new Forum_Action(webtest);
		board.delChild();
	}
	//删除新增第二板块
	@Test(priority=3)
	public void delBoard() throws InterruptedException{
		Forum_Action board=new Forum_Action(webtest);
		board.delBoard();
	}
}
