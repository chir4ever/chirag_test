package org.tungstenNetwork.test.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.tungstenNetwork.test.utils.Hooks;

public class ChiragTestStepdefs extends Hooks{
    @Given("^User is on homepage$")
    public void userIsOnHomepage() throws Throwable {

    }

    @When("^User click on \"([^\"]*)\"$")
    public void userClickOn(String X) throws Throwable {
        System.out.println(X);

    }

    @Then("^User can see \"([^\"]*)\" appear on screen$")
    public void userCanSeeAppearOnScreen(String Y) throws Throwable {
        System.out.println(Y);
    }
}
