package Utlities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverExecution {

    private WebDriver driver;


    @BeforeMethod
    public void initializeDriver() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public WebDriver getDriver() {
        return driver;
    }


    @AfterMethod
    public void teardown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
