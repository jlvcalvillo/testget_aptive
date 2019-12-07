package com.qaminds.testget_apptive;


import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.qaminds.coreappium.MyDriverAppium;

public class BaseTest {
	Logger log = Logger.getLogger(BaseTest.class);
	MyDriverAppium myDriver = new MyDriverAppium();
	
	private ResourceBundle resource = ResourceBundle.getBundle("propertiesConfig");
	
	@BeforeSuite
	public void chargeDriver() {
		try {
			log.debug("se carga el driver");
			myDriver.setUpAppiumDriver();
		} catch(Exception e) {
			log.error("error BaseTest.chargeDriver()", e);
		}
	}
	
	@AfterSuite
	public void finishDriver() {
		if (myDriver != null) {
			myDriver.getDriver().quit();
		}
	}

	public ResourceBundle getResource() {
		return resource;
	}

	public void setResource(ResourceBundle resource) {
		this.resource = resource;
	}
	
}
