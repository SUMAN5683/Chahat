package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxStatus {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	boolean box = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
	if(box==true)
	{
		System.out.println("is checked");
	}
	else
	{
		System.out.println("unchecked");
	}
		driver.close();
	}

}
