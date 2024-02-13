package com.choucair.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BlockValidationForm extends PageObject {

    public static final Target REQUIRED_FIELD = Target.the("Required field")
            .located(By.id("required2"));

    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.id("email2"));

    public static final Target PASSWORD_FIELD = Target.the("Password field")
            .located(By.id("password2"));
    public static final Target PASSWORD_CONFIRM_FIELD = Target.the("Password field")
            .located(By.id("confirm_password2"));

    public static final Target DATE_FIELD = Target.the("Date field")
            .located(By.id("date2"));

    public static final Target URL_FIELD = Target.the("URL field")
            .located(By.id("url2"));

    public static final Target DIGITS_FIELD = Target.the("Digits only field")
            .located(By.id("digits"));

    public static final Target RANGE_FIELD = Target.the("Range field between 6 and 16")
            .located(By.id("range"));

    public static final Target POLICY_AGREE_CHECKBOX = Target.the("Policy checkbox")
            .located(By.id("agree2"));

    public static final Target VALIDATE_BUTTON = Target.the("Validate button")
            .located(By.xpath("//*[@id=\"block-validate\"]/div[10]/input"));

    public static final Target VALIDATE_ERROR = Target.the("Validate button")
            .located(By.xpath("//*[@id=\"range-error\"]"));
}
