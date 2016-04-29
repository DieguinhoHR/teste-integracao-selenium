package com.uniritter.projetofinal;

import org.junit.Test;

public class NavigationLinksTest extends AbstractWebDrivarTest {  
	@Test
	public void shouldHaveNavigateProducts() {
		homePage = homePage.navigatePage();
		homePage.clickOnProduct();
		homePage.clickOnLogin();    
	}  
}
