package elements.controller;

import org.openqa.selenium.WebElement;

public interface ISlider extends IElement {

    void moveSlider(WebElement e, Integer value);

}