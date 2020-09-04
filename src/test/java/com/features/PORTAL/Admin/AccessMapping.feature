@Admin
Feature: Access Mapping Feature File

  Background: 
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |

  Scenario: TC_32307_AccessMapping
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ15151515_12 |      |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Edit Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION |
      | olm/uaadmin/d2cweb  |
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    When Navigate To Specific Portal : "Admin"
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD    |
      | ZZ15151515_12 | Zxcvbnm@123 |
    When Verify title of User Admin Page
    When Navigate To Specific Portal : "Enquiry"
    Then Login to Enquiry Using Following Credentials :
      | USERNAME      | PASSWORD    |
      | ZZ15151515_12 | Zxcvbnm@123 |
    Then Click on Login button Enquiry Login Page
    Then Verify successful login message on enquiry module: "Welcome ZZ15151515_12,"

  Scenario: TC_13525_AccessMapping
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ15151515_12 |      |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Edit Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION                                                                            |
      | olm/uaadmin/data/d2call/d2cweb/d2cbacth/iscanall/iscanweb/ iscanc2c/iscanbatch/iprobe/triggers |
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    Then Verify common error message on top of user Creation Page as "Error - Authorization Failed : Super user creation/updation"

  #step related to iprobe module is on hold due to http 404 error(30-07-2019)
  Scenario: TC_13526_AccessMapping
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ78730332_12 |      |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Edit Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION |
      | olm/uaadmin/d2cweb  |
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    When Navigate To Specific Portal : "Admin"
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD    |
      | ZZ78730332_12 | Zxcvbnm@123 |
    Then Verify common error message on Admin login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
    When Navigate To Specific Portal : "Enquiry"
    Then Login to Enquiry Using Following Credentials :
      | USERNAME      | PASSWORD    |
      | ZZ78730332_12 | Zxcvbnm@123 |
    Then Click on Login button Enquiry Login Page
    Then Verify common error message on Enquiry login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
    When Navigate To Specific Portal : "Olm"
    Then Login to Olm Using Following Credentials :
      | USERNAME      | PASSWORD    |
      | ZZ78730332_12 | Zxcvbnm@123 |
    Then Click on Login button OLM Login Page
    Then Verify common error message on OLM login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"

  Scenario: TC_13539_AccessMapping
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | BS57575757_27 |      |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Edit Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION |
      | cirweb              |
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    When Navigate To Specific Portal : "Enquiry"
    Then Login to Enquiry Using Following Credentials :
      | USERNAME      | PASSWORD  |
      | BS57575757_27 | phbKwwc@9 |
    Then Click on Login button Enquiry Login Page
    Then Verify successful login message on enquiry module: "Welcome BS57575757_27,"

  Scenario: TC_13537_AccessMapping
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ15151515_12 |      |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Edit Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION |
      | uaadmin/olm         |
    Then Verify Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION |
      | uaadmin/olm         |
    Then Deselect Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION |
      | olm                 |
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    When Navigate To Specific Portal : "olm"
    Then Login to Olm Using Following Credentials :
      | USERNAME      | PASSWORD    |
      | ZZ15151515_12 | Zxcvbnm@123 |
    Then Click on Login button OLM Login Page
    Then Verify Service Unavailable Error Message for OLM Login Page: "Service is temporarily unavailable due to unavoidable reasons. We will be back soon. Any inconvenience caused is highly regretted. Thank you for your patience."

  Scenario: TC_13540_AccessMapping
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | BS57575757_27 |      |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Edit Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION    |
      | cirweb/circ2c/cirbatch |
    Then Verify Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION    |
      | cirweb/circ2c/cirbatch |
    Then Deselect Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION |
      | cirweb              |
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    When Navigate To Specific Portal : "Enquiry"
    Then Login to Enquiry Using Following Credentials :
      | USERNAME      | PASSWORD  |
      | BS57575757_27 | phbKwwc@9 |
    Then Click on Login button Enquiry Login Page
    Then Verify common error message on Enquiry login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"

  #31-07-2019 Saurabh
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13543_AccessMapping
    When Click Logout Button In Admin Home Page
    Then Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD  |
      | ZZ20000000_27 | h@vbuZvp6 |
    Then Verify common error message on Admin login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
    When Navigate To Specific Portal : "Enquiry"
    And Verify title of Enquiry Login Page
    Then Login to Enquiry Using Following Credentials :
      | USERNAME      | PASSWORD   |
      | BS10000000_27 | 5ykdH@hvet |
    Then Click on Login button Enquiry Login Page
    Then Verify common error message on Enquiry login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
    When Navigate To Specific Portal : "Olm"
    And Verify title of OLM Login Page
    Then Login to Olm Using Following Credentials :
      | USERNAME      | PASSWORD |
      | ZZ30000000_27 | y@vsaTd2 |
    Then Click on Login button OLM Login Page
    Then Verify common error message on OLM login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13545_AccessMapping
    When Click Logout Button In Admin Home Page
    Then Navigate To Specific Portal : "Enquiry"
    And Verify title of Enquiry Login Page
    Then Login to Enquiry Using Following Credentials :
      | USERNAME      | PASSWORD  |
      | BF10000000_29 | ygn@4uqwA |
    Then Click on Login button Enquiry Login Page

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13546_AccessMapping
    When Click Logout Button In Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD |
      | BF50000000_27 | Mr@pthu8 |
    Then Navigate To Specific Portal : "Enquiry"
    And Verify title of Enquiry Login Page
    Then Login to Enquiry Using Following Credentials :
      | USERNAME      | PASSWORD |
      | BF50000000_27 | Mr@pthu8 |
    Then Click on Login button Enquiry Login Page
    Then Navigate To Specific Portal : "Olm"
    And Verify title of OLM Login Page
    Then Login to Olm Using Following Credentials :
      | USERNAME      | PASSWORD |
      | BF50000000_27 | Mr@pthu8 |
    Then Click on Login button OLM Login Page

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13547_AccessMapping
    When Click Logout Button In Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD   |
      | ZZ27272727_27 | @r3qzmbaQk |
    Then Verify common error message on Admin login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
    Then Navigate To Specific Portal : "Enquiry"
    And Verify title of Enquiry Login Page
    Then Login to Enquiry Using Following Credentials :
      | USERNAME      | PASSWORD   |
      | ZZ27272727_27 | @r3qzmbaQk |
    Then Click on Login button Enquiry Login Page
    Then Verify common error message on Enquiry login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
    Then Navigate To Specific Portal : "Olm"
    And Verify title of OLM Login Page
    Then Login to Olm Using Following Credentials :
      | USERNAME      | PASSWORD   |
      | ZZ27272727_27 | @r3qzmbaQk |
    Then Click on Login button OLM Login Page
    Then Verify common error message on OLM login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"

  @P1_High_Admin_Sprint_2 @Saurabh143 @severity=critical
  Scenario: TC_32727_AccessMapping
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Select "Optional" Checkbox for "CER Subscription" in Member Creation Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400002 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | Valid for Access   | Maharashtra | AMRAVATI |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Enter following details in Search Member Page
      | NAME | MEMBERACCESSSTSTUS | MEMBERCODE | SHORTNAME |
      |      |                    | BS12121212 |           |
    Then Click on Member Search button on Member Search page
    Then Click on View button on Search Member Page

  @P1_High_Admin_Sprint_2 @Saurabh1 @severity=critical
  Scenario: TC_32730_AccessMapping
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Select "Optional" Checkbox for "CMR SUBSCRIPTION" in Member Creation Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400002 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | Valid for Access   | Maharashtra | AMRAVATI |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Search for Member Code : "BS" on Member Search page
    Then Click on Member Search button on Member Search page
    Then Click Edit button on Search Member Page
    Then Deselect "Optional" Checkbox for "CMR SUBSCRIPTION" in Member Creation Page
    Then Select "Optional" Checkbox for "CER Subscription" in Member Creation Page
    Then click on Save button on Search Member Page PopUp
    Then click on Search Member Page Updation PopUp button
    Then click on member Successfully Updated Alert Ok button

  #01-08-2019 Saurabh
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13543_AccessMapping
    When Click Logout Button In Admin Home Page
    Then Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD  |
      | ZZ20000000_27 | h@vbuZvp6 |
    Then Verify common error message on Admin login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
    When Navigate To Specific Portal : "Enquiry"
    And Verify title of Enquiry Login Page
    Then Login to Enquiry Using Following Credentials :
      | USERNAME      | PASSWORD   |
      | BS10000000_27 | 5ykdH@hvet |
    Then Click on Login button Enquiry Login Page
    Then Verify common error message on Enquiry login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
    When Navigate To Specific Portal : "Olm"
    And Verify title of OLM Login Page
    Then Login to Olm Using Following Credentials :
      | USERNAME      | PASSWORD |
      | ZZ30000000_27 | y@vsaTd2 |
    Then Click on Login button OLM Login Page
    Then Verify common error message on OLM login Page as "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
