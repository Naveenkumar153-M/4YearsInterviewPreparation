package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowsHandling extends Setup {
    public WindowsHandling(WebDriver driver){
        super(driver);
    }


    public static void main(String[] args) {
        WebElement thirdWindow=driver.findElement(By.tagName("TITLE"));
        // String parentWindow=driver.getWindowHandle();
        Set<String> childWindow=driver.getWindowHandles();

        List<String> windowList= new ArrayList<>();
        for(String child:childWindow){
            windowList.add(child);
            driver.switchTo().window(child);
            if (driver.getTitle()=="Naveen"){
                break;
            }
    }
        driver.switchTo().window(windowList.get(3));
    }}


