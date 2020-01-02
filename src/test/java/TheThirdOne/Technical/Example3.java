//package TheThirdOne.Technical;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class Example3 {
//
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://www.google.com");
//
//        driver.findElement(By.name("q")).sendKeys("mahatama gandhi");
//        List<WebElement> autoSuggest = driver.findElements(By
//                .xpath("//div[@class='sbqs_c']"));
//        // verify the size of the list
//        System.out
//                .println("Size of the AutoSuggets is = " + autoSuggest.size());
//        // print the auto suggest
//        for (WebElement a : autoSuggest)
//            System.out.println("Values are = " + a.getText());
//        // suppose now you want to click on 3rd auto suggest then simply do like
//        // this
//        autoSuggest.get(2).click();
//
//        List<WebElement> all= driver.findElements(By.xpath(""));
//
//
//        for(WebElement each : all){
//            if(each.equals("turkey")){
//
//            }
//        }
//
//    }
//}
//
//
