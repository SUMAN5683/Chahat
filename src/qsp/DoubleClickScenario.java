package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickScenario {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement res = driver.findElement(By.partialLinkText("Resources"));
		res.click();
		Actions a=new Actions(driver);
		a.moveToElement(res).perform();
		WebElement cust = driver.findElement(By.partialLinkText("Customers"));
		a.doubleClick(cust).perform();
		Thread.sleep(2000);
		//WebElement butt = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[@class='btn btn-primary lift']"));
		a.doubleClick(ele).perform();
		String title = driver.getTitle();
		String aTitle = "HackerEarth Case Study | Vtiger CRM";
		if(title.equals(aTitle))
		System.out.println("right page");
		else
			System.out.println("wrong page");
		driver.close();
	}

}
