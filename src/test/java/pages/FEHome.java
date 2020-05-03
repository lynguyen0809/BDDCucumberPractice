package pages;

import bases.BasePage;
import assertion.Asserts;
import elements.controllerImpl.Button;
import elements.controllerImpl.Element;
import elements.controllerImpl.TextBox;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import  static utilities.TestUtils.*;

public class FEHome extends BasePage {
    private Logger log = LogManager.getLogger(FEHome.class);

    private final By lnkTours = By.xpath("//*[contains(text(), 'Tours')]/parent::a");
    private final By btnSearchTours = By.xpath("//*[@id='tours']//button[contains(text(), 'Search')]");

    public void navigateToTourListing() {
        getElement(Element.class, lnkTours).hoverAndClick();
        getElement(Button.class, btnSearchTours).isPresent();
        getElement(Button.class, btnSearchTours).clickAndWait();
    }

    public void verifyTourListingPage() {

        String currentURL = getCurrentURL().substring(0,39);

        Asserts.verifyEquals(getTitle(), "Search Results");
        Asserts.verifyEquals(currentURL, "https://www.phptravels.net/tours/search");

        Asserts.verifyAll();
    }
}
