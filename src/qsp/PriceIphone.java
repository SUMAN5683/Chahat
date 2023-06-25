package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PriceIphone {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone 13 pro max");
		Thread.sleep(500);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(500);
		String price = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 Pro Max (256GB) - Sierra Blue']/../../../..)[1]/div[3]/div/div/div/div/a/span[1]/span[2]/span[2]")).getText();
			Thread.sleep(500);	
		System.out.println(price);
		driver.close();
	}

}
