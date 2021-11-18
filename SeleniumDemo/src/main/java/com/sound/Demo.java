package com.sound;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/user468/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.facebook.com");
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("sound@gmail.com");
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("sss");
		d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/button[1]")).click();
			
		
		
		
//		d.get("https://www.selenium.dev/downloads/");
//		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		d.findElement(By.xpath("//div[@id='main_navbar']/ul/li[4]")).click();
		
			
	}	

}
