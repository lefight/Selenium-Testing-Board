package com.selTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import tools.Commands;


public class tbCom_Hello {


    public static void main(String[] args) throws Exception {

        WebDriver driver;

        driver = Commands.init_Browser("firefox");
        System.out.println(driver);


        driver.get("http://www.t-hobein.de/login");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.findElement(By.id("user_login")).sendKeys("torsten@t-hobein.de");

        driver.findElement(By.id("user_pass")).sendKeys("S1rT0by_wo");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.findElement(By.id("rememberme")).click();

        boolean erg = driver.findElement(By.id("rememberme")).isEnabled();

        System.out.println("Remember: "+erg);

    }


}