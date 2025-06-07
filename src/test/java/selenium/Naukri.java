package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Naukri extends Setup {

    public Naukri(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    static ArrayList<String> keySkillsList = new ArrayList<>();
    @FindBy(xpath = "//a[@id='login_Layer']")
    protected WebElement loginLayer;

    public static void main(String[] args) {
        Naukri object = new Naukri(driver);
        Assert.assertTrue(object.login("naveenkumar153@outlook.com", "MSNks@1598"));
        Assert.assertTrue(navigateToProfileDetailView());
        Assert.assertTrue(extractKeySkills());
        Assert.assertTrue(removeKeySkills());
        Assert.assertTrue(updateKeySkills(keySkillsList));
        browserCloseAndQuit();
    }

    public boolean login(String userName, String password) {
        boolean blResult = false;
        try {
            driver.get("https://www.naukri.com/");
            implicitWaitMethod();
            elementToBeVisible(loginLayer);
            driver.findElement(By.id("login_Layer")).click();
            elementToBeVisible("//input[@placeholder='Enter your active Email ID / Username']");
            driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(userName);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(password);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            elementToBeVisible("//img[@alt='naukri user profile img']");
            return driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean navigateToProfileDetailView() {
        boolean blResult = false;
        try {
            elementToBeVisible("//div[@class='view-profile-wrapper']/a");
            driver.findElement(By.xpath("//div[@class='view-profile-wrapper']/a")).click();
            implicitWaitMethod();
            driver.getCurrentUrl().equals("https://www.naukri.com/mnjuser/profile");
            return driver.findElement(By.cssSelector(".user-pc-progress.high")).isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean extractKeySkills() {
        boolean blResult = false;
        try {
            elementToBeVisible("//div[@id='lazyKeySkills']");

            List<WebElement> keySkills = driver.findElements(By.cssSelector("#lazyKeySkills span.chip"));

            for (int i = 1; i < keySkills.size() + 1; i++) {
                keySkillsList.add(driver.findElement(By.xpath("((//div[@id='lazyKeySkills']//div)[4]//span)[" + i + "]")).getText());
            }
            System.out.println("KeySkillsList : " + keySkillsList);

            return keySkillsList.size() == keySkills.size();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean removeKeySkills() {
        boolean blResult = false;
        try {
            click("//div[@id='lazyKeySkills']//span[@class='edit icon']");
            elementToBeVisible("//form[@name='keySkillsForm']");
            cssElementToBeVisible(".material-icons.close");
            List<WebElement> keySkillsCloseBtn = driver.findElements(By.cssSelector(".material-icons.close"));

            for (int i = 0; i < keySkillsCloseBtn.size(); i++) {
                cssClick(".material-icons.close");
            }


            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public static boolean updateKeySkills(ArrayList<String> keySkillsList) {
        boolean blResult = false;
        try {
            cssElementToBeVisible("#keySkillSugg");

            for (String strValue : keySkillsList) {
                cssClick("#keySkillSugg");
                assignValueCSS("#keySkillSugg", strValue);
                System.out.println("//div[@id='sugDrp_keySkillSugg']//li/div[text()='" + strValue + "']");
                click("//div[@id='sugDrp_keySkillSugg']//li/div[text()='" + strValue + "']");
            }

            List<WebElement> keySkillsCloseBtn = driver.findElements(By.cssSelector(".material-icons.close"));
            if (keySkillsCloseBtn.size() == keySkillsList.size()) {
                cssClick("#saveKeySkills");
                screenshot(driver);
                cssElementToBeVisible(".msgBox.success i");
                driver.findElement(By.cssSelector(".mod-date")).getText().equals("Profile last updated - Today");
                System.out.println("<==== Skills Updated Successfully ====>");
            }
            return keySkillsList.size() == driver.findElements(By.xpath("((//div[@id='lazyKeySkills']//div)[4]//span)")).size();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }


}
