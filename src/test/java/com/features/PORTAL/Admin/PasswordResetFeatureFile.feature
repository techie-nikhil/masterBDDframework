@Admin1
Feature: Password Reset Feature File

  Background: 
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |

  #05-08-2019
  #Saurabh
  @Admin
  Scenario: TC_13575&13576_Password_Reset
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
    Then Upload "TC_13575_Password_Reset.xlsx" File in Bulk upload for "Bulk Password Reset operation"
    Then Click on Submit button for "Bulk Password Reset operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13575_Password_Reset.xlsx" for specific bulk History
    Then Verify Latest Downloaded File Name as "TC_13575_Password_Reset.xlsx"

  #05-08-2019
  #Saurabh
  Scenario: TC_13579_Password_Reset
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
    Then Upload "TC_13579_Password_Reset.xlsx" File in Bulk upload for "Bulk Password Reset operation"
    Then Click on Submit button for "Bulk Password Reset operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13579_Password_Reset.xlsx" for specific bulk History
    Then Read error message from "TC_13579_Password_Reset.xlsx" excel as "File cannot be processed due to unavailability of data" in Row "3" and column "2"

  #05-08-2019
  #Saurabh
  Scenario: TC_13577_Password_Reset
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
    Then Upload "TC_13577_Password_Reset.txt" File in Bulk upload for "Bulk Password Reset operation"
    Then Click "OK" button for "You have uploaded file(s) that are not supported, only XLSX is supported" PopUp
