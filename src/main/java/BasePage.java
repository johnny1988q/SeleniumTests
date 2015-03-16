package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by ionuta on 3/16/15.
 */
public class BasePage {

    public WebDriver driver;

   BasePage(WebDriver driver) {
   this.driver = driver;

   }


   public WebElement find(By by) {
       return driver.findElement(by);
   }


       public boolean  assertElementIsPresent(By by) {
           WebElement element = find(by);
           return element != null;

       }

    public void waitFor (long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void turnOnImplicitlyWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void turnOffImplicitlyWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

    }

   public SummaryPage goToSummaryPage(By menuElement , By subMenuElement, long videoElapsedTime) {

       find(menuElement).click();
       find(subMenuElement).click();
       //milliseconds
       waitFor(videoElapsedTime);
       return new SummaryPage(driver);

    }







}
