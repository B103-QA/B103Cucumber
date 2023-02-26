package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {

    GooglePage googlePage = new GooglePage();

    @Given("kullanici google gider")
    public void kullanici_google_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
//        CEREZ CIKAN ARKADARLAR ICIN, CEREZI OKEYLEYELIM
        try{
            googlePage.popUpAccept.click();
        }catch (Exception e){

        }
    }
    @When("kullanici iphone için arama yapar")
    public void kullanici_iphone_için_arama_yapar() {
        googlePage.searchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("sonuclarda iphone oldugunu dogrular")
    public void sonuclarda_iphone_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("iPhone"));
    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
    @When("kullanici tesla için arama yapar")
    public void kullanici_tesla_için_arama_yapar() {
        googlePage.searchBox.sendKeys("tesla"+Keys.ENTER);

    }
    @Then("sonuclarda tesla oldugunu dogrular")
    public void sonuclarda_tesla_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("tesla"));

    }

    @When("kullanici {string} için arama yapar")
    public void kullanici_için_arama_yapar(String string) {
        googlePage.searchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini dogrula")
    public void sonuclarin_icerdigini_dogrula(String string) {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(string));

    }


}
