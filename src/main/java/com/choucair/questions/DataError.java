package com.choucair.questions;

import com.choucair.ui.BlockValidationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DataError implements Question<String> {

    public static DataError inFields(){
        return new DataError();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(BlockValidationForm.VALIDATE_ERROR).answeredBy(actor).toString();
    }
}
