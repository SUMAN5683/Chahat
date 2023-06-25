package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextTagAttr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[]arg)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	String eleText = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).getText();
	System.out.println(eleText);
	String eleTagname = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).getTagName();
	System.out.println(eleTagname);
	String eleAttri = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).getAttribute(eleTagname);
	System.out.println(eleAttri);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
}
}
