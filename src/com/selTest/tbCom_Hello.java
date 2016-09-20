package com.selTest;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import tools.Commands;


public class tbCom_Hello {


    public static void main(String[] args) throws Exception {

        System.out.println("RunStart");

        WebDriver driver;

        driver = Commands.init_Browser("chrome");
        System.out.println(driver);

        driver.get("http://localhost/wp-login.php");

        driver.findElement(By.id("user_login")).sendKeys("selenium");

        driver.findElement(By.id("user_pass")).sendKeys("toho");

        driver.findElement(By.id("rememberme")).click();

        driver.findElement(By.id("user_pass")).submit();


        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return(true);
            }
        });

        /**
         * mouseover and wait for dropdown from user image
         * Todo: "Abmelden" doesn't work
         */

/**
        WebElement meMenu = driver.findElement(By.cssSelector("img.avatar.avatar-26"));
        Actions action = new Actions(driver);
        action.moveToElement(meMenu).build().perform();
        driver.findElement(By.xpath("//ul[2]/li/div/ul/li[3]/a")).click();
**/


        driver.findElement(By.xpath("//li[3]/a/div[3]")).click();
        driver.findElement(By.xpath("//li[3]/ul/li[3]/a")).click();
        driver.findElement(By.id("title-prompt-text")).click();
        driver.findElement(By.id("title")).sendKeys("Testeintrag automatisch");
        driver.findElement(By.id("content-html")).click();
        driver.findElement(By.id("content")).sendKeys("Dies ist mein erster Text mit Selenium");

        /**
         * Button not available in this version
         */
/**
        // click on "Kontaktformular hinzufügen"
        driver.findElement(By.id("insert-jetpack-contact-form")).click();

        // switch to the next frame
        driver.switchTo().frame("TB_iframeContent");

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return(false);
            }
        });

        // select name field and enter text
        driver.findElement(By.id("fb-fieldname")).sendKeys("ToHo");

        System.out.println("leave Kontaktformular");

**/

        /**
         * switch back to recend frame
         * Todo: close the frame
         */


        //driver.switchTo().defaultContent();
        //Alert alert = driver.switchTo().alert();
        //click on "Dateien hinzufügen"
        //insert-media-button


        System.out.println("RunEnde");

        //driver.close();



    }


}