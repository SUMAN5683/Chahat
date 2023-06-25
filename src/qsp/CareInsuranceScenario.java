package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CareInsuranceScenario {
	static
	{
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		driver.findElement(By.xpath("//option[.='Apr']")).click();
		driver.findElement(By.className("ui-datepicker-year")).click();
		driver.findElement(By.xpath("//option[.='1996']")).click();
		driver.findElement(By.xpath("//a[.='22']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		WebElement txt = driver.findElement(By.id("policynumberError"));
		System.out.println(txt.getText());
		boolean isDisplayed=txt.isDisplayed();
		if(isDisplayed==true) {
			System.out.println("error message displayed");
		}
		else {
			System.out.println("error message not displayed");
		}
	}
}
