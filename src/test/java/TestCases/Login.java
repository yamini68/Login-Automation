package TestCases;

import Utlities.DriverExecution;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;



public class Login extends DriverExecution {

    @Test(priority = 1)
    public void Acoount_Creation_With_Valid_Details(){

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(8, 12, true, true, true);
        WebDriver driver=getDriver();
        driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");

       WebElement SignUp_Text=driver.findElement(By.xpath("//a[contains(text(),'New to Germany Is Calling?')]"));
       SignUp_Text.click();

       WebElement Fisrt_Name=driver.findElement(By.xpath("//input[@id='first_name']"));
       Fisrt_Name.sendKeys(firstName);

       WebElement Email=driver.findElement(By.xpath("//input[@id='username']"));
       Email.sendKeys(email);

       WebElement passwordCreation=driver.findElement(By.xpath("//input[@id='password']"));
       passwordCreation.sendKeys(password);

       WebElement Signup_Button=driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
       Signup_Button.click();

    }

    @Test(priority = 2)
    public void Login_with_Valid_Details() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");
        WebElement Email=driver.findElement(By.xpath("//input[@id='username']"));
        Email.sendKeys("yaminianala99@gmail.com");

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("lee@123##");

        WebElement Login_Btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
        Login_Btn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        String actualTitle = driver.getTitle();



        String expectedTitle = "Upload your CV | Germany Is Calling";


        Assert.assertEquals(actualTitle, expectedTitle, "The page title does not match the expected value.");


    }

    @Test(priority = 3)
    public void Login_with_Invalid_Details (){
        WebDriver driver = getDriver();
        driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");

        Faker faker = new Faker();
        String invalidEmail = faker.internet().emailAddress();
        String invalidPassword = faker.internet().password(8, 12);

        WebElement Email=driver.findElement(By.xpath("//input[@id='username']"));
        Email.sendKeys(invalidEmail);

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(invalidPassword);

        WebElement Login_Btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
        Login_Btn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-danger'] ul li")));


        Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed for invalid login.");
        System.out.println(errorMessage.getText());


    }

@Test(priority = 4)
    public void Login_with_empty_fileds(){

    WebDriver driver = getDriver();
    driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");

    WebElement Login_Btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
    Login_Btn.click();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-danger']")));


    Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed for invalid login.");
    System.out.println(errorMessage.getText());
}

@Test(priority = 5)
    public void Login_with_Empty_Password(){

    WebDriver driver = getDriver();
    driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");
    WebElement Email=driver.findElement(By.xpath("//input[@id='username']"));
    Email.sendKeys("yaminianala99@gmail.com");


    WebElement Login_Btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
    Login_Btn.click();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-danger'] ul li")));


    Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed for invalid login.");
    System.out.println(errorMessage.getText());
}

}
