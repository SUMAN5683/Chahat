package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[]arg)
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean button=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	if(button==true)
	{
		System.err.println("is enabled");
	}
	else
	{
		System.out.println("not enabled");
	}
	driver.close();
}
}
