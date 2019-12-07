package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class ThirdPage extends BasePage{

	public ThirdPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String strtitle = "section_label";
	public final String strBtnSkip = "intro_btn_skip";
	
	public boolean getTitle() {
		System.out.println("llegas al método: " + strtitle);
		AndroidElement title = getDriver().findElementById(strtitle);
		System.out.println("Titulo: " + title.getText());
		return title.isDisplayed();
	}
	
	public void skipClick() {
		System.out.println("Haciendo clic en skip");
		AndroidElement btnSkip = getDriver().findElementById(strBtnSkip);
		btnSkip.click();
	}

}
