package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICCCRICKET {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> country = driver.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		List<WebElement> points = driver.findElements(By.xpath("//span[@class='u-hide-phablet']/../../../tr/td[4]"));
		for(int i=0;i<country.size();i++) {
		System.out.println(country.get(i).getText()+"..."+points.get(i).getText());	
		}
	}

}
