package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SelectFromListUtils;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletcorpStepDefinition {


	public BouletcorpPage bouletcorpPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils utils;
	public SelectFromListUtils select;
	public Validations validation;
	
	public BouletcorpStepDefinition() {
		bouletcorpPage = new BouletcorpPage();
		configFileReader = new ConfigFileReader();
		utils = new SeleniumUtils();
		select = new SelectFromListUtils();
		validation = new Validations();
	}
	
	
	@Given("Je me connecte sur {string}")
	public void jeMeConnecteSur(String string) throws InterruptedException {
		utils.get(configFileReader.getProperties("home.url"));
	}
	
	@When("Je clique sur {string}")
	public void jeCliqueSur(String btnAleatoire) {
		utils.click(BouletcorpPage.btnAleatoire);
		
	   
	}
	@Then("La page change")
	public void laPageChange() {
		validation.assertNotEquals(configFileReader.getProperties("home.url"), utils.getCurrentUrl());
		

	}
	@Then("Les widgets Facebook Twitter et Tumblr sont affiches")
	public void lesWidgetsFacebookTwitterEtTumblrSontAffiches()  {
	
		Boolean facebook = validation.isElementDisplayed(BouletcorpPage.facebookWidget);
		validation.assertTrue(facebook);
		Boolean twitter = validation.isElementDisplayed(BouletcorpPage.twitterWidget);
		validation.assertTrue(twitter);
		Boolean tumblr = validation.isElementDisplayed(BouletcorpPage.tumblrWidget);
		validation.assertTrue(tumblr);

		
	}



}
