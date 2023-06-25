package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDOB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] arg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement dateList = driver.findElement(By.id("day"));
		Select s=new Select(dateList);
		s.selectByIndex(14);
		//WebDriverWait wait = new WebDriverWait(driver,3);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		WebElement monthList = driver.findElement(By.id("month"));
		Select s1=new Select(monthList);
		s1.selectByValue("5");
		
		WebElement yearList = driver.findElement(By.id("year"));
		Select s2=new Select(yearList);
		s2.selectByVisibleText("1995");
		Thread.sleep(1000);
		//driver.close();
	
		
	}

}
