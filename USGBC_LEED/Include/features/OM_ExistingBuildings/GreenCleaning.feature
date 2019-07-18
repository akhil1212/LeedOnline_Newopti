#Feature: Entering data to Green Cleaning form
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------

Feature: Entering data to Green Cleaning form - LEED v4.1 O+M: EB

  Scenario Outline: Filling Green Cleaning form for Custodial effectiveness assessment
    #Given User should be on frm Green Cleaning form
   Given User should be on form <formname>
    When User will select the Radio Button
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User enters data to text box with number
    And User sets the date field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                   |
      | Green Cleaning-CustodialEffectivenessAssessment |
      
      
      
      Scenario Outline: Filling Green Cleaning form for EntrywaySystems
    #Given User should be on frm Green Cleaning form
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
      | formname                                   |
      | Green Cleaning-EntrywaySystems |
      
      
      
     Scenario Outline: Filling Green Cleaning form for PoweredCleaningEquipment
    #Given User should be on frm Green Cleaning form
   Given User should be on form <formname>
    When User will select the Radio Button
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
      | Green Cleaning-PoweredCleaningEquipment | 
      
    
    Scenario Outline: Filling Green Cleaning form for CleaningProductsAndMaterials
    #Given User should be on frm Green Cleaning form
   Given User should be on form <formname>
    When User will select the Radio Button
    And User uploads files to Add file button
    And User enters data to text box with number
    And User enters data to text box
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                   |
      | Green Cleaning-CleaningProductsAndMaterials | 
      
      
        
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      