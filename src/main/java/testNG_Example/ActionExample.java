package testNG_Example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class ActionExample {


        WebDriver driver;

        @Test(priority = 3)
        public void MultipleActions() throws InterruptedException {

            driver.get("https://www.flipkart.com/");

            if(driver.findElements(By.xpath("//button[text()='✕']")).size() !=0){

                driver.findElement(By.xpath("//button[text()='✕']")).click();
            }

            WebElement txtUsername = driver.findElement(By.name("q"));
            Actions builder = new Actions(driver);
            Action seriesOfActions = builder
                    .moveToElement(txtUsername)
                    .click()
                    .keyDown(txtUsername, Keys.SHIFT)
                    .sendKeys(txtUsername, "hello")
                    .keyUp(txtUsername, Keys.SHIFT)
                    .doubleClick(txtUsername)
                    .contextClick()
                    .build();

            seriesOfActions.perform() ;
            Thread.sleep(5000);
    }

    @BeforeTest
    public  void beforeSuite(){
        //System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterTest
    public  void afterSuite(){

        driver.close();
        driver.quit();

    }

    @Test(priority = 2)
    public void HoverAction() throws InterruptedException {

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        WebElement Fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
        //Thread.sleep(5000);
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(Fashion)
                .build();

        seriesOfActions.perform() ;
        //Thread.sleep(5000);
    }
    @Test(priority = 1)
    public void HoverAction1() throws InterruptedException {

        driver.get("https://www.moneycontrol.com/");
        //driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.linkText("moneycontrol.com")).click();


        WebElement Fashion = driver.findElement(By.xpath("//a[@title='Markets']"));
        //Thread.sleep(5000);
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(Fashion)
                .build();

        seriesOfActions.perform() ;
       // Thread.sleep(5000);
    }





}
