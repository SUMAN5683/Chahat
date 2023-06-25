package qsp;




import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptWODup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HOME/Desktop/HotelmenuDropdown.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrList);
		List<WebElement> allOp = s.getOptions();
		Set<String> sortedOp= new TreeSet<String>();//hashset for without duplicate and random order
		int count=allOp.size();
		for(int i=0;i<count;i++) {
			String text=allOp.get(i).getText();
			sortedOp.add(text);
		}
		
		System.out.println("all available unique options of mtr in sorted order is ");
		for(String text : sortedOp) {
			System.out.println(text);
		
			
		}
		//alphabetical order without loosing duplicate element
		System.out.println("all available options along with duplicate of mtr in sorted order is");
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<count;i++) {
			String text1=allOp.get(i).getText();
			al.add(text1);
		}
		Collections.sort(al);
		for(String txt:al) {
		System.out.println(txt);
		}
		
		//print only duplicates
		System.out.println("only duplicate elements");
		Set<String> dupOp= new HashSet<String>();
		for(int i=0;i<count;i++) {
			String text2=allOp.get(i).getText();
			if(dupOp.add(text2)==false)
			{
				System.out.println(text2);
			}
		}
			
			specificEle();
			
		}
		
		
	public static void specificEle() {
	Scanner sc=new Scanner(System.in);
	String option=sc.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HOME/Desktop/HotelmenuDropdown.html");
	WebElement mtrList = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrList);
	List<WebElement> allOp = s.getOptions();
	int counter=0;
	for(int i=0;i<allOp.size();i++)
	{
		String text=allOp.get(i).getText();
		if(text.equals(option))
		{
			counter++;
		}
	}
	if(counter==0) {
		System.out.println(option+ "is not present");
	}
	else if(counter==1) {
		System.out.println(option+ "is present without duplicate");
	}
	else if(counter>1) {
		System.out.println(option+ "is present with duplicate");
	}
	sc.close();
		}
	
	}

