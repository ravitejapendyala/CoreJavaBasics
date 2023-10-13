package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsPresenceOfElement {

    static WebDriver driver;

    public static void main(String args[]) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //driver.get("https://demoqa.com/dynamic-properties");
        driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
       // driver.findElement(By.id("enableAfter")).click();
        //System.out.println("After clicking");


        WebElement l=driver.findElement(By.linkText("Terms of Use"));
        l.click();
        // explicit wait condition
        // presenceOfElementLocated condition
        wait.until(ExpectedConditions.presenceOfElementLocated (By.tagName("h1")));
        // get text of element and print
        l=driver.findElement(By.linkText("Terms of Use"));
        System.out.println("Element present having text:" + l.getText());


        //driver.findElement(By.xpath("(//button[@data-icon='delete'])[1]")).click();


        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }



}
