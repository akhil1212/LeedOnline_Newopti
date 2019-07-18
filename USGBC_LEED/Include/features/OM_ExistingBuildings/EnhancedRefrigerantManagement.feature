#Feature: Entering data to Enhanced Refrigerant Management
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Entering data to Enhanced Refrigerant Management - LEED v4.1 O+M: EB

  Scenario Outline: Filling Enhanced Refrigerant Management form for No Refrigerants or Low-Impact Refrigerants
    #Given User should be on frm Enhanced Refrigerant Management form
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
      | formname                                            |
      | Enhanced Refrigerant Management-noRefrigOrLowImpact |

  Scenario Outline: Filling Enhanced Refrigerant Management form for Calculation of Refrigerant Impact
    #Given User should be on frm Enhanced Refrigerant Management form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User fills the table <tableName> with data <testData> isAddRow <isAddRow>
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                              | tableName                                             | testData                                      | isAddRow |
      | Enhanced Refrigerant Management-calcRefrigerantImpact | Table: Mechanical Cooling and Refrigeration Equipment | TD_MechanicalCoolingandRefrigerationEquipment | Yes      |
