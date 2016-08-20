package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class Commands {

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
}
