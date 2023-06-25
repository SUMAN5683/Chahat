package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimension {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[]arg)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	int height=driver.findElement(By.id("email")).getSize().getHeight();
	int width=driver.findElement(By.id("email")).getSize().getWidth();
	System.out.println("height = "+height+" & width= "+width);
	driver.close();
}
}
