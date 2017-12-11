package com.edu.article;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.backtest.BaseTest;
import com.edu.dataprovide.Provide;
import com.edu.login.Login;

public class AddArticleTest extends BaseTest{
	
	@BeforeClass
	public void  bc() throws InterruptedException{
		Login loginPage =null;
		loginPage=new Login(driver);
		loginPage.LoginSuccess();
	}
	@DataProvider(name="articleProvider")
	public Object[][] pro1(){
		Provide pd = new Provide();
		return pd.getTestDataByTxt("data/addArticle.txt");
	}
	//发布文章
	@Test(dataProvider="articleProvider")
	public void addEssay(String i,String j) throws InterruptedException{
		Article_Page article =new Article_Page(driver);
		article.addArticle(i, j);
	}
}
