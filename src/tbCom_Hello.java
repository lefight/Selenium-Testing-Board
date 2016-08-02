
import org.openqa.selenium.firefox.FirefoxDriver;


public class tbCom_Hello {

    public static void main(String[] args) {

        FirefoxDriver fox1;
        fox1 = new FirefoxDriver();

        fox1.get("https://www.google.de");
        fox1.findElementById("lst-ib").sendKeys("Selenium");
        fox1.findElementByCssSelector("button[name=\"btnG\"]").click();

        System.out.println("looks like it works!!!");

    }
}