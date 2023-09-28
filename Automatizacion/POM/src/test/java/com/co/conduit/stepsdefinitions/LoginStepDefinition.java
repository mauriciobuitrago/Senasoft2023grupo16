package com.co.conduit.stepsdefinitions;

import com.co.conduit.models.LoginData;
import com.co.conduit.tasks.Login;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class LoginStepDefinition {

    @Managed(driver = "chrome")
    WebDriver hisBrowser;


    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^The user is on the page view$")
    public void theUserIsOnThePageView() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/index.es.html?label=gen173nr-1BCAEoggI46AdIM1gEaDKIAQGYAQq4ARfIAQzYAQHoAQGIAgGoAgO4AvPH0agGwAIB0gIkYTA5YTA4ZTItMDgxNi00ODhlLWEwMWQtZDJkMzkyMDgxY2Vi2AIF4AIB&sid=64a29f8d27548abc1d3fcd600c279917&keep_landing=1&sb_price_type=total&"));


    }

    @When("^The user enter the data for the login$")
    public void theUserEnterTheDataForTheLogin(List<LoginData> loginDataList) {
            LoginData loginData;
            loginData = loginDataList.get(0);
            OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(loginData));


            throw new PendingException();
        }

        @Then("^the user should see the accommodation view page//.age$")
        public void theUserShouldSeeTheAccommodationViewPage () {

        }

    }

