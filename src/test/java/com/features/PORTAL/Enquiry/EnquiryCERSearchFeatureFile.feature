#Author: Nikhil Kumar Agarwal (Agarwal.Nikhil@transunion.com)
#Keywords Summary : This feature file contains scenarios for Enquiry Module CER Search Scenarios
#Scenario: This Feature File contains following scenarios for Member Creation :-
Feature: Enquiry ECR Search Feature File.

  #| USERNAME         | PASSWORD   |TCID
  #| ZZ88041678_10102 | 6xheBmktt@ |31430,31431,31432,31433
  #| ZZ88041679_10102 | 6xheBmktt@ |31434,31435,31436,31437,31438
  #| ZZ88041680_10102 | Yytba6bd@  |31448,31449,31450,31451,31452,31453,31454,31455
  #| ZZ88041681_10102 | n@zpmAr6   |31456,31457,31458,31459,31460
  #| ZZ88041682_10102 | 6h@Hqanx   |31461,31462,31463,31464,31465
  #| ZZ88041683_10102 | @jzbqK9h   |31466,31467,31468,31469,31470 

  #@tag1
  #Scenario: TC_31430_CER_ENQUIRY
    #When Navigate To Specific Portal : "Enquiry"
    #And Verify title of Enquiry Login Page
    #Then Login to Enquiry Using Following Credentials :
      #| USERNAME         | PASSWORD   |
      #| ZZ88041678_10102 | 6xheBmktt@ |
    #Then Click on Login button Enquiry Login Page
    #Then Verify Successful Login Message on Enquiry Homepage
    #Then Click Order Commercial Report Link Enquiry Home Page
    #Then Fill Products details in Order Form
      #| PRODUCT-LABEL-NAME              | CIR-SUB-OPTION |
      #| Credit Information Report (CIR) |                |
    #Then Fill Search Parameters in Order Form
      #| COMPANY-NAME      | TYPE-OF-ENTITY  | CLASS-OF-ACTIVITY | DATE-OF-REGISTRATION | PAN        | CIN | CRN | TIN | REGISTERED-OFFICE-ADDRESS                                     | STATE-UT    | CITY   | PINCODE |
      #| BIENER SECURITIES | Private Limited | Saving            | 21-06-2018           | AAPAA7703A |     |     |     | SECTOR 7909Y,RAMGHAT ROAD,SUNTECH PLAZA,OPP PHOENIX CITY MALL | Maharashtra | Mumbai |  400022 |
    #Then Fill Application Details in Order Form
      #| ENQUIRY-PURPOSE | MEMBER-REFERENCE-NUMBER | LOAN-AMOUNT-APPLIED | ENQUIRY-TYPE |
      #| Auto Loan       |                  123456 |         98745632140 | New loan     |
    #Then Click Search button on Order Form Page
    #Then Click on "TransUnion CIBIL Rank" tab and "" on Credit Information Report
    #Then Verify Cibil Rank Error Message Displayed as "CMR not applicable for the entity.CER available but Your institution has not subscribed to CER.For subscription details,kindly contact your institutions nodal officer."
#
  #@tag1
  #Scenario: TC_31431_CER_ENQUIRY
    #When Navigate To Specific Portal : "Enquiry"
    #And Verify title of Enquiry Login Page
    #Then Login to Enquiry Using Following Credentials :
      #| USERNAME         | PASSWORD   |
      #| ZZ88041678_10102 | 6xheBmktt@ |
    #Then Click on Login button Enquiry Login Page
    #Then Verify Successful Login Message on Enquiry Homepage
    #Then Click Order Commercial Report Link Enquiry Home Page
    #Then Fill Products details in Order Form
      #| PRODUCT-LABEL-NAME              | CIR-SUB-OPTION |
      #| Credit Information Report (CIR) |                |
    #Then Fill Search Parameters in Order Form
      #| COMPANY-NAME              | TYPE-OF-ENTITY  | CLASS-OF-ACTIVITY | DATE-OF-REGISTRATION | PAN        | CIN | CRN | TIN | REGISTERED-OFFICE-ADDRESS  | STATE-UT    | CITY   | PINCODE |
      #| CANTERBURY OF NEW ZEALAND | Private Limited | Saving            | 21-08-2014           | PPPHP1986N |     |     |     | SECTOR 2B,CANTERBURY CHOWK | Maharashtra | Mumbai |  400022 |
    #Then Fill Application Details in Order Form
      #| ENQUIRY-PURPOSE | MEMBER-REFERENCE-NUMBER | LOAN-AMOUNT-APPLIED | ENQUIRY-TYPE |
      #| Auto Loan       |                  123456 |         98745632140 | New loan     |
    #Then Click Search button on Order Form Page
    #Then Click on "TransUnion CIBIL Rank" tab and "" on Credit Information Report
    #Then Verify TransUnion Cibil Rank Records Displayed as "CMR-2" on index "2"	TransUnion CIBIL Rank Page

  @tag1
  Scenario: TC_31432_CER_ENQUIRY
    When Navigate To Specific Portal : "Enquiry"
    And Verify title of Enquiry Login Page
    Then Login to Enquiry Using Following Credentials :
      | USERNAME         | PASSWORD   |
      | ZZ88041678_10102 | 6xheBmktt@ |
   Then Click on Login button Enquiry Login Page
    Then Verify Successful Login Message on Enquiry Homepage
    Then Click Order Commercial Report Link Enquiry Home Page
    Then Fill Products details in Order Form
      | PRODUCT-LABEL-NAME              | CIR-SUB-OPTION |
      | Credit Information Report (CIR) |                |
    Then Fill Search Parameters in Order Form
      | COMPANY-NAME                | TYPE-OF-ENTITY  | CLASS-OF-ACTIVITY | DATE-OF-REGISTRATION | PAN        | CIN | CRN | TIN | REGISTERED-OFFICE-ADDRESS  | STATE-UT    | CITY   | PINCODE |
      | FILA KOREA CLOTHING PVT LTD | Private Limited | Saving            | 21-08-2014           | PPPHP1990N |     |     |     | SECTOR 2B,FILA KOREA CHOWK | Maharashtra | Mumbai |  410210 |
    Then Fill Application Details in Order Form
      | ENQUIRY-PURPOSE | MEMBER-REFERENCE-NUMBER | LOAN-AMOUNT-APPLIED | ENQUIRY-TYPE |
      | Auto Loan       |                  123456 |         98745632140 | New loan     |
    Then Click Search button on Order Form Page
    Then Click on "TransUnion CIBIL Rank" tab and "" on Credit Information Report
    Then Verify TransUnion Cibil Rank Records Displayed as "NA" on index "1"	TransUnion CIBIL Rank Page
#
  #@tag1
  #Scenario: TC_31433_CER_ENQUIRY
    #When Navigate To Specific Portal : "Enquiry"
    #And Verify title of Enquiry Login Page
    #Then Login to Enquiry Using Following Credentials :
      #| USERNAME         | PASSWORD   |
      #| ZZ88041678_10102 | 6xheBmktt@ |
    #Then Click on Login button Enquiry Login Page
    #Then Verify Successful Login Message on Enquiry Homepage
    #Then Click Order Commercial Report Link Enquiry Home Page
    #Then Fill Products details in Order Form
      #| PRODUCT-LABEL-NAME              | CIR-SUB-OPTION |
      #| Credit Information Report (CIR) |                |
    #Then Fill Search Parameters in Order Form
      #| COMPANY-NAME          | TYPE-OF-ENTITY  | CLASS-OF-ACTIVITY | DATE-OF-REGISTRATION | PAN        | CIN | CRN | TIN | REGISTERED-OFFICE-ADDRESS      | STATE-UT    | CITY   | PINCODE |
      #| GEOX CLOTHING PVT LTD | Private Limited | Saving            | 21-08-2014           | PPPHP1986N |     |     |     | SECTOR 20B,GEOX CLOTHING CHOWK | Maharashtra | Mumbai |  410210 |
    #Then Fill Application Details in Order Form
      #| ENQUIRY-PURPOSE | MEMBER-REFERENCE-NUMBER | LOAN-AMOUNT-APPLIED | ENQUIRY-TYPE |
      #| Auto Loan       |                  123456 |         98745632140 | New loan     |
    #Then Click Search button on Order Form Page
    #Then Click on "TransUnion CIBIL Rank" tab and "" on Credit Information Report
    #Then Verify Cibil Rank Error Message Displayed as "CIBIL Rank not available"
#
  #@tag1
  #Scenario: TC_31434_CER_ENQUIRY
    #When Navigate To Specific Portal : "Enquiry"
    #And Verify title of Enquiry Login Page
    #Then Login to Enquiry Using Following Credentials :
      #| USERNAME         | PASSWORD   |
      #| ZZ88041679_10102 | 6xheBmktt@ |
    #Then Click on Login button Enquiry Login Page
    #Then Verify Successful Login Message on Enquiry Homepage
    #Then Click Order Commercial Report Link Enquiry Home Page
    #Then Fill Products details in Order Form
      #| PRODUCT-LABEL-NAME              | CIR-SUB-OPTION |
      #| Credit Information Report (CIR) |                |
    #Then Fill Search Parameters in Order Form
      #| COMPANY-NAME      | TYPE-OF-ENTITY  | CLASS-OF-ACTIVITY | DATE-OF-REGISTRATION | PAN        | CIN | CRN | TIN | REGISTERED-OFFICE-ADDRESS                                     | STATE-UT    | CITY   | PINCODE |
      #| BIENER SECURITIES | Private Limited | Saving            | 21-06-2018           | AAPAA7703A |     |     |     | SECTOR 7909Y,RAMGHAT ROAD,SUNTECH PLAZA,OPP PHOENIX CITY MALL | Maharashtra | Mumbai |  400022 |
    #Then Fill Application Details in Order Form
      #| ENQUIRY-PURPOSE | MEMBER-REFERENCE-NUMBER | LOAN-AMOUNT-APPLIED | ENQUIRY-TYPE |
      #| Auto Loan       |                  123456 |         98745632140 | New loan     |
    #Then Click Search button on Order Form Page
    #Then Click on "TransUnion CIBIL Rank" tab and "" on Credit Information Report
    #Then Verify TransUnion Cibil Rank Records Displayed as "CER-2" on index "2"	TransUnion CIBIL Rank Page
#
  #@tag1
  #Scenario: TC_31435_CER_ENQUIRY
    #When Navigate To Specific Portal : "Enquiry"
    #And Verify title of Enquiry Login Page
    #Then Login to Enquiry Using Following Credentials :
      #| USERNAME         | PASSWORD   |
      #| ZZ88041679_10102 | 6xheBmktt@ |
    #Then Click on Login button Enquiry Login Page
    #Then Verify Successful Login Message on Enquiry Homepage
    #Then Click Order Commercial Report Link Enquiry Home Page
    #Then Fill Products details in Order Form
      #| PRODUCT-LABEL-NAME              | CIR-SUB-OPTION |
      #| Credit Information Report (CIR) |                |
    #Then Fill Search Parameters in Order Form
      #| COMPANY-NAME      | TYPE-OF-ENTITY  | CLASS-OF-ACTIVITY | DATE-OF-REGISTRATION | PAN        | CIN | CRN | TIN | REGISTERED-OFFICE-ADDRESS                                     | STATE-UT    | CITY   | PINCODE |
      #| BIENER SECURITIES | Private Limited | Saving            | 21-06-2018           | AAPAA7703A |     |     |     | SECTOR 7909Y,RAMGHAT ROAD,SUNTECH PLAZA,OPP PHOENIX CITY MALL | Maharashtra | Mumbai |  400022 |
    #Then Fill Application Details in Order Form
      #| ENQUIRY-PURPOSE | MEMBER-REFERENCE-NUMBER | LOAN-AMOUNT-APPLIED | ENQUIRY-TYPE |
      #| Auto Loan       |                  123456 |         98745632140 | New loan     |
    #Then Click Search button on Order Form Page
    #Then Click on "TransUnion CIBIL Rank" tab and "" on Credit Information Report
    #Then Verify TransUnion Cibil Rank Records Displayed as "CER-2" on index "2"	TransUnion CIBIL Rank Page
