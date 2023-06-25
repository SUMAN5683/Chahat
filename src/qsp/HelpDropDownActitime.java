package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelpDropDownActitime {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Set<String> allLinks = driver.getWindowHandles();
		for(String wh:allLinks)
		{
			driver.switchTo().window(wh);
		 List<WebElement> allHeading = driver.findElements(By.xpath("//h2"));
			int size=allHeading.size();
			for(int i=0;i<size;i++)
			{
				String text = allHeading.get(i).getText();
				System.out.println(text);
			}
			/*for( WebElement we:allHeading)
			{
				String text=((WebElement) we).getText();
				System.out.println(text);
				
			}*/
		}
		//closing child browser 1st then parent browser using iterator
		Iterator<String> i = allLinks.iterator();
		while(i.hasNext()) {
			String childWindow = i.next();
			driver.switchTo().window(childWindow);
			driver.close();
		}
	}

}
