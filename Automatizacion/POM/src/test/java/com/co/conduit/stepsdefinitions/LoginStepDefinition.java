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

public class LoginStepDefinition {

    @Managed(driver = "chrome")
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^The user is on the login page\\.$")
    public void theUserIsOnTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://account.booking.com/sign-in"));


    }

    @When("^The user clicks on \"([^\"]*)\"$")
    public void theUserClicksOn(String arg1) {

    }

    @Then("^the user should see the \"([^\"]*)\" page\\.$")
    public void theUserShouldSeeThePage(String arg1) {

    }

    @Given("^The user is on the \"([^\"]*)\" page\\.$")
    public void theUserIsOnThePage(String arg1) {

    }

    @When("^The user enters his password$")
    public void theUserEntersHisPassword() {

    }

    @Then("^The user should be logged in$")
    public void theUserShouldBeLoggedIn() {

    }






}
