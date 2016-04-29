package com.uniritter.projetofinal;

import org.junit.Before;
import org.junit.Test;

import com.uniritter.pageObjects.ContactPage;

public class ContactMessageTest extends AbstractWebDrivarTest {		
	@Before
	public void testSetUp() {
		homePage.navigatePage();
	}
	
	@Test
	public void shouldSendContactMessage() {		
	
		ContactPage onContactPage = homePage.clickOnContact();
//		ContactResultPage onResultPage = onContactPage.fillFormWithData().submitForm();
//		
//		assertTrue(onResultPage.getConfirmationMessage().contains("Check your email now to confirm your sign-up."));		
	}	
}
