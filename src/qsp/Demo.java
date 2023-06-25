package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
	ChromeDriver c=new ChromeDriver();
	c.get("http://www.google.com");
	String title=c.getTitle();
	 System.out.println(title);
	c.close();
	
	
}
}
