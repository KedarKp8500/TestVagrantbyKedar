package com.testvagrant.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	public void luanchApp(String url) throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		
			driver=new ChromeDriver();
		
		ChromeOptions chrome= new ChromeOptions();
		chrome.addArguments("chrome.switches","--disable-extensions");
		
		driver.manage().window().maximize();
		driver.get(url);
//		driver.switchTo().window("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}
	 public void closeBrowser()
	{
		driver.quit();
	}
	 
}
