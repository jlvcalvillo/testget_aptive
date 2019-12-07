package com.qaminds.testget_apptive;

import org.testng.annotations.Test;

import com.qaminds.pages.FormPage;
import com.qaminds.pages.IntroductionPage;
import com.qaminds.pages.SecondPage;
import com.qaminds.pages.ThirdPage;

import static org.testng.Assert.assertTrue;

public class IntroductionTest extends BaseTest{
	
	@Test
	public void validationTest() {
		System.out.println("validacion" + myDriver);
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		assertTrue(introductionPage.getTitleIntroduction());
		introductionPage.doClickNext();
		
		SecondPage secondPage = new SecondPage(myDriver);
		assertTrue(secondPage.getTitle());
		secondPage.doClickNext();
		
		ThirdPage thirdPage = new ThirdPage(myDriver);
		assertTrue(thirdPage.getTitle());
		thirdPage.skipClick();
		
		FormPage formPage = new FormPage(myDriver);
		assertTrue(formPage.getBtnSave());
		formPage.setName();
		formPage.setHeight();
		formPage.setWeight();
		formPage.setSex();
		formPage.setGoal();
		formPage.setAge();
		formPage.clickBtn();
	
	}

}
