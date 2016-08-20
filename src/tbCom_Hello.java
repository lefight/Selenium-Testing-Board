
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tools.Commands;
import java.util.concurrent.TimeUnit;


public class tbCom_Hello {



    public static void main(String[] args) throws Exception {

        WebDriver driver;

        driver = Commands.init_Browser("chrome");
        System.out.println(driver);



        driver.get("http://www.t-hobein.de/login");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.findElement(By.id("user_login")).sendKeys("torsten@t-hobein.de");

        driver.findElement(By.id("user_pass")).sendKeys("S1rT0by_wo");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        boolean erg = driver.findElement(By.id("rememberme")).isEnabled();

        System.out.println("Remember: "+erg);



//        driver.findElement(By.id("wp-submit")).submit();

/**
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//p[4]/a")).click();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        String text;
        text = driver.findElement(By.xpath("//div[@id='mainShowDataUsageContent']/div/div/div/span ")).getText();


        System.out.println("1. Wieviel Prozent: "+text);

        if(text.isEmpty()) {
            text = "Error";
        }
        else {
            text = text.substring(0, 2);
        }

        System.out.println("2. Wieviel Prozent: "+text);

        System.out.println("looks like it works!!!"); **/
    }



}