package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch extends PageBase {

	public GoogleSearch(WebDriver driver) {
		super(driver);

	}

	@FindBy(css = "input.gLFyf.gsfi")
	WebElement SearchBar;
	
	@FindBy(xpath  =  "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
	WebElement SearchButton;
	
	@FindBy(xpath  = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]")
	WebElement FellingLucky;

	
	
	public void SearchProcess(String SearchTxT) {
		SearchBar.clear();
		SearchBar.sendKeys(SearchTxT);
		SearchButton.click();
		
	}
	public void LuckyProcess(String SearchTxT) {
		SearchBar.clear();
		SearchBar.sendKeys(SearchTxT);
		FellingLucky.click();
		
	}
	
	
}

