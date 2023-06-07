package com.e2etests.automation.page_objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;


public class BouletcorpPage {
	
	public ConfigFileReader configFileReader;
	public BouletcorpPage bouletcorpPage;

	/* Retrieve Element */
    

    
    @FindBy(how = How.XPATH, using = "//div[@id='tabvanilla']//a[contains(text(),'Aléatoire')]")
	public static WebElement btnAleatoire;
    @FindBy(how = How.XPATH, using = "//img[@title='Facebook']")
	public static WebElement facebookWidget;

	@FindBy(how = How.XPATH, using = "//img[@title='Twitter']")
	public static WebElement twitterWidget;

	@FindBy(how = How.XPATH, using = "//a[@title='Share on Tumblr']")
	public static WebElement tumblrWidget;


	public BouletcorpPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	
	
}
