package com.app.demo.stepdefs;

import javax.inject.Inject;

import com.app.demo.pages.LandingPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class StepDefs {

    private final LandingPage landingPage;

    @Inject
    public StepDefs(final LandingPage landingPage) {
        this.landingPage = landingPage;
    }

    @Then("^I should see the main menu$")
    public void i_should_see_the_main_menu() throws Throwable {
        throw new PendingException();
    }
}