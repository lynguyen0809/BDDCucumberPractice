$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/FETour.feature");
formatter.feature({
  "name": "FrontEnd - Tour",
  "description": "  As a user, I want to search tour(s) with search filters such as Star Grade, Price Range and Tour Type",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FrontEndTours"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the Front-End Home page",
  "rows": [
    {
      "cells": [
        "user@phptravels.com",
        "demouser"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "FETourStep.userOnTheFrontEndHomePage(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "FE001-Login - Search Tour successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FrontEndTours"
    },
    {
      "name": "@FETours"
    }
  ]
});
formatter.step({
  "name": "User on the Front-End Tour Listing page",
  "keyword": "And "
});
formatter.match({
  "location": "FETourStep.userOnTheFrontEndTourListingPage()"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Must provide a location for a move action.\r\n\tat org.openqa.selenium.interactions.MoveMouseAction.\u003cinit\u003e(MoveMouseAction.java:38)\r\n\tat org.openqa.selenium.interactions.Actions.moveToElement(Actions.java:387)\r\n\tat elements.controllerImpl.Element.hoverAndClick(Element.java:35)\r\n\tat pages.FEHome.navigateToTourListing(FEHome.java:21)\r\n\tat stepDefs.FETourStep.userOnTheFrontEndTourListingPage(FETourStep.java:33)\r\n\tat ✽.User on the Front-End Tour Listing page(src/test/resources/features/FETour.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User search tour with tourType is \"Holidays\" and starGrade is \"3\" and priceFrom is 30 and priceTo is 70",
  "keyword": "When "
});
formatter.match({
  "location": "FETourStep.userSearchTour(String,String,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the result with appropriate selected filters",
  "keyword": "Then "
});
formatter.match({
  "location": "FETourStep.userShouldSeeTheResultWithAppropriateSelectedFilters()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});