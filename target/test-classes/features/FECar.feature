@FrontEndCar
Feature: FrontEnd - Car

  As a user, I want to search car(s) with search filters such as Star Grade, Price Range, Car Type and AirPort Pickup

  Background:
    Given User on the Front-End Home page
      |user@phptravels.com|demouser|
#-------------------------------------------------------------------------------
  @FECar
  Scenario: FE001-Login - Search Car successfully
    And User on the Front-End Car Listing page with Pick up Location is "Malaysia"
    When User search car(s) with tourType is "Holidays" and starGrade is "4" and priceFrom is 30 and priceTo is 70
    Then  User should see the result with appropriate selected filters

