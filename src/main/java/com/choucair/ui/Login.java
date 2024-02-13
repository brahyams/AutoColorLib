package com.choucair.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {

    public static final Target USERNAME = Target.the("Username")
            .located(By.xpath("//*[@id=\"login\"]/form/input[1]"));
    public static final Target PASSWORD = Target.the("User password")
            .located(By.xpath("//*[@id=\"login\"]/form/input[2]"));
    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button")
            .located(By.xpath("//*[@id=\"login\"]/form/button"));

}
