package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentStaticWeb {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[]arg) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HOME/Desktop/staticwebpage.html");

		List<WebElement> allele = driver.findElements(By.xpath("//td"));
		int count= allele.size();
		System.out.println("total count of element present is "+count);
		//printing all the element
		for (int i=0;i<count;i++)
		{
			String txt=allele.get(i).getText();
			System.out.println(txt);
		}
		
		
		driver.close();
		
		
	}

}

