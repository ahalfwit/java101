//package TheThirdOne.Pages;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//public class Example21 {
//
//
//    WebDriver driver;
//
//    /*
//    Locators in cucumber are staying inside the pages class   in  cucumber
//     */
//    String loadingButton = "a[class='nav-link']";
//    String ablocator = "TheThirdOne.Technical.A";
//    String verifyName = "TheThirdOne.Technical.A";
//    //String verifyName = "//h3[contains(text(),'asc')]";
//    String secondWindow = "(//span[contains(text(),'Join')])[3]";
//
////    public static void main(String[] args) {
////        verifyName = verifyName.replace("asc","TheThirdOne.Technical.A/B Testing");
////    }
//
//    @BeforeClass
//    public void setup() {  // this method is staying inside hook class in cucumber
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();  // full screen might have issue while running your script in cucumber
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//
//    @Test
//    public void before() throws InterruptedException {
//        driver.get("http://practice.cybertekschool.com/"); // // it is coming from hook class
//        driver.findElement(By.xpath(ablocator)).click();  // locator is staying IN PAGES CALSS IN cucumber
//        Thread.sleep(2000);
//        String verfiyPageName = driver.findElement(By.xpath(verifyName)).getText();  // if we use cucumber it is coming from pages class
//        // No TheThirdOne.Technical.A/B Test --> it coming from feature file
//        Assert.assertEquals(verfiyPageName, "No TheThirdOne.Technical.A/B Test");
//        driver.findElement(By.xpath("//a[contains(text(),'Cybertek School')]")).click();
//        Thread.sleep(2000);
//
//        String parentWindow = driver.getWindowHandle();
//
//        Set<String> windowHandles = driver.getWindowHandles();
//
//        for (String each : windowHandles) {
//
//            if (!each.equals(parentWindow)) {
//                driver.switchTo().window(each);
//                Thread.sleep(2000);
//                driver.findElement(By.xpath(secondWindow)).click();
//                Thread.sleep(2000);
//                driver.close();
//                Thread.sleep(2000);
//                // driver.switchTo().defaultContent();
//                driver.switchTo().window(parentWindow);
//            }
//        }
//    }
//    @AfterClass  // it is inside the our hook class in cucumber
//    public void tearDown() {
//        driver.quit();
//    }
//}
