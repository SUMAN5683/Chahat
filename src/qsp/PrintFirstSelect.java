package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelect {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HOME/Desktop/HotelmenuDropdown.html");
	WebElement cpList = driver.findElement(By.id("cp"));
	Select s=new Select(cpList);
	WebElement firstSel = s.getFirstSelectedOption();
	System.out.println("first selected option from cp is "+firstSel.getText());
	
	//print all selected
	Select s1=new Select(cpList);
	List<WebElement> allSelOp = s1.getAllSelectedOptions();
	//int count = allSelOp.size();
	System.out.println("all selected option from cp is ");
	for(WebElement i:allSelOp) {
		
		System.out.println(i.getText());
		
		}
	/*for(int i=0;i<count;i++) {
		String text=allSelOp.get(i).getText();
		System.out.println(text);
	}*/
		driver.close();
		printFromMTR();
	
	}
	
	//printing all options
	public static void printFromMTR() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HOME/Desktop/HotelmenuDropdown.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrList);
		List<WebElement> allOp = s.getOptions();
		System.out.println("all available options of mtr is ");
		for(WebElement i:allOp) {
			
			System.out.println(i.getText());
			Thread.sleep(500);
		}
			//selecting all and deselecting in rev
			Select s1=new Select(mtrList);
			List<WebElement> allOption = s1.getOptions();
			int count=allOption.size();
			for(int j=0;j<count;j++) {
				s.selectByIndex(j);
				Thread.sleep(200);
			}
			for(int k=count-1;k>=0;k--) {
				s.deselectByIndex(k);
				Thread.sleep(200);
			}
			
			
		driver.close();
		}
		
	}


