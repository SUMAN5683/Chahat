package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		int i=0;
		while(i<100) {
			try {
				driver.findElement(By.id("logoutLink")).click();//risky code giving n(any number till 100 in this case) number of exception
																// till login page appears so that next line gets executed
				System.out.println(driver.getTitle());//once this gets executed control goes to break, breaking the looping statement
				break;
			}
			catch(Exception e) {
				i++;//catching the exception and returning the control to try till i=100
			}
		}
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
