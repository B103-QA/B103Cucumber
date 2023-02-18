Feature: ilk feature file

  Scenario: TC01_google_iphone_arama
    Given kullanici google gider
    When kullanici iphone için arama yapar
    Then sonuclarda iphone oldugunu dogrular



#  1. Her feature file, Feature: kelimesi ile baslamak zorundadir
#  2. Her bir file da, yanliz bit Feature: kullanilabilir
#  3. Senaryo(TEST CASE) olusturmak icin Scenario kelimesi kullanilir
#  4. Birden fazla Scenario: kullanilabilir
#  5. Her bir adim Given,When,And,Then,But,* kelimelerinden biriyle baslamalidir.
#  6. Given -> Genelde ilk satirlarda, pre condition stepleri icin kullanilir
#  7. Then -> Genelde son satirlarda, verification stepleri icin kullanilir
#  8. And, When -> Genelde ara adimlarda baglar olarak kullanilir
#  NOTE: Teknik olarak istenilen kelime isteniler step de kullanilabilir,
#        ama anlam karmasasi olmamasi icin bu adimlar takip edilir


