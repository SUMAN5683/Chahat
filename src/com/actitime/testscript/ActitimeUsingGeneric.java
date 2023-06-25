package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseActitimeClass;

public class ActitimeUsingGeneric extends BaseActitimeClass{
	@Test
	public void login1() {
		Reporter.log("hi");
	}

}
