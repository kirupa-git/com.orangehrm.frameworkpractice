package forpraveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebElement ipl = driver.findElement(By.name("q"));
        ipl.sendKeys("metrix cymetrix");
        ipl.submit();

        WebElement username = driver.findElement(By.id("edUserName"));
        WebElement password = driver.findElement(By.id("edPassword"));
        username.sendKeys("kirupaagar");
        password.sendKeys("1234");




    }
}
