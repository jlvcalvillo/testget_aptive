package com.qaminds.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage {
	private AndroidDriver<AndroidElement> driver;
	private final WebDriverWait wait;
	
	public BasePage(MyDriverAppium driver) {
		System.out.println("llega al BasePage");
		this.wait = new WebDriverWait(driver.getDriver(),10);
		System.out.println("llega al getDriver"+ driver);
		this.driver = driver.getDriver();
	}

	public AndroidDriver<AndroidElement> getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}
	
	public void waitVisibility(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}