#Feature: Entering data to Light Pollution Reduction Form
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------

Feature: Entering data to Light Pollution Reduction Form - LEED v4.1 O+M: EB

  Scenario Outline: Filling Light Pollution Reduction form for Fixture Shielding
    Given User should be on form <formname>
    When User will select the Radio Button
    And User checks the checkbox option
    And User uploads files to Add file button
    And User enters data to text box with number
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                   |
      | Light Pollution Reduction-fixtureShielding |

  Scenario Outline: Filling Light Pollution Reduction form for Perimeter Measurements
    Given User should be on form <formname>
    When User will select the Radio Button
    And User fills the table <tableName> with data <testData> isAddRow <isAddRow>
    And User enters data to text box with number
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                        | tableName                         | testData                    | isAddRow |
      | Light Pollution Reduction-perimeterMeasurements | Table: Site lighting measurements | TD_SiteLightingMeasurements | Yes      |
