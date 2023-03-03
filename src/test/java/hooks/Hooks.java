package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
/*
Hooks : Her bir Scenario yada Scenario Outline dan ONCE yada SONRA calismasmasini istedigim metotlar konur
@Before ve @After metotlarini icerir
Burda onemli olan raporlama isleminin ekran goruntusuyle birlikde Hooks yardimiyla yapilmasidir
 */
    @Before
    public void setUpScenarios(){
        System.out.println("Before Metotu");
    }
    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_"+scenario.getName());
            Driver.closeDriver();
        }
    }
}
