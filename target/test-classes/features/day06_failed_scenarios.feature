@failed_scenario
Feature: hooks_test
  Background: googlea_git
    Given kullanici google gider
#  Bu scenariolar bilerek fail ettik.
# Raporlarda Fail durumunda ekran goruntusu eklenmis olacakdir
  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" için arama yapar
    Then sonuclarin "tea pot" icerdigini dogrula
    Then close the application

  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" için arama yapar
    Then sonuclarin "toros" icerdigini dogrula
    Then close the application
