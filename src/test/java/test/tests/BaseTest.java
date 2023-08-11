package test.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.pages.FormPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    FormPage formPage;


    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        formPage = new FormPage(driver);

    }
//    @AfterMethod(alwaysRun = true)
//    public void tearDown(){
//        driver.quit();
//    }
}
