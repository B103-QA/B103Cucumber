package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

import java.io.IOException;

public class GenelStepDefinition {
    @Then("ekran goruntusu al")
    public void ekran_goruntusu_al() throws IOException {
        ReusableMethods.getScreenshot("ekran_goruntusu");
    }
}
