package com.choucair.questions;

import com.choucair.ui.BlockValidationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyForm implements Question<Boolean> {

    public static VerifyForm isVoid() {
        return new VerifyForm();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(BlockValidationForm.REQUIRED_FIELD).answeredBy(actor).toString().isEmpty();
    }
}
