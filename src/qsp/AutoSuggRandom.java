package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggRandom {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[]arg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//Auto-suggestion counting and printing
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter desired search text");
		String search=sc1.next();
		Thread.sleep(15000);
		
		driver.findElement(By.name("q")).sendKeys(search);
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),"+search+")]"));
		int count= allSugg.size();
		System.out.println("total count of suggestions provided is "+count);
		//printing all the suggestions
		for (int i=0;i<count;i++)
		{
			String txt=allSugg.get(i).getText();
			System.out.println(txt);
		}
		//selecting the first auto suggestion
		//allSugg.get(1).click();
		//driver.close();
		
		
	}

}
