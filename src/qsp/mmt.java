package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mmt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.xpath("//body[@class='desktop in webp']"));
		System.out.println(link);
		link.click();
		Set<String> allLinks = driver.getWindowHandles();
		System.out.println(allLinks.size());
		driver.switchTo().window("\"https://www.makemytrip.com\"");
		
		/*Actions a=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"));
		a.doubleClick(target).perform();*/
	}
}
