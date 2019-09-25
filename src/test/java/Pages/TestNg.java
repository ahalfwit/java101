package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNg {
    WebDriver driver;


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test(invocationCount = 10)
    public void test() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java", Keys.ENTER);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(3000);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
