package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

public class DriverClass {


    public static WebDriver driver;

    public DriverClass(WebDriver driver) {
        this.driver = driver;
    }

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false); // Disable credential service
        prefs.put("profile.password_manager_enabled", false); // Disable password manager
        prefs.put("profile.password_manager_leak_detection", false);  // Disables leak detection
        chromeOptions.setExperimentalOption("prefs", prefs);
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }

    public static void browserCloseAndQuit() {
        try {
            driver.close();
            driver.quit();

            System.out.println("****** Browser Close And Quit ******");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
