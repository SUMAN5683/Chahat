package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class DemoRobotCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[]arg) throws AWTException, IOException, InterruptedException {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(1000);
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		/*r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);*/
	}
}
