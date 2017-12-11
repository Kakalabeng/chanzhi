package com.edu.article;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.edu.backtest.BaseTest;
import com.edu.login.Login;

public class DeleteArticleTest extends BaseTest{
	Article_Page article =null;
	Login loginPage =null;
	@BeforeClass
	public void  bc() throws InterruptedException{
		loginPage=new Login(driver);
		loginPage.LoginSuccess();
		article=new Article_Page(driver);
	}
	//删除文章
	@Test
	public void deleteEssay() throws InterruptedException{
		article.searchArticle();
		article.deleteArticle();
	}
}
