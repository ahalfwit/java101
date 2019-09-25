package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Answeumeir1 {



    WebDriver driver ;

    /*
    Locators in cucumber are staying inside the pages class   in  cucumber
     */
    String loadingButton = "a[class='nav-link']";
    String ablocator = "//a[contains(text(),'A/B Testing')]";
    String verifyName = "//h3[contains(text(),'No A/B Test')]";
    //String verifyName = "//h3[contains(text(),'asc')]";

//    public static void main(String[] args) {
//        verifyName = verifyName.replace("asc","A/B Testing");
//    }

    @BeforeClass
    public void setup(){  // this method is staying inside hook class in cucumber
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // full screen might have issue while running your script in cucumber
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
    @Test
    public void before() throws InterruptedException {
       driver.get("http://practice.cybertekschool.com/"); // // it is coming from hook class
       driver.findElement(By.xpath(ablocator)).click();  // locator is staying IN PAGES CALSS IN cucumber
       Thread.sleep(3000);
       String verfiyPageName = driver.findElement(By.xpath(verifyName)).getText();  // if we use cucumber it is coming from pages class
                                                                                    // No A/B Test --> it coming from feature file
       Assert.assertEquals(verfiyPageName,"No A/B Test");







    }
    @AfterClass  // it is inside the our hook class in cucumber
    public void tearDown(){

        driver.quit();
    }
}
