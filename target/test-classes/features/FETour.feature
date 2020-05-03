@FrontEndTours
Feature: FrontEnd - Tour

  As a user, I want to search tour(s) with search filters such as Star Grade, Price Range and Tour Type

Background:
  Given User on the Front-End Home page
    |user@phptravels.com|demouser|
#-------------------------------------------------------------------------------
  @FETours
  Scenario: FE001-Login - Search Tour successfully
    And User on the Front-End Tour Listing page
    When User search tour with tourType is "Holidays" and starGrade is "3" and priceFrom is 30 and priceTo is 70
    Then  User should see the result with appropriate selected filters

