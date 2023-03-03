package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;


public class ExcelStepDefinitions {
//Page Objelerini Olustur

    HomePage homePage;
    LoginPage loginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String string) {
        String path="./src/test/java/resources/mysmoketestdata.xlsx";
        String sayfa = "customer_info";
        excelUtils= new ExcelUtils(path,sayfa);
        excelData=excelUtils.getDataList();

//        NOTE Loop kodunu tamamla

    }
}
