@scenario_outline_1
Feature: arama_feature_2

  Background: googlea_git
    Given kullanici google gider

    @regression
    Scenario Outline: arama_testi
      When kullanici "<product>" için arama yapar
      Then sonuclarin "<product>" icerdigini dogrula
      Then close the application

  Examples: data
    | product |
    | iphone  |
    | tesla   |
    | tv      |
    | flower  |
    | cat     |
    | dog     |


#Scenario -> Scenario Outline
#"" -> "<sutun_ismi>"
#Example kelimesi Scenario Outline dan sonra kullanilmali
#Example verilerin kullanildagi yerdir

