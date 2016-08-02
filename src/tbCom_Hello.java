
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tools.Commands;
import java.util.concurrent.TimeUnit;


public class tbCom_Hello {



    public static void main(String[] args) throws Exception {

        WebDriver driver;

        driver = Commands.init_Browser("Firefox");
        System.out.println(driver);


        driver.get("https://webmail.strato.com");

        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        driver.findElement(By.id("io-ox-login-username")).sendKeys(<eMail>);

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.findElement(By.id("io-ox-login-password")).sendKeys(<passwort>);

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.findElement(By.id("io-ox-login-button")).submit();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        System.out.println("looks like it works!!!");

    }



}