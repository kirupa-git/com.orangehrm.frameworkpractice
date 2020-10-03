package looktamil.boybaynames;

import com.orangehrm.commonutils.configurationfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class namewith21 extends configurationfile {
    public static WebDriver driver;

    @BeforeSuite
    public static void opn() throws IOException {
        System.setProperty("webdriver.chrome.driver", config().getProperty("chromedriverlocation"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public static void lok(){
        driver.navigate().to("https://www.looktamil.com/babynames/tools/quick-name-finder?page=1&rating=0" +
                "&gender=M&star=&name_starts=&name_ends=&select_num=21&rating=0");

        List<WebElement> names = driver.findElements(By.id("babyNameshowBlue"));
        for (WebElement name : names) {
            name.getText();
        }
    }

}
