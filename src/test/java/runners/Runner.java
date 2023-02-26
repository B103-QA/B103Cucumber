package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions",   //stepdefinitions path
        tags = "@scenario_outline_1",
        dryRun = false

)
public class Runner {
}
//Bu sinif Test caseleri RUN etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir
//Runner class, features file lar ile step defitions i birbirile baglar