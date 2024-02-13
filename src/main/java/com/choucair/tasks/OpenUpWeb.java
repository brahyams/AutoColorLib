package com.choucair.tasks;

import com.choucair.ui.AppWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpWeb implements Task {

    AppWeb appWeb;

    public static OpenUpWeb inTheBrowser() {
        return Tasks.instrumented(OpenUpWeb.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(appWeb));
    }
}
