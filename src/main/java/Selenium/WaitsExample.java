package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExample {

    static WebDriver driver;

    public static void main(String args[]) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));

        //driver.get("https://demoqa.com/dynamic-properties");
        driver.get("https://demos.jquerymobile.com/1.4.5/loader/");
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
       // driver.findElement(By.id("enableAfter")).click();
        //System.out.println("After clicking");


        // Wait for loader to disappear
        driver.findElement(By.xpath("//button[text()='Icon + text']")).click();


        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//h1[text()='loading']"))));

        if(1==1){
            driver.findElement(By.xpath("//button[text()='Text only']")).click();
        }


        //driver.findElement(By.xpath("(//button[@data-icon='delete'])[1]")).click();


        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }



}
