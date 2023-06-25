package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LatestBusinessNews {
static
{
  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> allNews = driver.findElements(By.xpath("//span[.='1']/../../../li"));
		for(WebElement e: allNews)
		{
			System.out.println(e.getText());
		}
		driver.close();
	}

}
