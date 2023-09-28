package com.co.conduit.stepsdefinitions;

import com.co.conduit.models.RegisterData;
import com.co.conduit.tasks.Register;
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

    @When("^The user enter the data for the register$")
    public void theUserEnterTheDataForTheRegister(List<RegisterData> registerDataList) {
        RegisterData registerData;
        registerData = registerDataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Register.enter(registerData));

    }



    @Then("^the user should see the accommodation view\\.age$")
    public void theUserShouldSeeTheAccommodationViewAge() {

    }

}


