package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleEle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] arg) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("number of all links is "+allLinks.size());
		/*int count=allLinks.size();
		for(int i=0;i<count;i++)
		{
			String text=allLinks.get(i).getText();
			System.out.println(text);
		}*/
		for(WebElement i:allLinks) {
			System.out.println(i.getText());
		}
		driver.close();
	}
	

}
