#Feature: Entering data to Grid Harmonization form
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------

Feature: Entering data to Grid Harmonization form - LEED v4.1 O+M: EB

  Scenario Outline: Filling Grid Harmonization form for Demand response program available and participation
    #Given User should be on frm Grid Harmonization form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User checks the checkbox option
    And User enters data to text box with number
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                 |
      | Grid Harmonization-demandResProgramAvail |

  Scenario Outline: Filling Grid Harmonization form for Demand response capable building
    #Given User should be on frm Grid Harmonization form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User checks the checkbox option
    And User enters data to text box with number
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                    |
      | Grid Harmonization-demandResCapableBuilding|

  Scenario Outline: Filling Grid Harmonization form for Permanent load shifting technologies
    #Given User should be on frm Grid Harmonization form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User checks the checkbox option
    And User enters data to text box with number
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                     |
      | Grid Harmonization-permLoadShiftTechnologies |
