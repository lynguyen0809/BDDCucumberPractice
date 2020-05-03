package pages;

import bases.BasePage;
import elements.controllerImpl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import  static utilities.TestUtils.*;

public class FETour extends BasePage {

    private Logger log = LogManager.getLogger(FETour.class);

    private final By btnSearchTours = By.xpath(".//div[contains(@class, 'form-group')]/button[normalize-space(.) ='Search']");
    private final By ddlTourType = By.id("tourtype");
    private final String rdbStartGrade = "//label[count(.//i[contains(@class,'fa-star voted')]) = %]/preceding-sibling::div";
    private final String rdbTourType = "//label[contains(text(), '%')]/preceding-sibling::div";
    private final By sldPriceRange = By.xpath("//*[@class = 'slider-selection']");
    private final By sldPriceRangeFrom = By.xpath("//*[@class = 'slider-handle round'][1]");
    private final By sldPriceRangeTo = By.xpath("//*[@class = 'slider-handle round'][2]");

    public void fillSearchTourCriteria(String tourType, String starGrade, Integer priceFrom, Integer priceTo) {
        getElement(DropDownList.class, ddlTourType).selectByVisibleText(tourType);
        getElement(RadioButton.class, getXpath(rdbTourType,tourType)).select();
        getElement(RadioButton.class, getXpath(rdbStartGrade, starGrade)).select();
        WebElement sldPriceSlider = driver.findElement(By.xpath("//*[@class = 'slider-selection']"));
        getElement(Slider.class, sldPriceRange).moveSlider(sldPriceSlider, priceFrom);
        getElement(Slider.class, sldPriceRange).moveSlider(sldPriceSlider, priceTo);
        getElement(Button.class, btnSearchTours).clickAndWait();
    }


}
