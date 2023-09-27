package com.co.conduit.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinition {

    @Managed(driver = "chrome")
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }





    @Given("^The user is on the page$")
    public void theUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/index.es.html?label=gen173nr-1BCAEoggI46AdIM1gEaDKIAQGYAQq4ARfIAQzYAQHoAQGIAgGoAgO4AvPH0agGwAIB0gIkYTA5YTA4ZTItMDgxNi00ODhlLWEwMWQtZDJkMzkyMDgxY2Vi2AIF4AIB&sid=64a29f8d27548abc1d3fcd600c279917&keep_landing=1&sb_price_type=total&"));

    }

    @When("^The user enters his e-mail$")
    public void theUserEntersHisEMail() {

    }

    @When("^The user clicks on \"([^\"]*)\"\\.$")
    public void theUserClicksOn(String arg1) {

    }

    @Then("^The user should see the password settings page\\.$")
    public void theUserShouldSeeThePasswordSettingsPage() {

    }

    @When("^the user enters the password and confirms it\\.$")
    public void theUserEntersThePasswordAndConfirmsIt() {

    }

    @When("^the user clicks on \"([^\"]*)\"\\.$")
    public void theUserClicksOnButton(String arg1) {

    }

    @Then("^the user should see the accommodation view\\.age$")
    public void theUserShouldSeeTheAccommodationViewAge() {

    }

}
