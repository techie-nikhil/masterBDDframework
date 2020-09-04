@Admin
Feature: Login Feature File

  @Smoke_Admin_Sprint_2 @severity=normal
  Scenario: TC_13301&13303&13305_LoginLogout_UserAdmin
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Login to User Admin Using Following Credentials :
      | USERNAME      | PASSWORD   |
      | ZZ66666666_01 | swsq@hkKd6 |
    Then Verify password expiry message on Admin Home Page
    Then Verify successful login message "Welcome ZZ66666666_01," on Admin Home Page
    Then Click on logout button on Admin Home Page

  #For this scenario you need three types of user ids locked (ZZ00001111_00012),disabled (ZZ21256500_21),archived (ZZ99991111_00231)
  @P1_High_Admin_Sprint_2 @Sprint2 @severity=critical
  Scenario Outline: TC_13309&13310&13311_LoginLogout_UserAdmin
    When Navigate To Specific Portal : "Admin"
    And Verify title of User Admin Page
    Then Fill "<USERNAME>" and "<PASSWORD>" on Admin Login Page
    Then Click Login button on Admin Login Page
    Then Verify the "<ERRORMESSAGE>" on Admin Login Page

    Examples: 
      | USERNAME         | PASSWORD  | ERRORMESSAGE                                                                                                                                                                                                                        |
      | ZZ00001111_00012 | e@hTv7pr  | Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team |
      | ZZ21256500_21    | 7d@xrqwdV | Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team |
      | ZZ99991111_00231 | A4wnnq@ng | Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team |
