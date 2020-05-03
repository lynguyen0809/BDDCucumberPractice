package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.cucumber.datatable.DataTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.FETour;
import pages.FEHome;
import pages.FELogin;


public class FETourStep {
    FETour tours = null;
    FEHome home = new FEHome();
    FELogin login = new FELogin();

    public FETourStep() {
        tours = new FETour();
    }
    private Logger log = LogManager.getLogger(FELoginStep.class);

    @Given("User on the Front-End Home page")
    public void userOnTheFrontEndHomePage(DataTable userData) {
        login.landingHomePage();
    }

    @And("User on the Front-End Tour Listing page")
    public void userOnTheFrontEndTourListingPage() {
        home.navigateToTourListing();
        home.verifyTourListingPage();
    }

    @When("User search tour with tourType is {string} and starGrade is {string} and priceFrom is {int} and priceTo is {int}")
    public void userSearchTour(String tourType, String starGrade, int priceFrom, int priceTo) {
        login.clearCookyBox();
        tours.fillSearchTourCriteria(tourType, starGrade, priceFrom, priceTo);
    }

    @Then("User should see the result with appropriate selected filters")
    public void userShouldSeeTheResultWithAppropriateSelectedFilters() {
    }


}
