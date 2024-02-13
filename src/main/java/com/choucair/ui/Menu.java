package com.choucair.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class Menu extends PageObject {

    public static final Target OPTIONS_MENU = Target.the("Click on the options menu")
            .locatedBy("//*[@id=\"menu\"]/li[6]/a/span[1]");

    public static final Target OPTION_VALIDATIONS = Target.the("Click on the validations forms")
            .located(By.xpath("//*[@id=\"menu\"]/li[6]/ul/li[2]/a"));
}
