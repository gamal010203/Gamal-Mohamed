package tests;

import org.testng.annotations.Test;

import Pages.GoogleSearch;

public class TestSearch extends TestBase {

	GoogleSearch G_Search_Object;
	@Test
	public void SearchData() {

		G_Search_Object = new GoogleSearch(driver);
		G_Search_Object.SearchProcess("InstaBug");
		driver.navigate().back();		

	}
	/*
	@Test
	public void FeelingLucky() {
		G_Search_Object = new GoogleSearch(driver);
		G_Search_Object.LuckyProcess("Insta");


	}*/

}
