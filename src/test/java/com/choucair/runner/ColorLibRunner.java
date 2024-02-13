package com.choucair.runner;

import com.choucair.runner.Excel.RunnerPersonalizado;
import com.choucair.utils.excel.BeforeSuite;
import com.choucair.utils.excel.DataToFeature;

import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/features/colorlib.feature"},
        glue = {"com.choucair.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class ColorLibRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/colorlib.feature");

    }
}
