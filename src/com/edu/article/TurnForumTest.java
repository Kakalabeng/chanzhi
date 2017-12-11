package com.edu.article;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.edu.backtest.BaseTest;
import com.edu.login.Login;

public class TurnForumTest extends BaseTest{
	Article_Page article =null;
	Login loginPage =null;
	@BeforeClass
	public void  bc() throws InterruptedException{
		loginPage=new Login(driver);
		loginPage.LoginSuccess();
		article=new Article_Page(driver);
	}
	//更多中的转至论坛功能
	@Test
	public void turnForum() throws InterruptedException{
		article.searchArticle();
		article.turnForum();
		article.checkForum();
	}
}
