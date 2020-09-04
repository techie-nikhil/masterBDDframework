@Abhishek0
Feature: CIBIL API Test

  Background: 
    Given I am requesting "BaseURICIBIL".

  Scenario: TC_31716_
    When I go to "/commReports/api" with JSON of following parmeters in "general_fields" object in the body
      | enquiry_amount | enquiry_purpose | enquiry_type | type_of_entity | class_of_activity  | date_of_registration | cmr_flag |
      |        2200000 | Cash credit     | New loan     | Public Limited | Growing of cereals | 31-DEC-2011          |        0 |
    And I am merging  another JSON object with above object with Header as "company_name".
      | enquiry_amount | name             |
      |        2200000 | MR SANDESH PATIL |
    And I am merging JSON array with key value pair with following details with Header as "address" into the Json Object with header "contact"
      | addressLine1                                             | city         | state      | pinCode | addressType       |
      | NO 1/21 SRI KRISHNA NIVAS, KATHRIGUPPA MARKET, JAYANAGAR | KANCHEEPURAM | TAMIL NADU |  600001 | registered office |
    And I am merging  another JSON object with above object with Header as "header".
      | version | product_type | user_id        | user_password | member_code | member_KOB | member_reference_number | report_type | output_format |
      |       1 | P4           | AR89898989_001 | Pa@12345      | AR89898989  | AR         |                      23 | CIR         |            04 |
    And I am merging  another JSON object with above object with Header as "id".
      | pan        | cin | crn | tin |
      | SBCPE6833F |     |     |     |
    And I am creating and saving another Json object as "AddressJSON"
      | addressType | addressLine1 | city | state | pinCode |
      |             |              |      |       |         |
    And I am creating and saving another Json array object as "telephoneJSONarray" with 4 keys for each object
      | telephoneType | telephone_num | contact_area | contact_prefix | telephoneType | telephone_num | contact_area | contact_prefix |
      |               |               |              |                |               |               |              |                |
    And I am merging another JSON array with key value and objects following details with Header as "director" into the Json Object with header "directors"
      | name | relation_type | gender | pan | uid | voter_id | passport_num | driving_licence_id | din | dob | address     | telephone          |
      |      |               |        |     |     |          |              |                    |     |     | AddressJSON | telephoneJSONarray |
    And I merging the above jsonobject with header as "request"
    Then I am sending the "POST" request.
    #And I am validating object "base.responseReport.reportIssuesVec.code" for int value "403".