#Feature: Entering data to Purchasing form
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------

Feature: Entering data to Purchasing form - LEED v4.1 O+M: EB

  Scenario Outline: Filling Purchasing form for Ongoing consumables
    #Given User should be on frm Integrated Pest Management form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User enters data to text box with number
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                      |
      | Purchasing-ongoingConsumables |

  Scenario Outline: Filling Purchasing form for Ongoing consumables
    #Given User should be on frm Integrated Pest Management form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User enters data to text box with number
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                             |
      | Purchasing-buildingProductsMaterials |

  Scenario Outline: Filling Purchasing form for Ongoing consumables
    #Given User should be on frm Integrated Pest Management form
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
      | formname                      |
      | Purchasing-electricEquipments |
