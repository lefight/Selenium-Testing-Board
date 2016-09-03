package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class Commands {


    private static RemoteWebDriver webDriver;

    public static WebDriver init_Browser(String args) throws Exception {

        WebDriver driver;

        String browser = null;

        if (args.length() == 0) {
            System.out.println("No Browser Parameter given, use default Browser Firefox");
            browser = "Firefox";
        } else {
            browser = args;
        }

        if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            String pathToChromeDriver = "/Users/torstenhobein/GitHub/driver/chromedriver";
            System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
            driver = new ChromeDriver();
        } else {
            System.out.println("Browser not defined!");
            throw new Exception("Browser not defined!");
        }
        return driver;
    }

/**
    public static void clickAndWaitForPageToLoad(By locator, long timeout) {
        click(locator);
        waitForPageToLoad(timeout, locator);
    }
**/

    public static void waitForPageToLoad(Long timeoutInMillis) {

    }


}
