package elements.controllerImpl;

import drivers.Driver;
import elements.controller.ISlider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Slider extends Element implements ISlider {

    public Slider (WebElement element) {
        super(element);
    }

    public void moveSlider(WebElement slider, Integer value) {
        int width = slider.getSize().getWidth();
        WebDriver driver = Driver.getInstance().getDriver();
        Actions act = new Actions(driver);
        act.moveToElement(slider, ((width * value) / 100), 0).click();
        act.build().perform();
    }
}
