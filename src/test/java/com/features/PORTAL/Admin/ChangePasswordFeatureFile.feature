@Admin
Feature: Change Password Feature File

  Background: 
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD |
      | ZZ44444444_27 | c@aBk4Qe |

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13516&13509&13740_ChangePassword
    When Click Change Password Link in Login Page
    Then Fill Follwing Details in Change Password Page
      | CURRENT_PASSWORD | NEW_PASSWORD | CONFIRM_PASSWORD |
      | 5u@dFdws         | $$$$$$$&<>'" | $$$$$$$&<>'"     |
    Then Verify Error Message For "New Password" as : "Password should be of at least 8 characters in length, should contain an uppercase character, a lowercase character, a numeric digit and a special character (,.:/@`~!$%{}\^*+=?()#_;[]-)"

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13515_ChangePassword
    When Click Logout Button In Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD |
      | ZZ11111111_08 | 5u@dFdwq |
    Then Verify Error Message on Admin Password Change Page as : "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"

  @P1_High_Admin_Sprint_2 @Abhishek3 @severity=critical
  Scenario: TC_13523_ChangePassword
    When Click on "Create" Menu, "User" Link on Admin Home Page
    Then Fill Following Details in User Creation Page
      | FIRSTNAME | LASTNAME | ADDRESS1 | ADDRESS2 | PINCODE | TELEPHONE  | FAXNUMBER  | MEMBERKOB        | MEMBERBASE | MEMBERCODE | PRODUCTSUBSCRIPTION | STATE     | CITY              | EMAIL          | USERID |
      | Ashok     | Kumar    | Bokaro   | Bokaro   |  820001 | 1234567890 | 1245678960 | ZZ - Cibil Users |       1000 | ZZ10000001 | olm                 | Jharkhand | BOKARO STEEL CITY | amit@gmail.com |     27 |
    Then Verify Error Message For "Email Address" as : "Email-id already exists for BS33333333_27. Please enter unique Email-id."

  @P1_High_Admin_Sprint_2 @Sprint2 @severity=critical
  Scenario: TC_13514_ChangePassword
    When Click Logout Button In Admin Home Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD |
      | ZZ11111111_08 | 5u@dFdwq |
    Then Verify Error Message on Admin Password Change Page as : "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD |
      | ZZ11111111_08 | 5u@dFdwq |
    Then Verify Error Message on Admin Password Change Page as : "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"

  #18-07-2019 Saurabh
  #@P1_High_Admin_Sprint_2 @severity=critical
  #Scenario: TC_13510_ChangePassword
    #When Click Change Password Link in Login Page
    #Then Fill Follwing Details in Change Password Page
      #| CURRENT_PASSWORD | NEW_PASSWORD | CONFIRM_PASSWORD |
      #| 5u@dFopk         | 5u@dFdws     | 5u@dFdws         |
    #Then Click Change Button on Change Password Page
    #Then Verify Error Message on Admin Password Change Page as : "Error - Cannot login; invalid credentials entered. Please login using the correct credentials."

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13508_ChangePassword
    When Click Change Password Link in Login Page
    Then Fill Follwing Details in Change Password Page
      | CURRENT_PASSWORD | NEW_PASSWORD | CONFIRM_PASSWORD |
      | 5u@dFdws         | 5u@dFoip     | 5u@dFoip         |
    Then Click Reset Button on Change Password Page

  #25-07-2019 Saurabh
  @P1_High_Admin_Sprint_2 @Saurabh27 @severity=critical
  Scenario: TC_13513_ChangePassword
    When Click Change Password Link in Login Page
    Then Fill Follwing Details in Change Password Page
      | CURRENT_PASSWORD | NEW_PASSWORD | CONFIRM_PASSWORD |
      | 5u@dFdws         | 5u@dFdws     | 5u@dFdws         |
    Then Click Change Button on Change Password Page
    Then Verify Error Message on Admin Password Change Page as : "Error - Current and New password fields cannot be same"

  @P1_High_Admin_Sprint_2 @severity=critical
  Scenario: TC_13519&13511_ChangePassword
    When Click Change Password Link in Login Page
    Then Fill Follwing Details in Change Password Page
      | CURRENT_PASSWORD | NEW_PASSWORD | CONFIRM_PASSWORD |
      | 5u@dFdws         | 5u@dFopk     | 5u@dFopl         |
    Then Click Change Button on Change Password Page
    Then Verify Error Message on Admin Password Change Page as : "Error - New and Confirm password fields do not match"
