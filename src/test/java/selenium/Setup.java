package selenium;


import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.time.Duration;

public class Setup extends DriverClass {


    public Setup(WebDriver driver) {

        super(driver);
    }

    public static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

    public static void main(String[] args) {

        try {

            driver.get("https://www.flipkart.com/");
            implicitWaitMethod();
            System.out.println("Testing done");
            screenshot(driver);

            browserCloseAndQuit();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//Implicit Wait

public static void implicitWaitMethod(){

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public static void elementToBeVisible(String xpathValue){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpathValue))));
    }

    public static void elementToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void cssElementToBeVisible(String cssValue){

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(cssValue))));

    }



    public static void fluentWaitMethod(){
//        FluentWait fluentWait = new FluentWait(driver);
//        Wait fluentWait = new FluentWait(driver);
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));



    }

    public static void screenshot(WebDriver driver){

        try {

        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File screenshotImg = screenshot.getScreenshotAs(OutputType.FILE);
        File file = new File("src/main/ScreenshotImages/screenshotImage.png");
        FileUtils.copyFile(screenshotImg,file);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void cssClick(String cssElement){
        try {
            Thread.sleep(1500);
            cssElementToBeVisible(cssElement);
            driver.findElement(By.cssSelector(cssElement)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void click(String element){
        try {
            Thread.sleep(1500);
            elementToBeVisible(element);
            driver.findElement(By.xpath(element)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void assignValueCSS(String cssValue,String strValue){
        driver.findElement(By.cssSelector(cssValue)).sendKeys(strValue);
    }

    public static void assignValue(String XPathValue,String strValue){
        driver.findElement(By.xpath(XPathValue)).sendKeys(strValue);
    }


}

