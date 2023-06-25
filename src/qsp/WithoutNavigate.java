package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutNavigate {
	public static void main(String []arg) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	
	//driver.navigate().to("www.myntra.com");
	driver.findElementByXPath("//a[@data-group='men']").click();
	

}
}