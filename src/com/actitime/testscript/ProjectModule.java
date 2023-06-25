package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass {
	@Test(groups= {"smokeTest","regressionTest"})
	public void createProject() {
		Reporter.log("create Project",true);
	}
	@Test(groups= "regressionTest")
	public void modifyProject() {
		Reporter.log("modify Project",true);
	}
	@Test(groups= "regressionTest")
	public void deleteProject() {
		Reporter.log("delete Project",true);
	}

}
