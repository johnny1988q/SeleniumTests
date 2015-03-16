package main.java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ionuta on 3/16/15.
 */
public abstract class BaseTest {

    protected static WebDriver driver;


    @BeforeClass
    public static void openBrowser() {
       if (driver == null){
           driver = new FirefoxDriver();
       }

    }
    @AfterClass
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected BasePage  loadBasePage (){
        driver.get("https://trylumiaphone.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return new BasePage(driver);



    }
}
