package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]arg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com");
		/*JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,3000)");	*/
	int trgt = driver.findElement(By.linkText("Elon Musk - superhero or supervillain?")).getLocation().getY();
		RemoteWebDriver r=(RemoteWebDriver)driver;
		r.executeScript("window.scrollBy(0,"+trgt+")");
		Thread.sleep(2000);
		//bottom of the page by using document.body.scrollHeight
		r.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//go to top of page by using (0,0)in scrollTo 
		r.executeScript("window.scrollTo(0,0)");
	}

}
