Feature: User Creation Feature File

  Background: 
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD   |
      | ZZ66666666_01 | swsq@hkKd6 |

  @P1_High_Admin_Sprint_1 @severity=critical @Sprint3Test
  Scenario: TC_13423&31631&31635&31651&13438&31703&31708&31707&31709&13433&13436&13447_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME                                                                                                                     | LASTNAME                                                                                                                      | ADDRESS1                                                                                                                                                                                                 | ADDRESS2                                                                                                                                                                                                 | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID    |
      | Aaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbcccccccccccdgeyshbdgbdhfbhdbdhdnfjdhdhdbdgbdgjjjfjfhdhdyyehdhydhdyhsdyhshshdydhsjsdyjuik | Baaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbcccccccccccdgeyshbdgbdhfbhdbdhdnfjdhdhdbdgbdgjjjfjfhdhdyyehdhydhdyhsdyhshshdydhsjsdyjuik | Aaaaaaaaaa@@aaaaaaaabbbbbbbbbbbbbcccccccccccdgeyshbdgbdhfbhdbdhdnfjdhdhdbdgbdgjjjfjfhdhdyyehdhydhdyhsdyhshshdydhsjsdyjuik@@@12345-*hfjjfjkfhfnfjhjdfgjhgjdfhkudfhkdsfhkjhfhfdhxfhkfhhfhgfhdgfjghedjfghjh | Aaaaaaaaaa@@aaaaaaaikjbbbbbbbbbbbcccccccccccdgeyshbdgbdhfbhdbdhdnfjdhdhdbdgbdgjjjfjfhdhdyyehdhydhdyhsdyhshshdydhsjsdyjuik@@@12345-*hfjjfjkfhfnfjhjdfgjhgjdfhkudfhkdsfhkjhfhfdhxfhkfhhfhgfhdgfjghedjfghjh |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic19 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click "OK" button for "User added successfully!" PopUp
    Then Search for User Code : "BS33333333_" in User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table content with Created User Code "BS33333333_"

  @P1_High_Admin_Sprint_1 @severity=critical 
  Scenario Outline: TC_13426&13427_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Click reset button on User Update Page
    Then Click save button on User Creation Page
    Then Verify common error message on top of user Creation Page as "Error - Please enter valid inputs in the below highlighted fields."
    Then Verify "<ERRORMESSAGE>" for "<FIELDS>" on Create User Page

    Examples: 
      | ERRORMESSAGE    | FIELDS                |
      | Field is empty! | Member KOB            |
      | Field is empty! | Member Base           |
      | Field is empty! | Member Code           |
      | Field is empty! | First name            |
      | Field is empty! | Last name             |
      | Field is empty! | User ID               |
      | Field is empty! | Product Subscriptions |
      | Field is empty! | Address 1             |
      | Field is empty! | State/UT              |
      | Field is empty! | City                  |
      | Field is empty! | Pincode               |
      | Field is empty! | Email Address         |
      | Field is empty! | Telephone             |
      | Field is empty! | New Password          |

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13419&13420_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Check lock on "User Creation" Page
    Then Check disable on "User Creation" Page
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click "OK" button for "User added successfully!" PopUp
    Then Search for User Code : "BS33333333_" in User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table status with User Code is "locked"
    Then Verify Table status with User Code is "disabled"


  @Smoke_Admin_Sprint_1 @severity=normal @Sprint3Test
  Scenario: TC_31780_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click "Create Another" button for "User added successfully!" PopUp
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click "OK" button for "User added successfully!" PopUp
    Then Search for User Code : "BS33333333_" in User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table content with Created User Code "BS33333333_"

  @P2_Medium_Admin_Sprint_2 @severity=minor
  Scenario Outline: TC_13424&13430_User Creation/User Admin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill "<FIRSTNAME>" and "<LASTNAME>" on "create user" page
    Then Verify "<ERRORFIRSTNAME>" for "First name" on "create user" page
    Then Verify "<ERRORLASTNAME>" for "Last name" on "create user" page

    Examples: 
      | FIRSTNAME  | LASTNAME   | ERRORFIRSTNAME                      | ERRORLASTNAME                       |
      | as@$^%hjk1 | fkl*&^%ikk | Enter a valid first name            | Enter a valid last name             |
      | G HDG J    | H HHDH K   | Enter a valid first name            | Enter a valid last name             |
      | H          | k          | Please enter at least 2 characters. | Please enter at least 2 characters. |

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario Outline: TC_31706&31714_User Creation/User Admin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill "<STATE>" and "<PINCODE>" and "<EMAIL>" on "create user" page
    Then Click save button on User Creation Page
    Then Verify "<ERRORPINCODE>" for "Pincode" on "create user" page
    Then Verify "<ERROREMAIL>" for "Email Address" on "create user" page

    Examples: 
      | STATE     | PINCODE | EMAIL         | ERRORPINCODE                                                                         | ERROREMAIL                                                                |
      | Jharkhand |  400066 | abc@gmail.com | Pincode entered does not belong to the state selected. Please enter a valid pincode. | Email-id already exists for BS33333333_858. Please enter unique Email-id. |

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13441_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb/           | Maharashtra | MUMBAI | dynamic |    858 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Verify common error message on top of "user Creation" Page as "Error - User Id already exists. Please enter unique User Id."

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_15554_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       4444 | ZZ44444444 | uaadmin             | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Verify common error message on top of "user Creation" Page as "Error - You do not have the necessary permissions to create/update Super User and Admin User. Please contact the administrator for required permissions."

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_15555_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       4444 | ZZ44444444 | uaadmin/d2cweb      | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Verify common error message on top of "user Creation" Page as "Error - You do not have the necessary permissions to create/update Super User and Admin User. Please contact the administrator for required permissions."

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_15556_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION                                                                                          | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       4444 | ZZ44444444 | uaadmin/d2cweb/olm/data/d2call/d2cweb/d2cc2c/d2cbacth/iscanall/iscanweb/iscanc2c /iscanbatch/iprobe/triggers | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Verify common error message on top of "user creation" Page as "Error - Authorization Failed : Super user creation/updation"

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13738_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Fetch the value of password generated on User creation page
    Then Click Generate Password button on User Creation Page
    Then Fetch the value of password generated on User creation page
    Then Click Generate Password button on User Creation Page
    Then Fetch the value of password generated on User creation page

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_31704_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Check whether city dropdown is disabled on "user creation" page
    Then Select state on "user creation" page
      | STATE       |
      | Maharashtra |
    Then Check whether city dropdown is enabled on "user creation" page
    Then Select city mapped with state on "user creation" page
      | CITY   |
      | MUMBAI |
      | BEED   |
      | PUNE   |
      | NASHIK |
      | MAHAD  |

  @P2_Medium_Admin_Sprint_1 @severity=minor
  Scenario: TC_13463_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID  | CITY    |
      | $& )7456 | Dhanbad |
    Then Click on User Search button on User Search Page
    Then Verify Error Message for User Field "User ID" as : "Please enter a valid user ID"

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13468_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY   |
      | ZZ55228855_27 | Bokaro |
    Then Click on All In User Search Page
    Then Click on User Search button on User Search Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13469_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ12123121_27 |      |
    Then Click on Locked In User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table status with Searched User Name is "Rohit"

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13470_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY   |
      | ZZ99960001_27 | Bokaro |
    Then Click on Disabled In User Search Page
    Then Click on User Search button on User Search Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13474_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY    |
      | ZZ66666666_27 | Dhanbad |
    Then Click on Locked In User Search Page
    Then Click on Disabled In User Search Page
    Then Click on User Search button on User Search Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13475_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ66666666_27 |      |
    Then Click on Unlocked In User Search Page
    Then Click on Enabled In User Search Page
    Then Click on User Search button on User Search Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13473_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ12123121_27 |      |
    Then Click on Enabled In User Search Page
    Then Click on User Search button on User Search Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13477_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ12123121_27 |      |
    Then Click on Locked In User Search Page
    Then Click on Enabled In User Search Page
    Then Click on User Search button on User Search Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13472_User_Search_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ55228855_27 |      |
    Then Click on Unlocked In User Search Page
    Then Click on User Search button on User Search Page

  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13476_User_Search_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY |
      | ZZ99960001_27 |      |
    Then Click on Unlocked In User Search Page
    Then Click on Disabled In User Search Page
    Then Click on User Search button on User Search Page

  @P2_Medium_Admin_Sprint_1 @severity=minor
  Scenario: TC_13464_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID | CITY |
      |         | @$$( |
    Then Click on User Search button on User Search Page
    Then Verify error message for user field "User ID" as : "Field is empty!"

  @Smoke_Admin_Sprint_2 @severity=normal
  Scenario: TC_13480_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID       | CITY   |
      | ZZ55228855_27 | Bokaro |
    Then Click on User Search button on User Search Page
    Then Click on Export Excel on user search page

  @Smoke_Admin_Sprint_2 @Sprint2 @severity=normal
  Scenario: TC_32387_UserSearch_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY   |
      | BS33333333_1507 | Mumbai |
    Then Click on User Search button on User Search Page
    Then Click on view icon on user search page
    Then Verify "First name" field with value "Shwetha" on update user page
    Then Verify "Last name" field with value "Talapanty" on update user page
    Then Verify "User ID" field with value "BS33333333_1507" on update user page
    Then Verify "Address 1" field with value "Mumbai@123" on update user page
    Then Verify "Address 2" field with value "ghatkopar@234" on update user page
    Then Verify "Pincode" field with value "400078" on update user page
    Then Verify "Email Address" field with value "hd55h@gmail.com" on update user page
    Then Verify "Telephone" field with value "1234567890" on update user page
    Then Verify "Fax Number" field with value "1245678960" on update user page
    Then Verify "Product Subscriptions" dropdown with value "iscanweb" on update user page
    Then Verify "State/UT" dropdown with value "Maharashtra" on update user page

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13731&13732_CR_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID | CITY   |
      | BS7777  | Mumbai |
    Then Click on User Search button on User Search Page
    Then Verify Table content with Created User Code "BS77777777_0123"
    Then Verify "Firstname" is "Shwetha" on user search table
    Then Verify "Lastname" is "Talapanty" on user search table

  #16/7/2019
  #You need this user id in your database to automate this scenario
  @P1_High_Admin_Sprint_2 @Sprint2 @severity=critical
  Scenario Outline: TC_31969&31986_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY   |
      | BS33333333_1759 | Mumbai |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Fill "<STATE>" and "<PINCODE>" and "<EMAIL>" on "Update user" page
    Then Verify "<ERRORPINCODE>" for "Pincode" on "Update user" page
    Then Verify "<ERROREMAIL>" for "Email Address" on "Update user" page
    Then Click save button on User Creation Page
    Then Verify common error message on top of "Update user" Page as "Error - Please enter valid inputs in the below highlighted fields."

    Examples: 
      | STATE     | PINCODE | EMAIL         | ERRORPINCODE                                                                         | ERROREMAIL                                                                |
      | Jharkhand |  400066 | abc@gmail.com | Pincode entered does not belong to the state selected. Please enter a valid pincode. | Email-id already exists for BS33333333_858. Please enter unique Email-id. |

  #You need this user id in your database to automate this scenario
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13492_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY   |
      | BS33333333_1759 | Mumbai |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Update firstname on update user page
      | FIRSTNAME |
      | dynamic   |
    Then Verify "Archived" checkbox is displayed on update user page
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    Then Verify successful user updation message "User updated successfully!"
    Then Click OK button on "Update User" Success message PopUp
    Then Verify updation is done successfully on user search page

  #You need this user id in your database to automate this scenario
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13493_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY   |
      | BS33333333_1759 | Mumbai |
    Then Click on User Search button on User Search Page
    Then Verify "lastname" is "Talapanty" on user search table
    Then Click on update icon on User Search Page
    Then Update lastname on update user page
      | LASTNAME |
      | dynamic  |
    Then Click save button on User Creation Page
    Then Click cancel button on "Update user" confirm PopUp
    Then Click on close icon on user search page
    Then Verify "lastname" is "Talapanty" on user search table

  #17/7/2019
  #You need expired user id in your database to automate this scenario
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13506&13487_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID               | CITY |
      | AR64126412_CIRENQUIRY |      |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Verify password expire message "Current password expired on 1/4/2019" on user update page

  #Every time you need new expired user id to automate this scenario
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13488_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID    | CITY |
      | HF98659865 |      |
    Then Click on Disabled In User Search Page
    Then Click on User Search button on User Search Page
    Then Check on user entry on user search Page
    Then Verify Table status with User Code is "disabled"
    Then Click on update icon on User Search Page
    Then Check enabled on User Update Page
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    Then Verify successful user updation message "User updated successfully!"
    Then Click OK button on "Update User" Success message PopUp
    Then Click on Enabled In User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table status with User Code is "enabled"

  #You need this user id in your database of following last name to automate this scenario
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_32021_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY   |
      | BS33333333_6835 | Mumbai |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Verify "Last name" field with value "Talapanty" on update user page
    Then Update lastname on update user page
      | LASTNAME |
      | dynamic  |
    Then Click reset button on User Update Page
    Then Verify "Last name" field with value "Talapanty" on update user page

  #You need unlock user id in your database to automate this scenario
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13485_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY   |
      | BS33333333_6362 | Mumbai |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Check lock on "User Update" Page
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    Then Verify successful user updation message "User updated successfully!"
    Then Click OK button on "Update User" Success message PopUp
    Then Verify Table status with User Code is "locked"
    Then Verify Table status with User Code is "enabled"
    Then Click on update icon on User Search Page
    Then Check unlock on "User Update" Page
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    Then Verify successful user updation message "User updated successfully!"
    Then Click OK button on "Update User" Success message PopUp

  #You need this user id in your database to automate this scenario
  
  @P1_High_Admin_Sprint_2 @severity=critical @Sprint3Test
  Scenario: TC_32020&13481&32030&13483&32077&32078&13494_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY   |
      | BS33333333_6088 | Mumbai |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Verify "First name" field with value "Shwetha" on update user page
    Then Verify "Last name" field with value "Talapanty" on update user page
    Then Verify "Address 1" field with value "Mumbai@123" on update user page
    Then Verify "Email Address" field with value "i6f4f@gmail.com" on update user page
    Then Verify password expire message "Current password expires in 90 days" on user update page
    Then Edit details of Update user page
      | FIRSTNAME | LASTNAME | ADDRESS1            | ADDRESS2          | PINCODE | TELEPHONE  | FAXNUMBER  | STATE       | CITY   | EMAIL           |
      | Shruthi   | Patel    | Borivali,Mumbai@123 | Borivali-East@234 |  400066 | 1238554690 | 1242563960 | Maharashtra | MUMBAI | i6f4g@gmail.com |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    Then Verify successful user updation message "User updated successfully!"
    Then Click OK button on "Update User" Success message PopUp
    Then Click on update icon on User Search Page
    Then Verify "First name" field with value "Shruthi" on update user page
    Then Verify "Last name" field with value "Patel" on update user page
    Then Verify "Address 1" field with value "Borivali,Mumbai@123" on update user page
    Then Verify "Email Address" field with value "i6f4g@gmail.com" on update user page
    Then Click on close icon on user search page
    Then Click on update icon on User Search Page
    Then Edit details of Update user page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | STATE       | CITY   | EMAIL           |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | Maharashtra | MUMBAI | i6f4f@gmail.com |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    Then Verify successful user updation message "User updated successfully!"
    Then Click OK button on "Update User" Success message PopUp

  @Smoke_Admin_Sprint_2 @severity=normal
  Scenario: TC_13496_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic4 |
    Then Check lock on "User Creation" Page
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click "OK" button for "User added successfully!" PopUp
    Then Search for User Code : "BS33333333_" in User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table status with User Code is "locked"
    Then Check on user entry on user search Page
    Then Change the status of the user to "Unlock"
    Then Click on update button on user search page
    Then Click on status update button on user search page
    Then Verify Table status with User Code is "unlocked"

  #22-7-2019
  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_31967_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY   |
      | BS33333333_7982 | Mumbai |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Select state on "user update" page
      | STATE       |
      | Maharashtra |
    Then Check whether city dropdown is enabled on "user update" page
    Then Select city mapped with state on "user update" page
      | CITY   |
      | MUMBAI |
      | BEED   |
      | PUNE   |
      | NASHIK |
      | MAHAD  |

  #17-07-2019 Saurabh
 
  @P1_High_Admin_Sprint_2 @severity=critical @Sprint3Test
  Scenario: TC_15580&15581&15582_UserUpdation_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID    | CITY |
      | ZZ12341234 |      |
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Edit Bureau Roles in Update User Page
      | PRODUCTSUBSCRIPTION                                                                            |
      | olm/uaadmin/data/d2call/d2cweb/d2cbacth/iscanall/iscanweb/ iscanc2c/iscanbatch/iprobe/triggers |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Verify common error message on top of "User Updation" Page as "Error - Authorization Failed : Super user creation/updation"

  #22-07-2019 Saurabh
  @P1_High_Admin_Sprint_2 @Abhishek @severity=critical
  Scenario: TC_13497_UserUpdation_UserAdmin
    When Click Logout Button In Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic4 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click "OK" button for "User added successfully!" PopUp
    Then Search for User Code : "BS33333333_" in User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table status with User Code is "unlocked"
    Then Check on user entry on user search Page
    Then Change the status of the user to "Lock"
    Then Click on update button on user search page
    Then Click on status update button on user search page
    Then Verify Table status with User Code is "locked"

  #25-07-2019 Shwetha
  @P1_High_Admin_Sprint_3 @severity=critical
  Scenario: TC_14092_CR_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID | CITY   |
      | BS33    | Mumbai |
    Then Click on User Search button on User Search Page
    Then Verify common error message on top of "User search" Page as "Error - Please enter valid inputs in the below highlighted fields."
    Then Verify Error Message for User Field "User ID" as : "Please enter at least 6 characters."

  @P1_High_Admin_Sprint_3 @severity=critical
  Scenario: TC_13728_CR_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click OK button on "User Creation" Success PopUp
    Then Search for User Code : "BS33333333_" in User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table status with User Code is "enabled"
    Then Click on update icon on User Search Page
    Then Deselect Enabled on "User update" Page
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    Then Verify successful user updation message "User updated successfully!"
    Then Click OK button on "User Update" Success message PopUp
    Then Verify Table status with User Code is "disabled"
    Then Click on view icon on user search page
    Then Check whether archived is already checked

  @P1_High_Admin_Sprint_3 @severity=critical @Sprint3Test
  Scenario: TC_13729_CR_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click OK button on "User Creation" Success PopUp
    Then Search for User Code : "BS33333333_" in User Search Page
    Then Click on User Search button on User Search Page
    Then Click on update icon on User Search Page
    Then Deselect Enabled on "User update" Page
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click OK button on User Update confirm PopUp
    Then Verify successful user updation message "User updated successfully!"
    Then Click OK button on "User Update" Success message PopUp
    Then Verify Table status with User Code is "disabled"
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Enter the details along with disabled user email id on "User creation" page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic5 |
    Then Fill email id same as diabled user email id
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click OK button on "User Creation" Success PopUp
    Then Search for User Code : "BS33333333_" in User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table content with Created User Code "BS33333333_"

  #26-07-2019 Shwetha
  @P1_High_Admin_Sprint_3 @severity=critical
  Scenario: TC_13730_CR_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID              | CITY |
      | AR64126412_AMARNADHK |      |
    Then Click on User Search button on User Search Page
    Then Verify Table status with User Code is "disabled"
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL                    | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | amarnadhk@transunion.com | dynamic5 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Verify Error Message for User Field "Email Address " as : "Email-id already exists for AR64126412_AMARNADHK. Please enter unique Email-id."
    Then Verify common error message on top of "user creation" Page as "Error - Please enter valid inputs in the below highlighted fields."

  @P1_High_Admin_Sprint_3 @severity=critical
  Scenario: TC_13719_CR_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY |
      | BS44444444_6699 |      |
    Then Click on User Search button on User Search Page
    Then Verify Table status with User Code is "disabled"
    When Navigate To Specific Portal : "Enquiry"
    And Verify title of Enquiry Login Page
    Then Login to Enquiry Using Following Credentials :
      | USERNAME        | PASSWORD  |
      | BS44444444_6699 | eMhm@mkz6 |
    Then Click on Login button Enquiry Login Page
    Then Verify the error message enquiry for login page: "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"

  @P1_High_Admin_Sprint_3 @severity=critical
  Scenario: TC_13720&13498_User Creation_UserAdmin
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       3333 | BS33333333 | iscanweb            | Maharashtra | MUMBAI | dynamic | dynamic4 |
    Then Click Generate Password button on User Creation Page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Click OK button on "User Creation" Success PopUp
    Then Search for User Code : "BS33333333_" in User Search Page
    Then Click on User Search button on User Search Page
    Then Verify Table status with User Code is "enabled"
    Then Check on user entry on user search Page
    Then Change the status of the user to "Disable"
    Then Click on update button on user search page
    Then Click on status update button on user search page
    Then Verify colour of the disabled user id is "blurBack"
    Then Verify Table status with User Code is "disabled"
    Then Click on view icon on user search page
    Then Check whether archived is already checked

  @P1_High_Admin_Sprint_3 @severity=critical
  Scenario: TC_13719&13499_CR_UserAdmin
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY |
      | BS44444444_6699 |      |
    Then Click on User Search button on User Search Page
    Then Verify Table status with User Code is "disabled"
    Then Check main checkbox for all users
    Then Change the status of the user to "Enable"
    Then Click on update button on user search page
    Then Click on status update button on user search page
    Then Verify Table status with User Code is "disabled"
