package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String []arg)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String color=driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
	String fontSize=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
	String fontStyle=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
	System.out.println("colour of text is "+color);
	System.out.println("size of text is "+fontSize);
	System.out.println("style of text is "+fontStyle);
	driver.close();
	}

}
