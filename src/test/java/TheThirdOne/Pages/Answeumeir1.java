//package TheThirdOne.Pages;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//public class Answeumeir1 {
//
//    WebDriver driver;
//    String secondWindow = "//span[contains(text(),'Join')])[3]";
//    String nameLocator = "input[name='name']";
//    String lastNameLocator = "input[name='lastname']";
//    String emailLocator = "input[name='email']";
//    String cityLocator = "input[name='state']";
//    String messageLocator = "textarea[name='message']";
//    String submitButtonLocator = "//span[contains(text(),'Submit')]";
//    String submissionMassageLocator = driver.findElement(By.xpath("//p[contains(text(),'Your application has been received')]")).getText();
//
//
//
//    /*
//    Locators in cucumber are staying inside the pages class   in  cucumber
//     */
//    String loadingButton = "a[class='nav-link']";
//    String ablocator = "TheThirdOne.Technical.A";
//    String verifyName = "TheThirdOne.Technical.A";
//    //String verifyName = "//h3[contains(text(),'asc')]";
//
////    public static void main(String[] args) {
////        verifyName = verifyName.replace("asc","A/B Testing");
////    }
//
// TheThirdOne.Technical.A  @BeforeClass
//    public void setup() {  // this method is staying inside hook class in cucumber
//        WebDriverManager.chromedriver().setup();
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();  // full screen might have issue while running your script in cucumber
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//
//
//    public void before() throws InterruptedException {
//        driver.get("http://practice.cybertekschool.com/"); // // it is coming from hook class
//        driver.findElement(By.xpath(ablocator)).click();  // locator is staying IN PAGES CALSS IN cucumber
//        Thread.sleep(3000);
//        String verfiyPageName = driver.findElement(By.xpath(verifyName)).getText();  // if we use cucumber it is coming from pages class
//        // No A/B Test --> it coming frTheThirdOne.Technical.Am feature file
//        Assert.assertEquals(verfiyPageName, "No A/B Test");
//        driveTheThirdOne.Technical.A.findElement(By.xpath("//a[contains(text(),'Cybertek School')]")).click();
//        Thread.sleep(2000);
//
//        String parentWindow = driver.getWindowHandle();
//        Set<String> allWindows = driver.getWindowHandles();
//
//        for (String each : allWindows) {
//            if (!each.equals(parentWindow)) {
//                Thread.sleep(1000);
//                driver.switchTo().window(each);
//                Thread.sleep(1000);
//                driver.findElement(By.xpath(secondWindow)).click();
//                Thread.sleep(2000);
//                driver.findElement(By.cssSelector(nameLocator)).sendKeys("Solomon");
//                driver.findElement(By.cssSelector(lastNameLocator)).sendKeys("Dagalar");
//                driver.findElement(By.cssSelector(emailLocator)).sendKeys("Somemail@gmail.com");
//                driver.findElement(By.cssSelector(cityLocator)).sendKeys("New Hempshire");
//                driver.findElement(By.cssSelector(messageLocator)).sendKeys("Let get some tea ");
//                driver.findElement(By.xpath(submitButtonLocator)).click();
//
//                Assert.assertEquals(submissionMassageLocator, "Your application has been received");
//
//                Thread.sleep(2000);
//                driver.close();
//                Thread.sleep(2000);
//                // driver.switchTo().defaultContent();
//                driver.switchTo().window(parentWindow);
//                Thread.sleep(2000);
//                driver.close();
//                driver.switchTo().defaultContent();
//            }
//        }
//    }
//
//    @AfterClass  // it is inside the our hook class in cucumber
//    public void tearDown() {
//
//        driver.quit();
//    }
//}
