package com.choucair.tasks;

import com.choucair.model.DataModel;
import com.choucair.ui.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginApp implements Task {

    public static LoginApp withCredentials() {
        return Tasks.instrumented(LoginApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("demo").into(Login.USERNAME),
                Enter.theValue("demo").into(Login.PASSWORD),
                Click.on(Login.SIGN_IN_BUTTON),
                Check.whether(WebElementQuestion.the(Login.SIGN_IN_BUTTON), isVisible()).andIfSo(Click.on(Login.SIGN_IN_BUTTON)).otherwise()
        );

    }
}
