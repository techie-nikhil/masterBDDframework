@Enquiry
Feature: Enquiry Login Feature File
@ResourceName_Nikhil @Test @Abhishek @Shwetha
Scenario: TC_ 14312_CIR/ISCAN_Enquiry
  When Navigate To Specific Portal : "Enquiry"
  And Verify title of Enquiry Login Page
  Then Login to Enquiry Using Following Credentials :
      | USERNAME        | PASSWORD  |
      | BS33333333_02150 | Shweta@123 |
  Then Click on Login button Enquiry Login Page  
  Then Verify the error message enquiry for login page: "Error - The user ID and password combination entered seems to be incorrect or expired.Kindly enter the correct credentials or use the unlock/reset option.For further assistance, please contact TUCIBIL ID Support Management Team"

#
  #Scenario: TC_ 14311/10364_CIR/ISCAN_Enquiry
  #When Navigate To Specific Portal : "Enquiry"
  #And Verify title of Enquiry Login Page
  #Then Verify Whether Disclaimer message is not present on the enquiry loginpage
  #Then Login to Enquiry Using Following Credentials :
      #| USERNAME        | PASSWORD  |
      #| BS33333333_0250 | Shweta@21 |
  #Then Click on Login button Enquiry Login Page
  #Then Verify successful login message on enquiry module: "Welcome BS33333333_0250,"