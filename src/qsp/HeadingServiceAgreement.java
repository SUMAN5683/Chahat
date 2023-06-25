package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadingServiceAgreement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.xpath("//a[text()=\"Read Service Agreement\"]")).click();
		Set<String> allLinks = driver.getWindowHandles();
		for(String wh:allLinks) {
			driver.switchTo().window(wh);
		List<WebElement> allHeadings = driver.findElements(By.xpath("//h2"));
		int size = allHeadings.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			String text = allHeadings.get(i).getText();
			System.out.println(text);
			
		}
		}
		
		}
	}


