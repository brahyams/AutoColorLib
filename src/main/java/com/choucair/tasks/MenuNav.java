package com.choucair.tasks;

import com.choucair.ui.Menu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class MenuNav implements Task {

    public static MenuNav chooseTheForm() {
        return Tasks.instrumented(MenuNav.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Menu.OPTIONS_MENU),
                Click.on(Menu.OPTION_VALIDATIONS)
        );

    }
}
