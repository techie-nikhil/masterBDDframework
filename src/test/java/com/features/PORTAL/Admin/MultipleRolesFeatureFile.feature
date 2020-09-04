@Admin1
Feature: Multiple Roles Feature File

  Background: 
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |

  #02-08-2019
  #Saurabh
  Scenario: TC_13583_Multiple_Roles
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
    Then Upload "TC_13583_Multiple_Roles.txt" File in Bulk upload for "Bulk UpdateRoles operation"
    Then Click "OK" button for "You have uploaded file(s) that are not supported, only XLSX is supported" PopUp

  #02-08-2019
  #Saurabh
  Scenario: TC_13581_Multiple_Roles
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
    Then Upload "TC_13581_Multiple_Roles.xlsx" File in Bulk upload for "Bulk UpdateRoles operation"
    Then Click on Submit button for "Bulk UpdateRoles operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13581_Multiple_Roles.xlsx" for specific bulk History
    Then Verify Latest Downloaded File Name as "MultipleAssignData.xlsx"

  #02-08-2019
  #Saurabh
  Scenario: TC_13582_Multiple_Roles
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
    Then Upload "TC_13582_Multiple_Roles.xlsx" File in Bulk upload for "Bulk UpdateRoles operation"
    Then Click on Submit button for "Bulk UpdateRoles operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13582_Multiple_Roles.xlsx" for specific bulk History
   Then Verify Latest Downloaded File Name as "MultipleAssignData.xlsx"
