package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class SecondPage extends BasePage{

	public SecondPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String secondPageTitle = "section_label";
	public final String buttonNext = "intro_btn_next";
	
	public boolean getTitle() {
		System.out.println("llegas al método: " + secondPageTitle);
		AndroidElement title = getDriver().findElementById(secondPageTitle);
		System.out.println("Titulo: " + title.getText());
		return title.isDisplayed();
	}
	
	public void doClickNext() {
		System.out.println("Haciendo Clic en next de la segunda pantalla");
		AndroidElement btnNext = getDriver().findElementById(buttonNext);
		btnNext.click();
	}

}
