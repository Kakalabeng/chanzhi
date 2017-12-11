package com.edu.memberlist;

import org.testng.annotations.Test;

import com.edu.action.Login_Action;
import com.edu.action.Memberlist_Action;
import com.webtest.core.BaseTest;

public class PointsTest extends BaseTest{
	//奖励积分
	@Test
	public void rewardPoints() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Memberlist_Action points=new Memberlist_Action(webtest);
		points.rewardPoints("admin1", "200");
	}
	//扣除积分
	@Test
	public void takeOutPoints() throws InterruptedException{
		Memberlist_Action points=new Memberlist_Action(webtest);
		points.rewardPoints("admin1", "200");
	}
}
