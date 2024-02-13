package com.choucair.stepdefinitions;

import com.choucair.model.DataModel;
import com.choucair.questions.VerifyForm;
import com.choucair.tasks.FillForm;
import com.choucair.tasks.LoginApp;
import com.choucair.tasks.MenuNav;
import com.choucair.tasks.OpenUpWeb;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ColorlibStepDefs {

    @Before
    public void configInit() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Brahyam");
    }

    @Given("A user enters to the colorlib app and go to the Block Validation page")
    public void aUserEntersToTheColorlibAppAndGoToTheBlockValidationPage() {

        OnStage.theActorInTheSpotlight().wasAbleTo(OpenUpWeb.inTheBrowser(),
                LoginApp.withCredentials());
    }

    @When("the user fill out the form of the Block Validation page")
    public void theUserFillOutTheFormOfTheBlockValidationPage(DataTable table) {

            OnStage.theActorInTheSpotlight().attemptsTo(MenuNav.chooseTheForm());
            OnStage.theActorInTheSpotlight().attemptsTo(FillForm.theForm(DataModel.setData(table).get(0)));

    }

    @Then("verifies that the form was filled out correctly with This field is required.")
    public void verifiesThatTheFormWasFilledOutCorrectlyWithThisFieldIsRequired() {

        OnStage.theActorInTheSpotlight().should(seeThat(VerifyForm.isVoid(), equalTo(true)));


    }
}
