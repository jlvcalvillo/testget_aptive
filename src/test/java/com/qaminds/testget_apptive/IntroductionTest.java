package com.qaminds.testget_apptive;

import org.testng.annotations.Test;

import com.qaminds.pages.IntroductionPage;

import static org.testng.Assert.assertTrue;

public class IntroductionTest extends BaseTest{
	
	@Test
	public void validationTest() {
		System.out.println("get in validationTest " + myDriver);
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		assertTrue(introductionPage.getTitleIntroduction());
	}

}
