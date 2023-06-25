package TY;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("anusha");
		Thread.sleep(2000);
		 List<WebElement> autosugg = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li/div/div[2]/div[1]/div[@class='wM6W7d']/span"));
		for(WebElement ele:autosugg) {
			System.out.println(ele.getText());
		}
	
	}

}

