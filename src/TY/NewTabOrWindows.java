package TY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTabOrWindows {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	static String[] arr= {"1","2","3","4","5","6","7","8","9","10"};
	public static void selectcheckbox(WebDriver driver) {
		List<WebElement> list = driver.findElements(By.xpath("//p[.='Popular Filters']/../div/div/label/div[@class='checkboxContent']/p"));
		
		
		for(int i=0;i<list.size();i++) {
			String text = list.get(i).getText();
			String st;
			System.out.println(text);
			for(int j=0;j<arr.length;j++) {
				if(text.contains(arr[j])) {
					st=text+" ";
					System.out.println(st);
					driver.findElement(By.xpath("//p[.='Popular Filters']/../div/div/label/div[@class='checkboxContent']/p[.='"+st+"']/../../span/input")).click();
				}
			}	
		}
	}
	public static void selectothers(WebDriver driver) {
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='collapse show']/../div/div/label/div[@class='checkboxContent']/p"));
		for(int i1=0;i1<list1.size();i1++) {
			String text1 = list1.get(i1).getText();
			String st1;
			System.out.println(text1);
			for(int j1=0;j1<arr.length;j1++) {
				if(text1.contains(arr[j1])) {
					st1=text1+" ";
					System.out.println(st1);
					driver.findElement(By.xpath("//div[@class='collapse show']/../div/div/label/div[@class='checkboxContent']/p[.='"+st1+"']/../../span/input")).click();
				}
			}	
		}
	}
	public static void writeonexcel(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException {
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='listingCardWrap ']/div//div/div[2]/div/div/p[@class='boldFont blackText airlineName']"));
		List<WebElement> code = driver.findElements(By.xpath("//div[@class='listingCardWrap ']/div//div/div[2]/div/div/p[@class='fliCode']"));
		List<WebElement> departure = driver.findElements(By.xpath("//div[@class='timingOptionOuter']/label/div/div/div/div[@class='flexOne timeInfoLeft']/p/span"));
		List<WebElement> arrival = driver.findElements(By.xpath("//div[@class='timingOptionOuter']/label/div/div/div/div[@class='flexOne timeInfoRight']/p/span[1]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='priceSection']/div/div/p"));
		FileInputStream fis=new FileInputStream("./data/Book2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int size=name.size();
		for(int i=0;i<size;i++) {
			
		
	
		
		wb.getSheet("flights").createRow(i+1).createCell(0).setCellValue(name.get(i).getText());
		wb.getSheet("flights").getRow(i+1).createCell(1).setCellValue(code.get(i).getText());
		wb.getSheet("flights").getRow(i+1).createCell(1).setCellValue(code.get(i).getText());
		wb.getSheet("flights").getRow(i+1).createCell(2).setCellValue(departure.get(i).getText());
		wb.getSheet("flights").getRow(i+1).createCell(3).setCellValue(arrival.get(i).getText());
		wb.getSheet("flights").getRow(i+1).createCell(4).setCellValue(price.get(i).getText());
		}

	
		
		FileOutputStream fos=new FileOutputStream("./data/Book2.xlsx");
		wb.write(fos);
		
		
		
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notification");
		driver.findElement(By.id("fromCity")).sendKeys("bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		
		driver.findElement(By.id("toCity")).sendKeys("mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='dateInnerCell']/p[.='1'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Search']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		driver.findElement(By.xpath("//span[.='+ 8 more']")).click();
		selectcheckbox(driver);
		Thread.sleep(3000);
		selectothers(driver);
		writeonexcel(driver);
		
	}

}
