package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DriverClass {


    public static WebDriver driver;

    public DriverClass(WebDriver driver){

        this.driver=driver;
    }

    static {
         driver = new ChromeDriver();
         driver.manage().window().maximize();

    }

    public static void browserCloseAndQuit(){
        try {
        driver.close();
        driver.quit();

            System.out.println("****** Browser Close And Quit ******");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
