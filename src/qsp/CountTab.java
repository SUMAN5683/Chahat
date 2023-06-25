package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTab {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String []arg) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allTab = driver.getWindowHandles();
		System.out.println(allTab.size());
		for(String pA:allTab) {
			driver.switchTo().window(pA);
			System.out.println(pA);
		}
		//closing both tab 1st child window then parent tab using iteraor
		Iterator<String> i=allTab.iterator();
		while(i.hasNext()) {
			String childWindow=i.next();
			driver.switchTo().window(childWindow);
			driver.close();
		}
	}

}
