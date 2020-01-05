package Collections;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class HashMapinSelenium {

    public static void main(String[] args) throws InterruptedException {
        // role base  --> permission based case
        //category manager
        // customer manager  --> go to app -- add all product
        // admin user  --> go to app
        // seller user   --> go to app
        //distributor user   --> go to app
        /// Delivery boy    --> go to app

        //  System.out.println(getHashMapCredential());


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://marketplace.epik.com/Cmpro.com");
        driver.findElement(By.cssSelector("a[class='btn btn-outline-success']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys(getName("customer1"));
        driver.findElement(By.name("password")).sendKeys(getPassword("customer1"));
       String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(3000);
        driver.close();

    }

    public static HashMap<String, String> getHashMapCredential() {
        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("customer1", "Suleyman:TEST@123");
        userMap.put("customer2", "Nurdan:test@1234");
        userMap.put("customer3", "Sina:test@12345");
        userMap.put("customer4", "Elif:test@123456");
        userMap.put("customer5", "User1:@1234567");
        return userMap;
    }
    public static String getName(String role) {
        String name = getHashMapCredential().get(role);
        return name.split(":")[0];
    }
    public static String getPassword(String role) {
        String name = getHashMapCredential().get(role);
        return name.split(":")[1];
    }
}
