package com.qaminds.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class FormPage extends BasePage{

	public FormPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String strInputName = "input_name";
	public final String strInputHeight = "input_height";
	public final String strInputWeight = "input_weight";
	
	public final String strInputSex = "input_sex";
	public final String strList1 = "text1";
	public final String strList2 = "text1";
	public final String strList3 = "text1";
	
	public final String strInputAge = "input_age";
	public final String strInputGoal = "input_goal";
	
	public final String strSaveButton = "save_button";
	
	public boolean getBtnSave() {
		System.out.println("llegas al método: " + strSaveButton);
		AndroidElement btnSave = getDriver().findElementById(strSaveButton);
		return btnSave.isDisplayed();
	}
	
	public void setName() {
		AndroidElement inputName = getDriver().findElementById(strInputName);
		inputName.sendKeys("Jose Luis V Calvillo");
	}
	public void setHeight() {
		AndroidElement inputHeight = getDriver().findElementById(strInputHeight);
		inputHeight.sendKeys("1.72");
	}
	public void setWeight() {
		AndroidElement inputWeight = getDriver().findElementById(strInputWeight);
		inputWeight.sendKeys("56");
	}
	public void setSex() {
		AndroidElement inputSex = getDriver().findElementById(strInputSex);
		inputSex.click();
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(strList1)));
		List<AndroidElement> ListSex = getDriver().findElementsById(strList1);
		for(AndroidElement ae : ListSex) {
			System.out.println("elemento: " + ae.getText());
			if(ae.getText().equals("Male")) {
				ae.click();
				break;
			}
		}
	}
	
	public void setAge() {
		AndroidElement inputAge = getDriver().findElementById(strInputAge);
		inputAge.click();
		getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(strList2)));
		List<AndroidElement> ListAge = getDriver().findElementsById(strList2);
		for(AndroidElement ae : ListAge) {
			System.out.println("elemento: " + ae.getText());
			if(ae.getText().equals("26")) {
				ae.click();
				break;
			}
		}
	}
	
	public void setGoal() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(strInputGoal)));
		AndroidElement inputGoal = getDriver().findElementById(strInputGoal);
		inputGoal.click();
		getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(strList3)));
		List<AndroidElement> ListGoal = getDriver().findElementsById(strList3);	
		for(AndroidElement ae : ListGoal) {
			System.out.println("elemento: " + ae.getText());
			if(ae.getText().equals("4 days a week") ) {
				ae.click();
				break;
			}
		}
	}
	
	public void clickBtn() {
		
		getWait().until(ExpectedConditions.elementToBeClickable(By.id(strSaveButton)));
		AndroidElement btnSave = getDriver().findElementById(strSaveButton);
		btnSave.click();
	}
}
