package com.edu.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver _driver;
	String Url="http://localhost:8032/chanzhieps/www/admin.php?";
	@FindBy(xpath="//input[@placeholder='请输入用户名或Email']")
	public WebElement inputUsername;
	@FindBy(xpath="//input[@placeholder='请输入密码']")
	public WebElement inputPassword;
	@FindBy(id="submit")
	public WebElement btnSubmit;
	@FindBy(xpath="//i[@class='icon icon-user icon-2x']")
	public WebElement QuitPic;
	@FindBy(xpath="//a[contains(.,'退出')]")
	public WebElement linkQuit;
	public Login(WebDriver driver){
		this._driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void open(){
		this._driver.get(Url);
	}
	//成功登录
	public void LoginSuccess() throws InterruptedException{
		boolean flag=this._driver.getPageSource().contains("前台");
		if(flag){
			this.QuitPic.click();
			Thread.sleep(2000);
			this.linkQuit.click();
			Thread.sleep(3000);
		}
		this.inputUsername.sendKeys("admin");
		this.inputPassword.sendKeys("admin");
		this.btnSubmit.click();
		Thread.sleep(3000);
	}
	//正确的用户名错误的密码
	public void LoginWP() throws InterruptedException{
		boolean flag = this._driver.getPageSource().contains("前台");
		if(flag){
			this.QuitPic.click();
			Thread.sleep(2000);
			this.linkQuit.click();
			Thread.sleep(3000);
		}
		this.inputUsername.sendKeys("admin");
		this.inputPassword.sendKeys("admin1");
		this.btnSubmit.click();
	}
	//错误的用户名正确的密码
	public void LoginWU() throws InterruptedException{
		boolean flag = this._driver.getPageSource().contains("前台");
		if(flag){
			this.QuitPic.click();
			Thread.sleep(2000);
			this.linkQuit.click();
			Thread.sleep(3000);
		}
		Thread.sleep(2000);
		this.inputUsername.sendKeys("AD");
		this.inputPassword.sendKeys("admin");
		this.btnSubmit.click();
	}
}
