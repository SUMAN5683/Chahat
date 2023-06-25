package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAlignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		int axis1 = driver.findElement(By.xpath("(//label[text()='Female'])/../input")).getLocation().getY();
		int axis2 = driver.findElement(By.xpath("(//label[text()='Male'])/../input")).getLocation().getY();
		int axis3 = driver.findElement(By.xpath("(//label[text()='Custom'])/../input")).getLocation().getY();
		if(axis1==axis2 && axis1==axis3)
		{
			System.out.println("perfectly aligned");
		}
		else {
			System.err.println("not aligned");
		}
		driver.close();
		
		
	}

}
