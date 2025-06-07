package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class GF extends Setup {
    public GF(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) {
        driver.get("https://qa.graphicsflow.com/");
        implicitWaitMethod();
        driver.findElement(By.id("email")).sendKeys("naveenkumar.m@inksoft.com");
        driver.findElement(By.id("passwordInput")).sendKeys("Naveen@123");
        driver.findElement(By.id("signInButton")).click();
        implicitWaitMethod();

        cssElementToBeVisible("#nestedFiltersButton");
        cssClick("#nestedFiltersButton");
        cssElementToBeVisible("#categoryTrigger");
        cssClick("#categoryTrigger");


        List<WebElement> webElementListOfCategory = driver.findElements(By.xpath("(//gf-shady-scroller)[2]//span[@class='stock-art-category-name']"));
        int countOfCategory = webElementListOfCategory.size();

        Map<String, Integer> map = new HashMap<>();

        for (WebElement element : webElementListOfCategory) {
            element.click();
            List<WebElement> sub = driver.findElements(By.xpath("(//div[contains(@class,'second-level')]//div[@class='p-y-1'])[2]/mat-checkbox//label"));

            for (WebElement subElement : sub) {
                String subCategory = subElement.getText().trim().toLowerCase();
                map.put(subCategory, map.getOrDefault(subCategory, 0) + 1);
            }
        }
        System.out.println(map);
        int duplicationCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicationCount++;
                System.out.println(entry.getKey());
            }
        }
        System.out.println(duplicationCount);
        browserCloseAndQuit();

    }
}
