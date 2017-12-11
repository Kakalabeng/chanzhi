package com.edu.article;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Article_Page {
	public WebDriver _driver;
	
	//进入内容模块
	@FindBy(xpath="//a[contains(.,'内容')]")
	public WebElement content;
	@FindBy(xpath="//input[@name='searchWord']")
	public WebElement inputSearchWord;
	@FindBy(id="submit")
	public WebElement SearchSubmit;
	
	//编辑功能中的跳转
	@FindBy(xpath="//a[contains(.,'编辑')]")
	public WebElement edit;
	@FindBy(xpath="//input[contains(@type,'checkbox')]")
	public WebElement skip;
	@FindBy(xpath="//input[@name='link']")
	public WebElement link;
	@FindBy(xpath="//input[@id='submit']")
	public WebElement submit;
	@FindBy(xpath="//i[@class='icon-home icon-large']")
	public WebElement qiantai;
	@FindBy(xpath="//a[contains(@title,'明天还是明天')]")
	public WebElement checkSkip;
	
	//预览功能
	@FindBy(linkText="预览")
	public WebElement preview;
	
	//更多中的删除功能
	@FindBy(linkText="更多")
	public WebElement More;
	@FindBy(linkText="删除")
	public WebElement delete;
	@FindBy(xpath="//button[contains(.,'确认')]")
	public WebElement confirm;
	
	//更多中的转至论坛功能
	@FindBy(linkText="转至论坛")
	public WebElement turn;
	@FindBy(xpath="//select[@class='form-control']")
	public WebElement choBoard;
	@FindBy(xpath="//option[contains(.,'/蝉知/技术支持')]")
	public WebElement choOne;
	@FindBy(xpath="//input[@value='保存']")
	public WebElement hold;
	
	//去会员论坛检验
	@FindBy(xpath="//a[contains(.,'会员')]")
	public WebElement member;
	@FindBy(xpath="//a[contains(.,'论坛')]")
	public WebElement forumBoard;
	
	//发布文章
	@FindBy(xpath="//a[contains(.,'一二三')]")
	public WebElement childcategory;
	@FindBy(xpath="//a[contains(.,' 发布文章')]")
	public WebElement addArticle;
	@FindBy(xpath="//input[@name='title']")
	public WebElement title;
	@FindBy(xpath="//input[@value='保存']")
	public WebElement holds;
	
	
	public Article_Page(WebDriver driver){
		this._driver=driver;
		PageFactory.initElements(driver, this);
	}
	//搜索文章，比如“明天还是明天”
	public void searchArticle() throws InterruptedException{
		Thread.sleep(3000);
		this.content.click();
		this.inputSearchWord.sendKeys("测试1");
		this.SearchSubmit.click();
	}
	
	//判断文章是否为跳转模式
	public void editArticle() throws InterruptedException{
		Thread.sleep(2000);
		this.edit.click();
		boolean flag = this._driver.getPageSource().contains("别名");
		if(flag){
			this.skip.click();
			this.link.sendKeys("https://www.baidu.com");
			this.skip.click();
		}else{
			this.skip.click();
			this.skip.click();
		}
	}
	
	//预览文章
	public void previewArticle() throws InterruptedException{
		Thread.sleep(2000);
		this.preview.click();
		assertTrue(_driver.getPageSource().contains("首页"));
		Thread.sleep(3000);
		
	}
	
	//删除文章
	public void deleteArticle() throws InterruptedException{
		Thread.sleep(2000);
		this.More.click();
		this.delete.click();
		this.confirm.click();
		assertFalse(_driver.getPageSource().contains("暂时没有记录"));
	}
	
	//转至论坛
	public void turnForum() throws InterruptedException{
		Thread.sleep(2000);
		this.More.click();
		this.turn.click();
		Thread.sleep(2000);
		this.choBoard.click();
		Thread.sleep(2000);
		this.choOne.click();
		this.hold.click();
		Thread.sleep(2000);
	}
	
	//去会员板块的论坛检验
	public void checkForum() throws InterruptedException{
		Thread.sleep(2000);
		this.member.click();
		this.forumBoard.click();
		assertTrue(_driver.getPageSource().contains("测试1"));
	}
	//在某一子类目下发布文章
	public void addArticle(String i,String j) throws InterruptedException{
		Thread.sleep(3000);
		this.content.click();
		Thread.sleep(2000);
		this.childcategory.click();
		Thread.sleep(2000);
		this.addArticle.click();
		Thread.sleep(2000);
		this.title.sendKeys(i);
		Actions action = new Actions(_driver);
		for(int m=0;m<5;m++){
			action.sendKeys(Keys.TAB);
		}
		action.sendKeys(j).perform();
		Thread.sleep(3000);
		for(int n=0;n<4;n++){
			action.sendKeys(Keys.TAB);
		}
		JavascriptExecutor js= (JavascriptExecutor) _driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		this.holds.click();
		Thread.sleep(3000);
	}
}
