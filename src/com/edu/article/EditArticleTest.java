package com.edu.article;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.edu.backtest.BaseTest;
import com.edu.login.Login;


public class EditArticleTest extends  BaseTest{
	
	Article_Page article =null;
	Login loginPage =null;
	@BeforeClass
	public void  bc() throws InterruptedException{
		loginPage=new Login(driver);
		loginPage.LoginSuccess();
		article=new Article_Page(driver);
	}
	//选择跳转模式
	@Test
	public void ChooseSkip() throws InterruptedException{
		article.searchArticle();
		article.editArticle();
	}
	//取消跳转模式
	@Test(dependsOnMethods="ChooseSkip")
	public void CancelSkip() throws InterruptedException{
		article.searchArticle();
		article.editArticle();
	}
}
