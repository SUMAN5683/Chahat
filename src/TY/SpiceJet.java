package TY;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException
	{
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='From']/../div[2]/input")).sendKeys("delhi");
		driver.findElement(By.xpath("//div[text()='To']")).click();
		driver.findElement(By.xpath("//div[text()='To']/../div[2]/input")).sendKeys("mumb");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[name()='g' and @id='Round-Trip']")).click();
		//driver.findElement(null)
		Date date=new Date();
		System.out.println(date);
		
		String []dd=date.toString().split(" ");
		String day=dd[0];
		String month=dd[1];
		String d=dd[2];
		String year=dd[5];
	 String todaydate = day+" "+","+" "+month+" "+d+" "+year;
	 System.out.println(todaydate);
		driver.findElement(By.xpath("//div[.='February 2023']/following-sibling::div[2]/div/div[@data-testid='undefined-calendar-day-3']")).click();
		
		
	}

}
