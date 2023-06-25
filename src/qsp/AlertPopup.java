package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		System.out.println(text);
		driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Alert a1=driver.switchTo().alert();
		a1.dismiss();
		String txt = driver.findElement(By.id("demo")).getText();
		System.out.println(txt);
		driver.close();
		
		
	}

}
