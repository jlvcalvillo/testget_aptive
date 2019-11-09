package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage{

	public IntroductionPage(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public final String titleIntroductionId = "section_label";
	
	public boolean getTitleIntroduction() {
		System.out.println("llegas al método" + titleIntroductionId);
		AndroidElement titleIntroduction = getDriver().findElementById(titleIntroductionId);
		System.out.println("y pintas eso?" + titleIntroduction.getText());
		return titleIntroduction.isDisplayed();
	}
	

}
