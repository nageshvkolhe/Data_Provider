package com.pro.testng_dataprovider;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_for_Sendkeys {
	public WebDriver driver ; 

	@Test(groups = "test", dataProvider="testdata")
	public void TestChrome(String uname,String password) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers1/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://mutualfund.adityabirlacapital.com/portal/investor/login");
		driver.get("https://en-gb.facebook.com/");
		
//		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys(uname);
//		driver.switchTo().activeElement().sendKeys(uname);
//		Thread.sleep(2000);
//		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.name("pass")).sendKeys(password);
//		Thread.sleep(1001);
		System.out.println("Sign In Successfully ....");
		driver.close();
	}

	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
		Object [][] facebookdata=new Object[6][2];
		//Parameters ===> Column    //Data ---> Rows
		facebookdata[0][0]="username1@gmail.com";
		facebookdata[0][1]="Password1";
		facebookdata[1][0]="username2@gmail.com";
		facebookdata[1][1]="Password2";
		facebookdata[2][0]="username3@gmail.com";
		facebookdata[2][1]="Password3";
		facebookdata[3][0]="username4@gmail.com";
		facebookdata[3][1]="Password4";
		facebookdata[4][0]="username5@gmail.com";
		facebookdata[4][1]="Password8";
		facebookdata[5][0]="username6@gmail.com";
		facebookdata[5][1]="Password15";
		return facebookdata;
	}
}
