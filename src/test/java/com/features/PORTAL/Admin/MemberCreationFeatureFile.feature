#Author: Nikhil Kumar Agarwal (Agarwal.Nikhil@transunion.com)
#Keywords Summary : This Feature file contains all test cases related to Member Creation
#Scenarios: This Feature File contains following scenarios for Member Creation :-
#						TC_13325_CreateMember_UserAdmin, TC_13326_CreateMember_UserAdmin, TC_13336_CreateMember_UserAdmin
#						TC_13327_CreateMember_UserAdmin, TC_13328_CreateMember_UserAdmin,TC_13329_CreateMember_UserAdmin, TC_13313_CreateMember_UserAdmin
#						TC_13312_CreateMember_UserAdmin, TC_13315_CreateMember_UserAdmin, TC_13314_CreateMember_UserAdmin, TC_13318_CreateMember_UserAdmin
#						TC_13317_CreateMember_UserAdmin, TC_13322_CreateMember_UserAdmin, TC_31025_CreateMember_UserAdmin, TC_31125_CreateMember_UserAdmin
#						TC_13319_CreateMember_UserAdmin, TC_13332_CreateMember_UserAdmin, TC_13321_CreateMember_UserAdmint, TC_13334_CreateMember_UserAdmin
#						TC_13335_CreateMember_UserAdmin, TC_31143_CreateMember_UserAdmin, TC_31144_CreateMember_UserAdmin, TC_13352_SearchMember_UserAdmin
#						TC_31126_CreateMember_UserAdmin, TC_31140_CreateMember_UserAdmin, TC_13349_CreateMember_UserAdmin, TC_13340_CreateMember_UserAdmin
#						TC_13323_CreateMember_UserAdmin,
@Admin
Feature: Member Creation Feature File

  Background: 
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME       | PASSWORD |
      | ZZ55559999_555 | fv7Cet@k |

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13325_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID                  | MEMBERCODE | MEMBERACCESSSTSTUS | ADDONNAME        | MEMBERGROUPING           | MEMBERKOB             | STATE       | CITY       |
      | Nikhil | Agarwal   | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Nikhil      | nikhiltestUser@gmail.com | dynamic8   | Valid for Access   | CER Subscription | KOTAK MAHINDRA BANK LTD. | BS - State Bank Group | Maharashtra | AHMEDNAGAR |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Search for Member Code : "BS" on Member Search page
    Then Click on Member Search button on Member Search page
    Then Verify Table content with Created Member Code

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13326_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID                  | MEMBERCODE | MEMBERACCESSSTSTUS            | ADDONNAME        | MEMBERGROUPING           | MEMBERKOB             | STATE       | CITY       |
      | Nikhil | Agarwal   | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Nikhil      | nikhiltestUser@gmail.com | dynamic8   | New: Not Yet Valid for Access | CER Subscription | KOTAK MAHINDRA BANK LTD. | BS - State Bank Group | Maharashtra | AHMEDNAGAR |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Search for Member Code : "BS" on Member Search page
    Then Click on Member Search button on Member Search page
    Then Verify Table content with Created Member Code

  @P1_High_Admin_Sprint_1 @Sprint2 @severity=critical
  Scenario: TC_13336_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID                  | MEMBERCODE | MEMBERACCESSSTSTUS         | ADDONNAME        | MEMBERGROUPING           | MEMBERKOB             | STATE       | CITY       |
      | Nikhil | Agarwal   | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Nikhil      | nikhiltestUser@gmail.com | dynamic8   | No Longer Valid for Access | CER Subscription | KOTAK MAHINDRA BANK LTD. | BS - State Bank Group | Maharashtra | AHMEDNAGAR |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Search for Member Code : "BS" on Member Search page
    Then Click on Member Search button on Member Search page
    Then Verify Table content with Created Member Code

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13327_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID                  | MEMBERCODE | MEMBERACCESSSTSTUS   | ADDONNAME        | MEMBERGROUPING           | MEMBERKOB         | STATE       | CITY       |
      | Nikhil | Agarwal   | Mumbai   | ghatkopar |  400016 | 1234567890 | 1245678960 | Nikhil      | nikhiltestUser@gmail.com | dynamic8   | Suspended for Access | CER Subscription | KOTAK MAHINDRA BANK LTD. | BP - Private Bank | Maharashtra | AHMEDNAGAR |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Search for Member Code : "BP" on Member Search page
    Then Click on Member Search button on Member Search page
    Then Verify Table content with Created Member Code

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13328_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID                  | MEMBERCODE | MEMBERACCESSSTSTUS   | ADDONNAME        | MEMBERGROUPING           | MEMBERKOB         | STATE       | CITY       |
      | Nikhil | Agarwal   | Mumbai   | ghatkopar |  400016 | 1234567890 | 1245678960 | Nikhil      | nikhiltestUser@gmail.com | dynamic8   | Training and Testing | CER Subscription | KOTAK MAHINDRA BANK LTD. | BP - Private Bank | Maharashtra | AHMEDNAGAR |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Search for Member Code : "BP" on Member Search page
    Then Click on Member Search button on Member Search page
    Then Verify Table content with Created Member Code

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13329_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID                  | MEMBERCODE | MEMBERACCESSSTSTUS                  | ADDONNAME        | MEMBERGROUPING           | MEMBERKOB         | STATE       | CITY       |
      | Nikhil | Agarwal   | Mumbai   | ghatkopar |  400016 | 1234567890 | 1245678960 | Nikhil      | nikhiltestUser@gmail.com | dynamic8   | Valid for Access to CIR Report Only | CER Subscription | KOTAK MAHINDRA BANK LTD. | BP - Private Bank | Maharashtra | AHMEDNAGAR |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Search for Member Code : "BP" on Member Search page
    Then Click on Member Search button on Member Search page
    Then Verify Table content with Created Member Code

  @P2_Medium_Admin_Sprint_1 @severity=critical
  Scenario: TC_13323_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID                  | MEMBERCODE | MEMBERACCESSSTSTUS                                | ADDONNAME        | MEMBERGROUPING           | MEMBERKOB         | STATE       | CITY       |
      | Nikhil | Agarwal   | Mumbai   | ghatkopar |  400016 | 1234567890 | 1245678960 | Nikhil      | nikhiltestUser@gmail.com | dynamic8   | Valid for Access to IIR Only (Training & Testing) | CER Subscription | KOTAK MAHINDRA BANK LTD. | BP - Private Bank | Maharashtra | AHMEDNAGAR |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Search for Member Code : "BP" on Member Search page
    Then Click on Member Search button on Member Search page
    Then Verify Table content with Created Member Code

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13313_CreateMember_UserAdmin & TC_13312_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com |    1075812 | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify error message for "Member Code" as : "Please enter at least 8 characters." on Member Creation Page
    Then Click save button on Member Creation Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13315_CreateMember_UserAdmin & TC_13314_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | Ab75812    | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify error message for "Member Code" as : "Please enter at least 8 characters." on Member Creation Page
    Then Click save button on Member Creation Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13318_CreateMember_UserAdmin & TC_13317_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | Ab@58125   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify error message for "Member Code" as : "Invalid member base" on Member Creation Page
    Then Click save button on Member Creation Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13316_CreateMember_useradmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Click save button on Member Creation Page
    Then Verify common error message on top of member Creation Page as "Error - Please enter valid inputs in the below highlighted fields."

  @P2_Medium_Admin_Sprint_1 @severity=minor
  Scenario: TC_13322_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | Ab@58      | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify error message for "Member Code" as : "Please enter at least 8 characters." on Member Creation Page
    Then Click save button on Member Creation Page

  @P2_Medium_Admin_Sprint_1 @severity=minor
  Scenario: TC_31025_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER    | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 7873033125 | ad12345,ut56 | Vikash      | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify error message for "Fax Number" as : "Only comma and space are allowed. Please enter valid fax number." on Member Creation Page
    Then Click save button on Member Creation Page
    Then Verify common error message on top of member Creation Page as "Error - Please enter valid inputs in the below highlighted fields."

  @P2_Medium_Admin_Sprint_1 @severity=minor
  Scenario: TC_31125_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 7873033125 | 7873033128 | Vikh        | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify error message for "Contact Name" as : "Please enter at least 5 characters." on Member Creation Page
    Then Click save button on Member Creation Page
    Then Verify common error message on top of member Creation Page as "Error - Please enter valid inputs in the below highlighted fields."

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13319_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com |   12312312 | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify Member Details In Member Creation Page
      | MEMBERGROUPING           | ADDRESS1 | ADDRESS2 | CONTACTNAME | EMAILID | STATE | CITY |
      | KOTAK MAHINDRA BANK LTD. |          |          |             |         |       |      |

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13332_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1     | ADDRESS2       | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumb@12354ai | ghat@1212kopar |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com |   12312312 | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify Member Details In Member Creation Page
      | MEMBERGROUPING           | ADDRESS1     | ADDRESS2       | CONTACTNAME | EMAILID              | STATE | CITY |
      | KOTAK MAHINDRA BANK LTD. | Mumb@12354ai | ghat@1212kopar |             | vikashchth@gmail.com |       |      |

  #		11-07-2109
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13321_CreateMember_UserAdmint
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME     | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vika1212 | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13334_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME     | SHORTNAME | ADDRESS1    | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vika1212 | Thakur    | Mumbai@1232 | ghatkopar@123 |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp

  @Smoke_Admin_Sprint_2 @severity=normal
  Scenario: TC_13335_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME     | SHORTNAME | ADDRESS1    | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vika1212 | Thakur    | Mumbai@1232 | ghatkopar@123 |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Verify "OK" button Displayed for "Member added sucessfully" PopUp
    Then Verify "Add Another" button Displayed for "Member added sucessfully" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp

  @Smoke_Admin_Sprint_2 @severity=normal
  Scenario: TC_13338_CreateMember_UserAdmin
    When Click on "Search" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Search Member Page
      | MEMBERCODE | NAME | MEMBERACCESSSTSTUS | SHORTNAME |
      | BS12121212 |      |                    |           |
    Then Click on Member Search button on Member Search page
    Then Click Edit button on Search Member Page
    Then Click on Reset button on Search Member Page
    Then click on Save button on Search Member Page PopUp
    Then click on Search Member Page Updation PopUp button
    Then click on member Successfully Updated Alert Ok button

  @Smoke_Admin_Sprint_2 @severity=normal
  Scenario: TC_13346_SearchMember_UserAdmin
    When Click on "Search" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Search Member Page
      | MEMBERCODE | NAME | MEMBERACCESSSTSTUS | SHORTNAME |
      | BS12121212 |      |                    |           |
    Then Click on Member Search button on Member Search page
    Then Verify Search Member Page Result
      | MEMBERCODE | MEMBERNAME |
      |   12121212 |            |

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13348_SearchMember_UserAdmin  & TC_13350__SearchMember_UserAdmin
    When Click on "Search" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Search Member Page
      | NAME   | MEMBERACCESSSTSTUS | MEMBERCODE | SHORTNAME |
      | Vikash | Valid for Access   |            |           |
    Then Click on Member Search button on Member Search page
    Then Verify Search Member Page Result
      | MEMBERNAME | MEMBERCODE |
      | Vikash     |            |

  @P1_High_Admin_Sprint_2 @Sprint2 @severity=critical
  Scenario: TC_31143_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Verify "OK" button Displayed for "Member added sucessfully" PopUp
    Then Verify "Add Another" button Displayed for "Member added sucessfully" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp
    Then Verify title of Search Member Admin Page

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_31144_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com |   12312312 | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Click on Reset button on Search Member Page
    Then Click save button on Member Creation Page
    Then Verify error message for "Member Code" as : "Field is empty!" on Member Creation Page
    Then Verify common error message on top of member Creation Page as "Error - Please enter valid inputs in the below highlighted fields."

  #		12-07-2019
  @P1_High_Admin_Sprint_2 @Abhishek1 @severity=critical
  Scenario: TC_13352_SearchMember_UserAdmin
    When Click on "Search" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Search Member Page
      | NAME | MEMBERACCESSSTSTUS | MEMBERCODE | SHORTNAME |
      |      |                    | BS12121212 |           |
    Then Click on Member Search button on Member Search page
    Then Click Edit button on Search Member Page
    Then Enter following details in Search Member Edit Popup Page
      | NAME   |
      | Vikash |
    Then Click Reset button On View / Modify Member PopUp
    Then Verify following details in Search Member Popup Page
      | NAME   |
      | dsdsds |
    Then click on Save button on Search Member Page PopUp
    Then click on Search Member Page Updation PopUp button
    Then click on member Successfully Updated Alert Ok button

  #@P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_31126_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME     | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vika1212 | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash123   | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify Member Details In Member Creation Page
      | MEMBERGROUPING | ADDRESS1 | ADDRESS2 | CONTACTNAME | EMAILID | STATE | CITY |
      |                |          |          | Vikash123   |         |       |      |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_31140_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400042 | 1234567890 | 1245678960 | Vikash123   | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify Member Details In Member Creation Page
      | MEMBERGROUPING | ADDRESS1 | ADDRESS2 | CONTACTNAME | EMAILID              | STATE | CITY |
      |                |          |          |             | vikashchth@gmail.com |       |      |
    Then Click save button on Member Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new member creation?" PopUp
    Then Click "OK" button for "Member added sucessfully" PopUp

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13349_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  600002 | 1234567890 | 1245678960 | Vikash123   | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify error message for "Pincode" as : "Pincode entered does not belong to the state selected. Please enter a valid pincode." on Member Creation Page
    Then Click save button on Member Creation Page
    Then Verify common error message on top of member Creation Page as "Error - Please enter valid inputs in the below highlighted fields."

  @Smoke_Admin_Sprint_2 @severity=normal
  Scenario: TC_32368_SearchMember_UserAdmin
    When Click on "Search" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Search Member Page
      | NAME | MEMBERACCESSSTSTUS | MEMBERCODE | SHORTNAME |
      |      |                    | BS12121212 |           |
    Then Click on Member Search button on Member Search page
    Then Click on View button on Search Member Page
    Then Verify following details in Search Member Popup Page
      | NAME   | SHORTNAME |
      | dsdsds | sdss      |
    Then Click on Search Member view Popup Close button
    Then Verify title of Search Member Admin Page

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_31476_SearchMember_UserAdmin & TC_31508_SearchMember_UserAdmin
    When Click on "Search" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Search Member Page
      | NAME | MEMBERACCESSSTSTUS | MEMBERCODE | SHORTNAME |
      |      |                    | BS12121212 |           |
    Then Click on Member Search button on Member Search page
    Then Click on Reset button on Search Member Page
    Then Click on Member Search button on Member Search page
    Then Verify common error message on top of member Creation Page as "Error - Please enter a valid input in atleast one field"

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13340_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | ADDONNAME        | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400002 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | CER Subscription | Valid for Access   | Maharashtra | AMRAVATI |
    Then Verify Member Details In Member Creation Page
      | MEMBERGROUPING | ADDRESS1 | ADDRESS2 | CONTACTNAME | EMAILID | STATE       | CITY     |
      |                |          |          |             |         | Maharashtra | AMRAVATI |

  #18/7/2019
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_14090_CR_UserAdmin
    When Click on "Search" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Search Member Page
      | MEMBERCODE | NAME | MEMBERACCESSSTSTUS | SHORTNAME |
      | BS7777     |      |                    |           |
    Then Click on Member Search button on Member Search page
    Then Verify Search Member Page Result
      | MEMBERCODE | MEMBERNAME |
      |   77777777 | shwetha    |

  #@Saurabh2
  Scenario: TC_1_CreateMember_UserAdmin
    When Click on "Create" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Member Creation Page
      | NAME   | SHORTNAME | ADDRESS1 | ADDRESS2  | PINCODE | TELEPHONE  | FAXNUMBER  | CONTACTNAME | EMAILID              | MEMBERCODE | MEMBERKOB             | MEMBERGROUPING           | MEMBERACCESSSTSTUS | STATE       | CITY     |
      | Vikash | Thakur    | Mumbai   | ghatkopar |  400002 | 1234567890 | 1245678960 | Vikash      | vikashchth@gmail.com | dynamic8   | BS - State Bank Group | KOTAK MAHINDRA BANK LTD. | Valid for Access   | Maharashtra | AMRAVATI |
    Then Select "Optional" Checkbox for "CER Subscription" in Member Creation Page
    @13343
  Scenario: TC_13343_Search_Member_Admin
    When Click on "Search" Menu, "Member" Link on Admin Home Page
    Then Enter following details in Search Member Page
      | MEMBERCODE | NAME | MEMBERACCESSSTSTUS | SHORTNAME |
      | BS12121212 |      |                    |           |
    Then Click on Member Search button on Member Search page
    Then Click on Export Excel on user search page
    Then Verify Latest Downloaded File Name as "Member_BS12121212"
    Then Click on Export Csv on User Search Page
    Then Verify Latest Downloaded File Name as "Member_BS12121212.cc"