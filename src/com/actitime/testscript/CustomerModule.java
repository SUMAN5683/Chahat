package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.testscript.ListnerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test(groups= {"smokeTest","regressionTest"})
	public void createCustomer() {
		Reporter.log("create customer",true);
		Assert.fail();
	}
	@Test(groups= "regressionTest")
	public void modifyCustomer() {
		Reporter.log("modify customer",true);
	}
	@Test(groups="regressionTest")
	public void deleteCustomer() {
		Reporter.log("delete customer",true);
	}
}
