package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersAutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[]arg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.google.com");
		//Auto-suggestion counting and printing
		
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(2000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		int count= allSugg.size();
		System.out.println("total count of suggestions provided is "+count);
		//printing all the suggestions
		for (int i=0;i<count;i++)
		{
			String txt=allSugg.get(i).getText();
			System.out.println(txt);
		}
		//selecting the last auto suggestion
		allSugg.get(count-1).click();
		Thread.sleep(1500);
		driver.close();
		
		
	}

}

