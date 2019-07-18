#Feature: Entering data to Fundamental Refrigerant Management form
#---------------------------------------------------------------------------------------------------------------------------------
# Authors :                                                                                                                                                          Reviewer    :
# Date   :                                                                                                                                                                   Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description:
#---------------------------------------------------------------------------------------------------------------------------------

Feature: Entering data to Fundamental Refrigerant Management form - LEED v4.1 O+M: EB

  Scenario Outline: Filling Fundamental Refrigerant Management form for Economic Analysis
    #Given User should be on frm Fundamental Refrigerant Management form
    Given User should be on form <formname>
    When User will select the Radio Button
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User enters data to text box
    And User fills the table <tableName> with data <testData> isAddRow <isAddRow>
    And User fills the table <tableName1> with data <testData1> isAddRow <isAddRow1>
    And User checks the checkbox option
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                              | tableName                                             | testData                      | isAddRow | tableName1            | testData1        | isAddRow1 |
      | Fundamental Refrigerant Management-economicAnalysis!R | Table: Mechanical Cooling and Refrigeration Equipment | TD_FundamentalRefrigerantMgmt | Yes      | Table: Simple Payback | TD_SimplePayback | No        |

  Scenario Outline: Filling Fundamental Refrigerant Management form for Comprehensive Phase-Out Plan
    Given User should be on form <formname>
    When User will select the Radio Button
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User fills the table <tableName> with data <testData> isAddRow <isAddRow>
    And User checks the checkbox option
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                                   | tableName                                             | testData                      | isAddRow |
      | Fundamental Refrigerant Management-comprehensivePhaseOut!R | Table: Mechanical Cooling and Refrigeration Equipment | TD_FundamentalRefrigerantMgmt | Yes      |

  Scenario Outline: Filling Fundamental Refrigerant Management form for Comprehensive Phase-Out Plan
    Given User should be on form <formname>
    And User checks the checkbox option
    And User uploads files to Add file button
    And User Enters data to Narrative field
    And User downloads the uploaded files
    And User deletes the uploaded files
    And User clicks on Save button
    Then User can able to see the form got saved
    And User clicks the Complete icon to set status to Ready for Review

    Examples: 
      | formname                                               |
      | Fundamental Refrigerant Management-noCfcRefrigerants!C |
