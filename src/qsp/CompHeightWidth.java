package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompHeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[]arg)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int uheight=driver.findElement(By.id("username")).getSize().getHeight();
		int uwidth=driver.findElement(By.id("username")).getSize().getWidth();
		int pheight=driver.findElement(By.name("pwd")).getSize().getHeight();
		int pwidth=driver.findElement(By.name("pwd")).getSize().getWidth();
		if(uheight==pheight && uwidth==pwidth)
		{
			System.out.println("equal dimension");
		}
		else {
			System.out.println("not equal dimension");
		}
		
		driver.close();
	}
}
