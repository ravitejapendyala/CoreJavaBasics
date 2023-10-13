package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementClick {

    static WebDriver driver;

    public static  void  main(String args[]){

        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try{
            driver.get("https://www.fb.com/");
            driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
            Thread.sleep(4000);
            driver.close();
            driver.quit();

        }
        catch (Exception e){
            driver.close();
            driver.quit();
        }


    }

    public  static void  SelectDropdown(WebElement element,String value){



    }
}
