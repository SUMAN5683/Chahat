package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphoneSugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[]arg) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Auto-suggestion counting and printing
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]/../../../../.."));
		int count= allSugg.size();
		System.out.println("total count of suggestions provided is "+count);
		//printing all the suggestions
		for (int i=0;i<count;i++)
		{
			String txt=allSugg.get(i).getText();
			//Thread.sleep(2000);
			
			System.out.println(txt);
		}
		//selecting the first auto suggestion
		allSugg.get(count-1).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}

