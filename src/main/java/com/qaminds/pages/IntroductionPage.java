package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage{

	public IntroductionPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String titleIntroductionId = "section_label";
	public final String  buttonNext = "intro_btn_next";
	
	public boolean getTitleIntroduction() {
		System.out.println("llegas al método" + titleIntroductionId);
		AndroidElement titleIntroduction = getDriver().findElementById(titleIntroductionId);
		System.out.println("Titulo: " + titleIntroduction.getText());
		return titleIntroduction.isDisplayed();
	}
	
	public void doClickNext() {
		System.out.println("Haciendo Clic en next de la primer pantalla");
		AndroidElement nextButton = getDriver().findElementById(buttonNext);
		nextButton.click();
	}
	

}
