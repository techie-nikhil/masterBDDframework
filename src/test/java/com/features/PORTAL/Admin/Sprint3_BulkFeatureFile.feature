@Admin2
Feature: Bulk Id Activate Feature File

  Background: 
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME             | PASSWORD  |
      | ZZ98658794_CIBILUSER | 2jehan@Nf |

  Scenario: TC_15561_Id_Creation
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
    Then Upload "TC_15561_Id_Creation.xlsx" File in Bulk upload for "Bulk UserCreation operation"
    Then Click on Submit button for "Bulk UserCreation operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_15561_Id_Creation.xlsx" for specific bulk History
    Then Read error message from "TC_15561_Id_Creation.xlsx" excel as "Authorization Failed : Super user creation/updation" in Row "5" and column "4"

  Scenario: TC_15557_Id_Creation
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
    Then Upload "TC_15557_Id_Creation.xlsx" File in Bulk upload for "Bulk UserCreation operation"
    Then Click on Submit button for "Bulk UserCreation operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_15557_Id_Creation.xlsx" for specific bulk History
    Then Read error message from "TC_15557_Id_Creation.xlsx" excel as "You do not have the necessary permissions to create/update Super User and Admin User. Please contact the administrator for required permissions." in Row "3" and column "4"

  Scenario: TC_15560_Id_Creation
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
    Then Upload "TC_15560_Id_Creation.xlsx" File in Bulk upload for "Bulk UserCreation operation"
    Then Click on Submit button for "Bulk UserCreation operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_15560_Id_Creation.xlsx" for specific bulk History
    Then Read error message from "TC_15560_Id_Creation.xlsx" excel as "You do not have the necessary permissions to create/update Super User and Admin User. Please contact the administrator for required permissions." in Row "2" and column "4"

  Scenario: TC_13558_Id_Creation
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
    Then Upload "TC_13558_ID_Creation.xlsx" File in Bulk upload for "Bulk UserCreation operation"
    Then Click on Submit button for "Bulk UserCreation operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13558_ID_Creation.xlsx" for specific bulk History
    Then Read error message from "TC_13558_ID_Creation.xlsx" excel as "File cannot be processed due to unavailability of data" in Row "3" and column "2"

  Scenario: TC_13549_Id_Creation
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
    Then Read "TC_13549_Id_Creation.xlsx" Workbook
    Then Set "BS33333333_dynamic4" in Row No "8" and Column No "0" for Sheet "Sheet1"
    Then Set "vikashTestUserdynamic4@gmail.com" in Row No "8" and Column No "10" for Sheet "Sheet1"
    Then Save "TC_13549_Id_Creation.xlsx" Workbook
    When Click on "Bulk" Menu, "ID Create" Link on Admin Home Page
    Then Upload "TC_13549_Id_Creation.xlsx" File in Bulk upload for "Bulk UserCreation operation"
    Then Click on Submit button for "Bulk UserCreation operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13549_Id_Creation.xlsx" for specific bulk History
    Then Read error message from "TC_13549_Id_Creation.xlsx" excel as "Success" in Row "2" and column "3"
@13559
  Scenario: TC_13559_Id_Creation
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
    Then Read "TC_13559_Id_Creation.xlsx" Workbook
    Then Set "BS33333333_dynamic4" in Row No "8" and Column No "0" for Sheet "Sheet1"
    Then Set "vikashTestUserdynamic4@gmail.com" in Row No "8" and Column No "10" for Sheet "Sheet1"
    Then Save "TC_13559_Id_Creation.xlsx" Workbook
    When Click on "Bulk" Menu, "ID Create" Link on Admin Home Page
    Then Upload "TC_13559_Id_Creation.xlsx" File in Bulk upload for "Bulk UserCreation operation"
    Then Click on Submit button for "Bulk UserCreation operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File is processing... You will get email after file processing done." PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13559_Id_Creation.xlsx" for specific bulk History
    Then Read error message from "TC_13559_Id_Creation.xlsx" excel as "Success" in Row "2" and column "3"
    Then Read error message from "TC_13559_Id_Creation.xlsx" excel as "User Id already exists. Please enter unique User Id." in Row "8" and column "4"

  Scenario: TC_13594_Id_Deactivate
    When Click on "Bulk" Menu, "ID Deactivate" Link on Admin Home Page
    Then Upload "TC_13594_Id_Deactivate.txt" File in Bulk upload for "Bulk ID Deactivate operation"
    Then Click "OK" button for "You have uploaded file(s) that are not supported, only XLSX is supported" PopUp

  Scenario: TC_13592_Id_Deactivate
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
    Then Upload "TC_13592_Id_Deactivate.xlsx" File in Bulk upload for "Bulk ID Deactivate operation"
    Then Click on Submit button for "Bulk ID Deactivate operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File process with error" PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13592_Id_Deactivate.xlsx" for specific bulk History
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID         | CITY |
      | BS33333333_6814 |      |
    Then Click on User Search button on User Search Page
    Then Verify colour of the disabled user id is "blurBack"

  @13593
  Scenario: TC_13593_Id_Deactivate
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
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       4361 | BS43619612 | cirall              | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Check lock on User Creation Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    When Click on "Bulk" Menu, "ID Unlock" Link on Admin Home Page
    Then Read "TC_13593_Id_Deactivate.xlsx" Workbook
    Then Set Runtime Data "RuntimeCreatedAdminUserId" in Row No "3" and Column No "1" for Sheet "Sheet1"
    Then Save "TC_13593_Id_Deactivate.xlsx" Workbook
    When Click on "Bulk" Menu, "ID Deactivate" Link on Admin Home Page
    Then Upload "TC_13593_Id_Deactivate.xlsx" File in Bulk upload for "Bulk ID Deactivate operation"
    Then Click on Submit button for "Bulk ID Deactivate operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File process with error" PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13593_Id_Deactivate.xlsx" for specific bulk History
    Then Read error message from "TC_13593_Id_Deactivate.xlsx" excel as "Success" in Row "2" and column "2"
    When Click on "Search" Menu, "User" Link on Admin Home Page
    Then Fill details in User Search Page
      | USER ID | CITY |
      | dynamic |      |
    Then Click on User Search button on User Search Page
    Then Verify Enabled-Disabled Status  on user search Result page : "disabled"
    Then Verify colour of the disabled user id is "blurBack"

  @13548
  Scenario: TC_13548_ID_Unlock
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
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       4361 | BS43619612 | cirall              | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Check lock on User Creation Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    When Click on "Bulk" Menu, "ID Unlock" Link on Admin Home Page
    Then Read "TC_13548_ID_Unlock.xlsx" Workbook
    Then Set Runtime Data "RuntimeCreatedAdminUserId" in Row No "3" and Column No "1" for Sheet "Sheet1"
    Then Save "TC_13548_ID_Unlock.xlsx" Workbook
    Then Upload "TC_13548_ID_Unlock.xlsx" File in Bulk upload for "Bulk ID Unlock operation"
    Then Click on Submit button for "Bulk ID Unlock operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File process with error" PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13548_ID_Unlock.xlsx" for specific bulk History
    Then Read error message from "TC_13548_ID_Unlock.xlsx" excel as "Success" in Row "2" and column "2"

  Scenario: TC_13551_ID_Unlock
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
      When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME  | ADDRESS1   | ADDRESS2      | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB             | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE       | CITY   | EMAIL   | USERID   |
      | Shwetha   | Talapanty | Mumbai@123 | Ghatkopar@234 |  400078 | 1234567890 | 1245678960 | BS - State Bank Group |       4361 | BS43619612 | cirall              | Maharashtra | MUMBAI | dynamic | dynamic5 |
    Then Click generate password button on "User Creation" Page
    Then Check lock on User Creation Page
    Then Fetch the value of password generated on User creation page
    Then Deselect Checkbox Force to change password in user search page
    Then Click save button on User Creation Page
    Then Click "OK" button for "Are you sure to submit the form for new user creation?" PopUp
    Then Capture User Code that is created successfully on User Admin page
    Then Click "OK" button for "User added successfully!" PopUp
    When Click on "Bulk" Menu, "ID Unlock" Link on Admin Home Page
    Then Read "TC_13551_ID_Unlock.xlsx" Workbook
    Then Set Runtime Data "RuntimeCreatedAdminUserId" in Row No "3" and Column No "1" for Sheet "Sheet1"
    Then Save "TC_13551_ID_Unlock.xlsx" Workbook
    When Click on "Bulk" Menu, "ID Unlock" Link on Admin Home Page
    Then Upload "TC_13551_ID_Unlock.xlsx" File in Bulk upload for "Bulk ID Unlock operation"
    Then Click on Submit button for "Bulk ID Unlock operation"
    Then Click "OK" button for "Are you sure to upload the file for bulk opearation?" PopUp
    Then Click "OK" button for "File process with error" PopUp
    When Click on "Bulk" Menu, "History" Link on Admin Home Page
    Then Click Download option for "TC_13551_ID_Unlock.xlsx" for specific bulk History
    Then Read error message from "TC_13551_ID_Unlock.xlsx" excel as "Success" in Row "2" and column "2"
    Then Read error message from "TC_13551_ID_Unlock.xlsx" excel as "Failed" in Row "3" and column "2"

  Scenario: TC_13555_ID_Unlock
    When Click on "Bulk" Menu, "ID Unlock" Link on Admin Home Page
    Then Upload "TC_13555_Id_Unlock.txt" File in Bulk upload for "Bulk ID Unlock operation"
    Then Click "OK" button for "You have uploaded file(s) that are not supported, only XLSX is supported" PopUp

  Scenario: TC_13571_Id_Activate
    When Click on "Bulk" Menu, "ID Activate" Link on Admin Home Page
    Then Upload "TC_13571_Id_Activate.txt" File in Bulk upload for "Bulk ID Activate operation"
    Then Click "OK" button for "You have uploaded file(s) that are not supported, only XLSX is supported" PopUp
