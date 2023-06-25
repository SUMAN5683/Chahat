package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserInputURL {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[]arg) throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter desired URL");//enter google.com link
		String url=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		//Auto-suggestion counting and printing
		
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count= allSugg.size();
		System.out.println("total count of suggestions provided is "+count);
		//printing all the suggestions
		for (int i=0;i<count;i++)
		{
			String txt=allSugg.get(i).getText();
			System.out.println(txt);
		}
		//selecting the first auto suggestion
		allSugg.get(0).click();
		driver.close();
		
		
	}

}
