#Feature: Entering data to Innovation form
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------

Feature: Entering data to Innovation form - LEED v4.1 O+M: EB

  Scenario Outline: Filling Innovation form for InnovationStrategy
    #Given User should be on frm Innovation form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
   # And User clicks the pdf icon and verifies
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                      |
      | Innovation-InnovationStrategy |

  Scenario Outline: Filling Innovation form for PilotCredit
    #Given User should be on frm Innovation form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User enters data to text box
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname               |
      | Innovation-PilotCredit |
