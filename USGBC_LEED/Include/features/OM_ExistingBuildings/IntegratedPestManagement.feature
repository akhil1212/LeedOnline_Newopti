#Feature: Entering data to Integrated Pest Management form
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------

Feature: Entering data to Integrated Pest Management form - LEED v4.1 O+M: EB

  Scenario Outline: Filling Integrated Pest Management form for In-house IPM program
    #Given User should be on frm Integrated Pest Management form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                        |
      | Integrated Pest Management-InHouseIPM |

      
      
      Scenario Outline: Filling Integrated Pest Management form for Certified IPM service
    #Given User should be on frm Integrated Pest Management form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User uploads files to Add file button
    And User enters data to text box
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                        |
      | Integrated Pest Management-CertifiedIPMService |