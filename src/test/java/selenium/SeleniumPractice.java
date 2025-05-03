package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class SeleniumPractice extends Setup{

    public SeleniumPractice(WebDriver driver){

        super(driver);
    }

    // Action Class
    public void demo() {
        Actions actions = new Actions(driver);
        actions.click();
        actions.perform();
        actions.build().perform();

    }

    public static void main(String[] args) {
    }
}

