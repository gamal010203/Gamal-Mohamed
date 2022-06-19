package tests;

import org.testng.annotations.Test;

import Pages.GoogleSearch;


public class TestLuckButton extends TestBase {
	GoogleSearch G_Lucky_Object;
@Test
public void LuckSearch() {
	G_Lucky_Object= new GoogleSearch(driver);
	G_Lucky_Object.LuckyProcess("insta");
	
	
}

	
	
}
