package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg){
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.indeed.com");
		String wh= driver.getWindowHandle();
		System.out.println(wh);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allWh = driver.getWindowHandles();
		System.out.println(allWh.size());
		for(String wh1:allWh) {
			driver.switchTo().window(wh1);
			
			String title = driver.getTitle();
			System.out.println(title);
			
			driver.close(); //it will close all windows (one by one) without using quit()
		}
		//driver.close(); //it will only close the current(parent)browser only,child windows remain open
		//driver.quit(); //it will close all windows when driver.close() is not used inside loop
	}
}	
