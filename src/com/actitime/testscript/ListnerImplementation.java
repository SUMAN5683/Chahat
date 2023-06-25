package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.actitime.generic.BaseActitimeClass;
import com.actitime.generic.BaseClass;

public class ListnerImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String res = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./ScreenShot/"+res+".png");
		 try {
			 FileUtils.copyFile(src, dest);
		 }
		 catch(IOException e) {
			 
		 }
	}

}