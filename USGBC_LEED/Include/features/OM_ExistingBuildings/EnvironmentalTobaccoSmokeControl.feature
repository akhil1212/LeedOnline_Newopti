#Feature: Entering data to Environmental Tobacco Smoke Control form
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Entering data to Environmental Tobacco Smoke Control form - LEED v4.1 O+M: EB

  Scenario Outline: Filling Environmental Tobacco Smoke Control-NoSmoking form for Economic Analysis
    Given User should be on form <formname>
    And User checks the checkbox option
    When User will select the Radio Button
    When User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                      |
      | Environmental Tobacco Smoke Control-NoSmoking |

  Scenario Outline: Filling Environmental Tobacco Smoke Control-CompartmentalizationSmokeAreas form for Economic Analysis
    Given User should be on form <formname>
    And User checks the checkbox option
    When User will select the Radio Button
    And User uploads files to Add file button
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                                           |
      | Environmental Tobacco Smoke Control-CompartmentalizationSmokeAreas |
