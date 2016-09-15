package com.selTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.*;
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

        driver = Commands.init_Browser("chrome");
        System.out.println(driver);

        driver.get("http://thobein.wordpress.com/login");


        driver.findElement(By.id("user_login")).sendKeys("torsten@t-hobein.de");

        driver.findElement(By.id("user_pass")).sendKeys("S1rT0by_wo");

        driver.findElement(By.id("rememberme")).click();

        driver.findElement(By.id("user_pass")).submit();


        WebElement meMenu = driver.findElement(By.cssSelector("img.avatar.avatar-32"));
        Actions action = new Actions(driver);

        action.moveToElement(meMenu).build().perform();

        driver.findElement(By.xpath("//span[2]/a[2]")).click();


    }


}