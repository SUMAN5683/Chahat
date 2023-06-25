package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String etitle="Google";
		String atitle=driver.getTitle();
		//using Assert (hard Assert) class and static(All methods in Assert class is static) method assertequals() of assert class
		Assert.assertEquals(etitle, atitle);
		//if assertequals() will fail the remaining code if present below assert statement will not execute
		driver.close();
	}
	@Test
	public void verifyTitle1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String etitle="Soogle";
		String atitle=driver.getTitle();
		//SoftAssert will have same methods but non static
		SoftAssert s=new SoftAssert();
		s.assertEquals(etitle, atitle);
		//even if assertequals fails,code will continue to execute after assert statement
		driver.close();
		//to update the status of comparison in result window
		s.assertAll();
	}
}
