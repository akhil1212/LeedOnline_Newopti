#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 													                                                     Reviewer    :
# Date   : 											                                                                     Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description: Login to USGBC Leed Online Page with the credentials
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Login to USGBC Leed Online Page

  #Scenario-1
  @SmokeTest
  Scenario: User will login to leed online and navigate to credit page
    Given User has to navigate to leed online home page
    And User enters the username automationbdd9@gmail.com and password initpass
    And User has to accept end user license agreement
    When User clicks on LOG IN button
    Then User clicks on Project
    And User navigates to the credits page of the project
