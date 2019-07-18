#Feature: Entering data to Minimum Indoor Air Quality
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------

Feature: Entering data to Minimum Indoor Air Quality - LEED v4.1 O+M: EB

  Scenario Outline: Filling Minimum Indoor Air Quality
    
    Given User should be on form <formname>
    When User uploads files to Add file button
    And User Enters data to Narrative field
    And User checks the checkbox option
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                   | 
      | Minimum Indoor Air Quality | 
