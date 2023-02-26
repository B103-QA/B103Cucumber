@personel_olusturma
Feature: personel_olusturma
  Scenario Outline: TC01_personel_olustur
    Given kullanici "https://editor.datatables.net/" gider
    When kullanici new butonuna tiklar
    And kullanici first name "<firstname>" girer
    And kullanici last name "<lastname>" girer
    And kullanici positions "<positions>" girer
    And kullanici office "<office>" girer
    And kullanici extension "<extension>" girer
    And kullanici start_date "<start_date>" girer
    And kullanici salary "<salary>" girer
    And kullanici create buttonuna basar
    When kullanici firstname ile "<firstname>" arar
    Then firstname "<firstname>" in olustugunu test et
    Then close the application

    Examples: personel_bilgileri
      | firstname | lastname | positions    | office     | extension | start_date | salary |
      | john      | walker   | SDET         | ISTANBUL   | 345       | 2023-03-01 | 100000 |
      | zeynep    | black    | developer    | ankara     | 3412      | 2023-03-04 | 800000 |
      | ali       | tez      | BA           | Tokat      | 678       | 2023-03-08 | 870000 |
      | feyza     | sar      | PO           | Izmir      | 7456      | 2023-03-03 | 860000 |
      | Mukesh    | Srivasan | Scrum Master | Haydarabat | 980       | 2023-03-09 | 50000  |





