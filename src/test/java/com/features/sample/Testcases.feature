@Admin
Feature: SampleFeatureFileName

  Background: 
    When Navigate To Specific Portal : "web.url"

  Scenario: TC_001
    Then Enter "Facebook" in search input field
    Then Click on Google Search button
    Then Click "Facebook - Log In or Sign Up" link on Google Search Page
    Then Verify Facebook login Page Displayed

  @TC_002
  Scenario: TC_002
    Then Click on "Gmail" Link
    Then Enter Following User name and Password in Login Page
      | USER ID        | Password |
      | abcd@gmail.com |          |
    Then Click Sign In button on Gmail Sign In Page
