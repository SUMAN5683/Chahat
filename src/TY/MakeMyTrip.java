package TY;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 'from' city");
		String from=sc.next();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter 'to' city");
		String to=sc1.next();
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter date in dd mm yyyy");
		String fromdate=sc2.nextLine();
		String[] doj=fromdate.split(" ");
		//System.out.println(doj);
		String date = doj[0];
		String month = doj[1];
		String year = doj[2];
		Scanner sc3=new Scanner(System.in);
		System.out.println("enter return date in dd mm yyyy");
		String todate=sc3.nextLine();
		String[] dor=fromdate.split(" ");
		String returndate = dor[0];
		String returnmonth = dor[1];
		String returnyear = dor[2];
		
	
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal']")).click();
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		
		driver.findElement(By.id("fromCity")).sendKeys(from);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		
		driver.findElement(By.id("toCity")).sendKeys(to);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'"+month+" "+year+"')]/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'"+returnmonth+" "+returnyear+"')]/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+returndate+"']")).click();
		
	}

}

