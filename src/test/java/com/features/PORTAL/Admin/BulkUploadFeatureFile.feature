Feature: Bulk Upload Feature File

  Background: 
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME       | PASSWORD |
      | ZZ55559999_555 | fv7Cet@k |

 
  #06-08-2019 Saurabh
  @13603
  @P1_High_Admin_Sprint_1 @S1 @severity=critical
  Scenario: TC_13603_DownloadOperation_UserAdmin
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       6666 | ZZ66666666 | uaadmin             | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME | PASSWORD |
      | runtime  | runtime  |
    When Click on "Bulk" Menu, "ID Unlock" Link on Admin Home Page
    Then Upload "TC_13603_DownloadOperation_UserAdmin.xlsx" File in Bulk upload for "Bulk ID Unlock operation"
    Then Click on Submit button for "Bulk ID Unlock operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13603_DownloadOperation_UserAdmin.xlsx" for specific bulk History
		Then Verify Latest Downloaded File Name as "TC_13603_DownloadOperation_UserAdmin"
  
  #06-08-2019 Saurabh
  @P1_High_Admin_Sprint_1 @S1 @severity=critical
  Scenario: TC_13604_DownloadOperation_UserAdmin
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       6666 | ZZ66666666 | uaadmin             | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME | PASSWORD |
      | runtime  | runtime  |
    When Click on "Bulk" Menu, "Password Reset" Link on Admin Home Page
    Then Upload "TC_13604_DownloadOperation_UserAdmin.xlsx" File in Bulk upload for "Bulk Password Reset operation"
    Then Click on Submit button for "Bulk Password Reset operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13604_DownloadOperation_UserAdmin.xlsx" for specific bulk History
		Then Verify Latest Downloaded File Name as "TC_13604_DownloadOperation_UserAdmin.xlsx"
  
  #06-08-2019 Saurabh
  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13605_DownloadOperation_UserAdmin
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       6666 | ZZ66666666 | uaadmin             | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME | PASSWORD |
      | runtime  | runtime  |
    When Click on "Bulk" Menu, "ID Create" Link on Admin Home Page
    Then Upload "TC_13605_DownloadOperation_UserAdmin.xlsx" File in Bulk upload for "Bulk UserCreation operation"
    Then Click on Submit button for "Bulk UserCreation operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13605_DownloadOperation_UserAdmin.xlsx" for specific bulk History
		Then Verify Latest Downloaded File Name as "TC_13605_DownloadOperation_UserAdmin.xlsx"
  
  #06-08-2019 Saurabh
  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13606_DownloadOperation_UserAdmin
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       6666 | ZZ66666666 | uaadmin             | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME | PASSWORD |
      | runtime  | runtime  |
    When Click on "Bulk" Menu, "ID Activate" Link on Admin Home Page
    Then Upload "TC_13606_DownloadOperation_UserAdmin.xlsx" File in Bulk upload for "Bulk ID Activate operation"
    Then Click on Submit button for "Bulk ID Activate operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13606_DownloadOperation_UserAdmin.xlsx" for specific bulk History
    Then Verify Latest Downloaded File Name as "TC_13606_DownloadOperation_UserAdmin.xlsx"

  #06-08-2019 Saurabh
  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13607_DownloadOperation_UserAdmin
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       6666 | ZZ66666666 | uaadmin             | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME | PASSWORD |
      | runtime  | runtime  |
    When Click on "Bulk" Menu, "ID Deactivate" Link on Admin Home Page
    Then Upload "TC_13607_DownloadOperation_UserAdmin.xlsx" File in Bulk upload for "Bulk ID Deactivate operation"
    Then Click on Submit button for "Bulk ID Deactivate operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13607_DownloadOperation_UserAdmin.xlsx" for specific bulk History
		Then Verify Latest Downloaded File Name as "TC_13607_DownloadOperation_UserAdmin.xlsx"
  
  #06-08-2019 Saurabh
  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13608_DownloadOperation_UserAdmin
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       6666 | ZZ66666666 | uaadmin             | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME | PASSWORD |
      | runtime  | runtime  |
    When Click on "Bulk" Menu, "Onboard Member" Link on Admin Home Page
    Then Upload "TC_13608_DownloadOperation_UserAdmin.xlsx" File in Bulk upload for "Bulk MemberCreation operation"
    Then Click on Submit button for "Bulk MemberCreation operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13608_DownloadOperation_UserAdmin.xlsx" for specific bulk History
		Then Verify Latest Downloaded File Name as "TC_13608_DownloadOperation_UserAdmin.xlsx"
  
  #06-08-2019 Saurabh
  @P1_High_Admin_Sprint_1 @severity=critical
  Scenario: TC_13609_DownloadOperation_UserAdmin
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | ZZ - Cibil Users |       6666 | ZZ66666666 | uaadmin             | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    Then Click on logout button on Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME | PASSWORD |
      | runtime  | runtime  |
    When Click on "Bulk" Menu, "Multiple Roles Assignment" Link on Admin Home Page
    Then Upload "TC_13609_DownloadOperation_UserAdmin.xlsx" File in Bulk upload for "Bulk UpdateRoles operation"
    Then Click on Submit button for "Bulk UpdateRoles operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13609_DownloadOperation_UserAdmin.xlsx" for specific bulk History
    Then Verify Latest Downloaded File Name as "TC_13609_DownloadOperation_UserAdmin.xlsx"
