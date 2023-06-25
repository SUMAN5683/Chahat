package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass{
	@Test(groups= {"smokeTest","regressionTest"})
	public void createTask(){
		Reporter.log("create task",true);
	}
	@Test(groups= "regressionTest")
	public void modifyTask() {
		Reporter.log("modify task",true);
	}
	@Test(groups= "regressionTest")
	public void deleteTask() {
		Reporter.log("delete task",true);
	}

}
