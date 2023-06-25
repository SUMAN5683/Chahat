package qsp;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserOPeration {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the title browser to be closed");
		String eTitle=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.indeed.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String pWh=driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh) {
		Thread.sleep(1000);
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.equals(eTitle)) {
			System.out.println(title);
			
			driver.close();
			}
		}
			Thread.sleep(3000);
			driver.switchTo().window(pWh);
			driver.findElement(By.id("login-facebook-button")).click();
			Thread.sleep(3000);
			Set<String> allWh1 = driver.getWindowHandles();
			for(String wh1:allWh1) {
				Thread.sleep(3000);
				driver.switchTo().window(wh1);
				
				if(!(wh1.equals(pWh))) {
					driver.close();
				}
			}
			
		}
	}
	
