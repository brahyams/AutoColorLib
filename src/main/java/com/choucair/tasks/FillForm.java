package com.choucair.tasks;

import com.choucair.model.DataModel;
import com.choucair.ui.BlockValidationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FillForm implements Task {

    public FillForm(DataModel data) {
        this.data = data;
    }

    DataModel data;


    public static FillForm theForm(DataModel data) {
        return Tasks.instrumented(FillForm.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(data.getRequired()).into(BlockValidationForm.REQUIRED_FIELD),
                Enter.theValue(data.getEmail()).into(BlockValidationForm.EMAIL_FIELD),
                Enter.theValue(data.getPassword()).into(BlockValidationForm.PASSWORD_FIELD),
                Enter.theValue(data.getPassword()).into(BlockValidationForm.PASSWORD_CONFIRM_FIELD),
                Enter.theValue(data.getDate()).into(BlockValidationForm.DATE_FIELD),
                Enter.theValue(data.getUrl()).into(BlockValidationForm.URL_FIELD),
                Enter.theValue(data.getDigits()).into(BlockValidationForm.DIGITS_FIELD),
                Enter.theValue(data.getRange()).into(BlockValidationForm.RANGE_FIELD),
                Click.on(BlockValidationForm.POLICY_AGREE_CHECKBOX),
                Click.on(BlockValidationForm.VALIDATE_BUTTON)
        );

    }
}


