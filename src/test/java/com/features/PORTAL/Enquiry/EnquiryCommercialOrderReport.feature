Feature: Enquiry Commercial Order Report Feature File

  Background: 
    When Navigate To Specific Portal : "Enquiry"
    And Verify title of Enquiry Login Page
    Then Login to Enquiry Using Following Credentials :
      | USERNAME        | PASSWORD  |
      | BS33333333_0250 | Shweta@21 |
    Then Click on Login button Enquiry Login Page

  Scenario: TC_ 10366_CIR&ISCAN_Enquiry
    When Click on "Order Commercial Reports " on enquiry homepage
    Then Select " Credit Information Report (CIR) " product on commercial order report
    Then Select cibil rank radio button on commercial order report
    Then Fill the following details for CIR on commercial order reports page
      | COMPANYNAME                   | TYPEOFENTITY    | CLASSOFACTIVITY | DATEOFREGISTRATION | PAN        | CIN                   | CRN    | TIN         | REGISTEREDOFFICEADDRESS                                                           | STATE       | CITY   | PINCODE | CONTACTTYPE1 | STDCODE1 | CONTACTNUMBER1 | CONTACTTYPE2 | STDCODE2 | CONTACTNUMBER2 | INDIVIDUALNAME | DOB | GENDER | RELATIONSHIPTYPE | PERSONALPAN | PERSONALUID | PERSONALVOTERID | PERSONALPASSPORTNUMBER | PERSONALDRIVINGLICENCE | PERSONALDINNUMBER | RESIDENTIALADDRESS | RESIDENTIALSTATE | RESIDENTIALCITY | RESIDENTIALPINCODE | PERSONALCONTACTTYPE1 | PERSONALSTDCODE1 | PERSONALCONTACTNUMBER1 | PERSONALCONTACTTYPE2 | PERSONALSTDCODE2 | PERSONALCONTACTNUMBER2 | ENQUIRYPURPOSE | MEMBERREFERENCENUMBER | LOANAMOUNT | ENQUIRYTYPE |
      | AUSTRELIA NEWZEALAND BANK LTD | Private Limited | Saving          | 21-02-1986         | ANZPB7291K | U55071MH2004PTC887460 | 887460 | 33294674588 | AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI | Maharashtra | Mumbai |  400025 | Telephone    |      022 |       22965441 | Telephone    |      022 |       22965445 |                |     |        |                  |             |             |                 |                        |                        |                   |                    |                  |                 |                    |                      |                  |                        |                      |                  |                        | Others         |              12852478 |     250000 | New loan    |
    Then Click on search button on commercial order report
    Then Click on "Borrower Profile" tab and "Borrower Details" on Credit Information Report
    Then Fetch the work order number on the CIR report
    Then Verify the following details
      | FIELDS                 | VALUE                         |
      | Name:                  | AUSTRELIA NEWZEALAND BANK LTD |
      | Legal Constitution:    | Private Limited               |
      | Class of Activity:     | Saving & Loan companies       |
      | Business Category:     | Large                         |
      | Industry Type:         | Service Provider              |
      | Sales Figure:          | 15,55,97,50,500 (Year: -)     |
      | No of Employees:       |                        25,000 |
      | Date of Incorporation: | 21-FEB-1986                   |
    Then Click on save as report
    Then Select download format as "PDF" option
    Then Click on download option

  Scenario Outline: TC_ 31547_CIR&ISCAN_Enquiry
    When Click on "Order Commercial Reports " on enquiry homepage
    Then Select " Credit Information Report (CIR) " product on commercial order report
    Then Select cibil rank radio button on commercial order report
    Then Fill the following details for CIR on commercial order reports page
      | <COMPANYNAME> | <TYPEOFENTITY> | <CLASSOFACTIVITY> | <DATEOFREGISTRATION> | <PAN> | <CIN> | <CRN> | <TIN> | <REGISTEREDOFFICEADDRESS> | <STATE> | <CITY> | <PINCODE> | <CONTACTTYPE1> | <STDCODE1> | <CONTACTNUMBER1> | <CONTACTTYPE2> | <STDCODE2> | <CONTACTNUMBER2> | <INDIVIDUALNAME> | <DOB> | <GENDER> | <RELATIONSHIPTYPE> | <PERSONALPAN> | <PERSONALUID> | <PERSONALVOTERID> | <PERSONALPASSPORTNUMBER> | <PERSONALDRIVINGLICENCE> | <PERSONALDINNUMBER> | <RESIDENTIALADDRESS> | <RESIDENTIALSTATE> | <RESIDENTIALCITY> | <RESIDENTIALPINCODE> | <PERSONALCONTACTTYPE1> | <PERSONALSTDCODE1> | <PERSONALCONTACTNUMBER1> | <PERSONALCONTACTTYPE2> | <PERSONALSTDCODE2> | <PERSONALCONTACTNUMBER2> | <ENQUIRYPURPOSE> | <MEMBERREFERENCENUMBER> | <LOANAMOUNT> | <ENQUIRYTYPE> |
    Then Click on search button on commercial order report
    Then Click on "Borrower Profile" tab and "Borrower Details" on Credit Information Report
    Then Fetch the work order number on the CIR report

    Examples: 
      | COMPANYNAME                   | TYPEOFENTITY    | CLASSOFACTIVITY | DATEOFREGISTRATION | PAN        | CIN                   | CRN    | TIN         | REGISTEREDOFFICEADDRESS                                                           | STATE       | CITY   | PINCODE | CONTACTTYPE1 | STDCODE1 | CONTACTNUMBER1 | CONTACTTYPE2 | STDCODE2 | CONTACTNUMBER2 | INDIVIDUALNAME | DOB | GENDER | RELATIONSHIPTYPE | PERSONALPAN | PERSONALUID | PERSONALVOTERID | PERSONALPASSPORTNUMBER | PERSONALDRIVINGLICENCE | PERSONALDINNUMBER | RESIDENTIALADDRESS | RESIDENTIALSTATE | RESIDENTIALCITY | RESIDENTIALPINCODE | PERSONALCONTACTTYPE1 | PERSONALSTDCODE1 | PERSONALCONTACTNUMBER1 | PERSONALCONTACTTYPE2 | PERSONALSTDCODE2 | PERSONALCONTACTNUMBER2 | ENQUIRYPURPOSE | MEMBERREFERENCENUMBER | LOANAMOUNT | ENQUIRYTYPE |
      | AUSTRELIA NEWZEALAND BANK LTD | Private Limited | Saving          | 21-02-1986         | ANZPB7291K |                       |        |             | AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI | Maharashtra | Mumbai |  400025 | Telephone    |      022 |       22965441 | Telephone    |      022 |       22965445 |                |     |        |                  |             |             |                 |                        |                        |                   |                    |                  |                 |                    |                      |                  |                        |                      |                  |                        | Others         |              12852478 |     250000 | New loan    |
      | AUSTRELIA NEWZEALAND BANK LTD | Private Limited | Saving          | 21-02-1986         |            | U55071MH2004PTC887460 |        |             | AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI | Maharashtra | Mumbai |  400025 | Telephone    |      022 |       22965441 | Telephone    |      022 |       22965445 |                |     |        |                  |             |             |                 |                        |                        |                   |                    |                  |                 |                    |                      |                  |                        |                      |                  |                        | Others         |              12852478 |     250000 | New loan    |
      | AUSTRELIA NEWZEALAND BANK LTD | Private Limited | Saving          | 21-02-1986         |            |                       | 887460 |             | AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI | Maharashtra | Mumbai |  400025 | Telephone    |      022 |       22965441 | Telephone    |      022 |       22965445 |                |     |        |                  |             |             |                 |                        |                        |                   |                    |                  |                 |                    |                      |                  |                        |                      |                  |                        | Others         |              12852478 |     250000 | New loan    |
      | AUSTRELIA NEWZEALAND BANK LTD | Private Limited | Saving          | 21-02-1986         |            |                       |        | 33294674588 | AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI | Maharashtra | Mumbai |  400025 | Telephone    |      022 |       22965441 | Telephone    |      022 |       22965445 |                |     |        |                  |             |             |                 |                        |                        |                   |                    |                  |                 |                    |                      |                  |                        |                      |                  |                        | Others         |              12852478 |     250000 | New loan    |

  Scenario: TC_ 31561 & 31565 & 31564 & 31566_CIR/ISCAN_Enquiry
    When Click on "Order Commercial Reports " on enquiry homepage
    Then Select " Credit Information Report (CIR) " product on commercial order report
    Then Select cibil rank radio button on commercial order report
    Then Fill the following details for CIR on commercial order reports page
      | COMPANYNAME                   | TYPEOFENTITY    | CLASSOFACTIVITY | DATEOFREGISTRATION | PAN        | CIN                   | CRN    | TIN         | REGISTEREDOFFICEADDRESS                                                           | STATE       | CITY   | PINCODE | CONTACTTYPE1 | STDCODE1 | CONTACTNUMBER1 | CONTACTTYPE2 | STDCODE2 | CONTACTNUMBER2 | INDIVIDUALNAME | DOB | GENDER | RELATIONSHIPTYPE | PERSONALPAN | PERSONALUID | PERSONALVOTERID | PERSONALPASSPORTNUMBER | PERSONALDRIVINGLICENCE | PERSONALDINNUMBER | RESIDENTIALADDRESS | RESIDENTIALSTATE | RESIDENTIALCITY | RESIDENTIALPINCODE | PERSONALCONTACTTYPE1 | PERSONALSTDCODE1 | PERSONALCONTACTNUMBER1 | PERSONALCONTACTTYPE2 | PERSONALSTDCODE2 | PERSONALCONTACTNUMBER2 | ENQUIRYPURPOSE | MEMBERREFERENCENUMBER | LOANAMOUNT | ENQUIRYTYPE |
      | AUSTRELIA NEWZEALAND BANK LTD | Private Limited | Saving          | 21-02-1986         | ANZPB7291K | U55071MH2004PTC887460 | 887460 | 33294674588 | AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI | Maharashtra | Mumbai |  400025 | Telephone    |      022 |       22965441 | Telephone    |      022 |       22965445 |                |     |        |                  |             |             |                 |                        |                        |                   |                    |                  |                 |                    |                      |                  |                        |                      |                  |                        | Others         |              12852478 |     250000 | New loan    |
    Then Click on search button on commercial order report
    Then Click on "Borrower Profile" tab and "Borrower Details" on Credit Information Report
    Then Fetch the work order number on the CIR report
    Then Verify the following details
      | FIELDS                 | VALUE                         |
      | Name:                  | AUSTRELIA NEWZEALAND BANK LTD |
      | Legal Constitution:    | Private Limited               |
      | Class of Activity:     | Saving & Loan companies       |
      | Business Category:     | Large                         |
      | Industry Type:         | Service Provider              |
      | Sales Figure:          | 15,55,97,50,500 (Year: -)     |
      | No of Employees:       |                        25,000 |
      | Date of Incorporation: | 21-FEB-1986                   |
    Then Click on save as report
    Then Select download format as "PDF" option
    Then Click on download option
    Then Select download format as "HTML" option
    Then Click on download option
    Then Select download format as "XLSX" option
    Then Click on download option

  @Tester
  Scenario: TC_ 31561 & 31565 & 31564 & 31566_CIR/ISCAN_Enquiry
    When Click on "Order Commercial Reports " on enquiry homepage
    Then Select " iSCAN (Current Account Check Report) " product on commercial order report
    Then Fill the following details for iSCAN on commercial order reports page
      | COMPANYNAME                   | TYPEOFENTITY    | CLASSOFACTIVITY | DATEOFREGISTRATION | PAN        | CIN                   | CRN    | TIN         | REGISTEREDOFFICEADDRESS                                                           | STATE       | CITY   | PINCODE | CONTACTTYPE1 | STDCODE1 | CONTACTNUMBER1 | CONTACTTYPE2 | STDCODE2 | CONTACTNUMBER2 | INDIVIDUALNAME | DOB | GENDER | RELATIONSHIPTYPE | PERSONALPAN | PERSONALUID | PERSONALVOTERID | PERSONALPASSPORTNUMBER | PERSONALDRIVINGLICENCE | PERSONALDINNUMBER | RESIDENTIALADDRESS | RESIDENTIALSTATE | RESIDENTIALCITY | RESIDENTIALPINCODE | PERSONALCONTACTTYPE1 | PERSONALSTDCODE1 | PERSONALCONTACTNUMBER1 | PERSONALCONTACTTYPE2 | PERSONALSTDCODE2 | PERSONALCONTACTNUMBER2 | ENQUIRYPURPOSE | MEMBERREFERENCENUMBER | LOANAMOUNT | ENQUIRYTYPE |
      | AUSTRELIA NEWZEALAND BANK LTD | Private Limited | Saving          | 21-02-1986         | ANZPB7291K | U55071MH2004PTC887460 | 887460 | 33294674588 | AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI | Maharashtra | Mumbai |  400025 | Telephone    |      022 |       22965441 | Telephone    |      022 |       22965445 |                |     |        |                  |             |             |                 |                        |                        |                   |                    |                  |                 |                    |                      |                  |                        |                      |                  |                        | Others         |              12852478 |     250000 | New loan    |
    Then Click on search button on commercial order report
    Then Fetch the work order number on the iSCAN report
    Then Verify the "BORROWER DETAILS" report prepared for your bank on iSCAN report as "NAME: AUSTRELIA NEWZEALAND BANK LTD LEGAL CONSTITUTION: Private Limited"
    Then Verify the "IDENTIFIERS" report prepared for your bank on iSCAN report as "PAN: ANZPB7291K CIN: U55071MH2004PTC887460"
    Then Verify the "ADDRESS" report prepared for your bank on iSCAN report as "ADDRESS: AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI,MUMBAI,MUMBAI,MAHARASHTRA,400025"
    Then Click on save as report
    Then Select download format as "PDF" option
    Then Click on download option
    Then Select download format as "HTML" option
    Then Click on download option
    Then Select download format as "XLSX" option
    Then Click on download option

  Scenario: TC_ 34550 & 34581_CIR/ISCAN_Enquiry
    When Click on "Home " on enquiry homepage
    Then Click on enquiry logout button on enquiry homepage
    Then Login to Enquiry Using Following Credentials :
      | USERNAME        | PASSWORD  |
      | BS33333333_0250 | Shweta@21 |
    Then Click on Login button Enquiry Login Page
    When Click on "Order Commercial Reports " on enquiry homepage
    Then Select " Credit Information Report (CIR) " product on commercial order report
    Then Select cibil rank radio button on commercial order report
    Then Fill the following details for CIR on commercial order reports page
      | COMPANYNAME                   | TYPEOFENTITY    | CLASSOFACTIVITY | DATEOFREGISTRATION | PAN        | CIN                   | CRN    | TIN         | REGISTEREDOFFICEADDRESS                                                           | STATE       | CITY   | PINCODE | CONTACTTYPE1 | STDCODE1 | CONTACTNUMBER1 | CONTACTTYPE2 | STDCODE2 | CONTACTNUMBER2 | INDIVIDUALNAME | DOB | GENDER | RELATIONSHIPTYPE | PERSONALPAN | PERSONALUID | PERSONALVOTERID | PERSONALPASSPORTNUMBER | PERSONALDRIVINGLICENCE | PERSONALDINNUMBER | RESIDENTIALADDRESS | RESIDENTIALSTATE | RESIDENTIALCITY | RESIDENTIALPINCODE | PERSONALCONTACTTYPE1 | PERSONALSTDCODE1 | PERSONALCONTACTNUMBER1 | PERSONALCONTACTTYPE2 | PERSONALSTDCODE2 | PERSONALCONTACTNUMBER2 | ENQUIRYPURPOSE | MEMBERREFERENCENUMBER | LOANAMOUNT | ENQUIRYTYPE |
      | AUSTRELIA NEWZEALAND BANK LTD | Private Limited | Saving          | 21-02-1986         | ANZPB7291K | U55071MH2004PTC887460 | 887460 | 33294674588 | AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI | Maharashtra | Mumbai |  400025 | Telephone    |      022 |       22965441 | Telephone    |      022 |       22965445 |                |     |        |                  |             |             |                 |                        |                        |                   |                    |                  |                 |                    |                      |                  |                        |                      |                  |                        | Others         |              12852478 |     250000 | New loan    |
    Then Click on search button on commercial order report
    Then Click on "Borrower Profile" tab and "Borrower Details" on Credit Information Report
    Then Fetch the work order number on the CIR report
    Then Verify the following details
      | FIELDS                 | VALUE                         |
      | Name:                  | AUSTRELIA NEWZEALAND BANK LTD |
      | Legal Constitution:    | Private Limited               |
      | Class of Activity:     | Saving & Loan companies       |
      | Business Category:     | Large                         |
      | Industry Type:         | Service Provider              |
      | Sales Figure:          | 15,55,97,50,500 (Year: -)     |
      | No of Employees:       |                        25,000 |
      | Date of Incorporation: | 21-FEB-1986                   |
    Then Click on save as report
    Then Select download format as "PDF" option
    Then Click on download option
    When Click on "Home " on enquiry homepage
    Then Click on enquiry logout button on enquiry homepage

  Scenario: TC_ 31534_CIR/ISCAN_Enquiry
    When Click on "Order Commercial Reports " on enquiry homepage
    Then Select " Credit Information Report (CIR) " product on commercial order report
    Then Select cibil rank radio button on commercial order report
    Then Fill the following details for CIR on commercial order reports page
      | COMPANYNAME                   | TYPEOFENTITY    | CLASSOFACTIVITY | DATEOFREGISTRATION | PAN        | CIN                   | CRN    | TIN         | REGISTEREDOFFICEADDRESS                                                           | STATE       | CITY   | PINCODE | CONTACTTYPE1 | STDCODE1 | CONTACTNUMBER1 | CONTACTTYPE2 | STDCODE2 | CONTACTNUMBER2 | INDIVIDUALNAME | DOB        | GENDER | RELATIONSHIPTYPE  | PERSONALPAN | PERSONALUID  | PERSONALVOTERID | PERSONALPASSPORTNUMBER | PERSONALDRIVINGLICENCE | PERSONALDINNUMBER | RESIDENTIALADDRESS              | RESIDENTIALSTATE | RESIDENTIALCITY | RESIDENTIALPINCODE | PERSONALCONTACTTYPE1 | PERSONALSTDCODE1 | PERSONALCONTACTNUMBER1 | PERSONALCONTACTTYPE2 | PERSONALSTDCODE2 | PERSONALCONTACTNUMBER2 | ENQUIRYPURPOSE | MEMBERREFERENCENUMBER | LOANAMOUNT | ENQUIRYTYPE |
      | AUSTRELIA NEWZEALAND BANK LTD | Private Limited | Saving          | 21-02-1986         | ANZPB7291K | U55071MH2004PTC887460 | 887460 | 33294674588 | AUSTRELIA NEWZEALAND BANK LTD, COMMERCIAL TOWER, BLOCK B, PHASE D/105, PRABHADEVI | Maharashtra | Mumbai |  400025 | Telephone    |      022 |       22965441 | Telephone    |      022 |       22965445 | Sudesh Pillai  | 21-11-1995 | Male   | Promoter Director | SUDPA2312A  | 485698652365 | AAA321564       |               31958669 | MUM23425585348535      | XCDF16532Z        | Sundar Bhavan Sector 11 A Kurla | Maharashtra      | Mumbai          |             400070 | Telephone            |              022 |               22965447 | Telephone            |              022 |               77885996 | Others         |              12852478 |     250000 | New loan    |
    Then Click on search button on commercial order report
    Then Click on "Borrower Profile" tab and "Borrower Details" on Credit Information Report
    Then Fetch the work order number on the CIR report
    Then Verify the following details
      | FIELDS                 | VALUE                         |
      | Name:                  | AUSTRELIA NEWZEALAND BANK LTD |
      | Legal Constitution:    | Private Limited               |
      | Class of Activity:     | Saving & Loan companies       |
      | Business Category:     | Large                         |
      | Industry Type:         | Service Provider              |
      | Sales Figure:          | 15,55,97,50,500 (Year: -)     |
      | No of Employees:       |                        25,000 |
      | Date of Incorporation: | 21-FEB-1986                   |
    Then Click on save as report
    Then Select download format as "PDF" option
    Then Click on download option

  @Testing1
  Scenario: TC_ 31539_CIR/ISCAN_Enquiry
    When Click on "Order Commercial Reports " on enquiry homepage
    Then Click on search button on commercial order report
    Then Verify common error message on top of enquiry order commercial form as "Error - Please select a report type"
    Then Select " Credit Information Report (CIR) " product on commercial order report
    Then Select cibil rank radio button on commercial order report
    Then Click on search button on commercial order report
    Then Verify common error message on top of enquiry order commercial form as "Error - Please fill in the mandatory field(s)"
    Then Verify error message for individual fields on order commercial report form
      | FIELDS                    | ERRORMESSAGE    |
      | Name                      | Field is empty! |
      | Type of Entity            | Field is empty! |
      | Class of Activity         | Field is empty! |
      | PAN                       | Field is empty! |
      | Registered Office Address | Field is empty! |
      | State/UT                  | Field is empty! |
      | City                      | Field is empty! |
      | Pincode                   | Field is empty! |
      | Enquiry Purpose           | Field is empty! |
      | Member Reference Number   | Field is empty! |
      | Loan Amount Applied(₹)    | Field is empty! |
      | Enquiry Type              | Field is empty! |
    Then Click on enquiry logout button on enquiry homepage
    Then Login to Enquiry Using Following Credentials :
      | USERNAME        | PASSWORD  |
      | BS33333333_0250 | Shweta@21 |
    Then Click on Login button Enquiry Login Page
    When Click on "Order Commercial Reports " on enquiry homepage
    Then Click on search button on commercial order report
    Then Verify common error message on top of enquiry order commercial form as "Error - Please select a report type"
    Then Select " iSCAN (Current Account Check Report) " product on commercial order report
    Then Click on search button on commercial order report
    Then Verify common error message on top of enquiry order commercial form as "Error - Please fill in the mandatory field(s)"
    Then Verify error message for individual fields on order commercial report form
      | FIELDS                    | ERRORMESSAGE    |
      | Name                      | Field is empty! |
      | Type of Entity            | Field is empty! |
      | Class of Activity         | Field is empty! |
      | PAN                       | Field is empty! |
      | Registered Office Address | Field is empty! |
      | State/UT                  | Field is empty! |
      | City                      | Field is empty! |
      | Pincode                   | Field is empty! |
      | Member Reference Number   | Field is empty! |
