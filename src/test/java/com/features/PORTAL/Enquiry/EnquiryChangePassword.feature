Feature: Enquiry Change Password Feature

  Background: 
    When Navigate To Specific Portal : "Enquiry"
    And Verify title of Enquiry Login Page
    Then Login to Enquiry Using Following Credentials :
      | USERNAME        | PASSWORD  |
      | BS33333333_0250 | Shweta@21 |
   Then Click on Login button Enquiry Login Page 

  @Test
  Scenario: TC_ 14315/14316_CIR/ISCAN_Enquiry
    When Click Change Password Link in Enquiry Login Page
    Then Fill Following Details in Enquiry Change Password Page
      | CURRENT_PASSWORD | NEW_PASSWORD | CONFIRM_PASSWORD |
      | Shweta@21        | $$$$$$$&<>'" | $$$$$$$&<>'"     |
    Then Verify Error Message For "New Password" as : "Password should be of at least 8 characters in length, should contain an uppercase character, a lowercase character, a numeric digit and a special character (,.:/@`~!$%{}\^*+=?()#_;[]-)" on enquiry change password page
    Then Verify Error Message For "Confirm Password" as : "Password should be of at least 8 characters in length, should contain an uppercase character, a lowercase character, a numeric digit and a special character (,.:/@`~!$%{}\^*+=?()#_;[]-)" on enquiry change password page
    Then Verify disclaimer message on change password page
