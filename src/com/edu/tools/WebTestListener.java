package com.edu.tools;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class WebTestListener extends TestListenerAdapter{
	
	public void onTestSuccess(ITestResult result){
		System.out.println("Test success!");
	}
	//在每个测试用例开始的时候做什么
	public void onTestStart(ITestResult result){
		
	}
	//以下两个方法是在testng.xml中，test标签开始前,后执行
	public void onStart(ITestContext content){
		
	}
	@Override
	public void onFinish(ITestContext content){
//		content.getSkippedTests();
//		content.getFailedTests();
		System.out.println("Start to send Email...");
		SendMail send=new SendMail();
		try {
			send.send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
