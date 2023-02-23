package org.sel.frame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.sel.frame.Base.driver;

public class Base {
    static WebDriver driver;

    public static WebDriver getDriver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    public static void sendKeys(String type, String locatorValue,String keys) {
        getElement(type,locatorValue).sendKeys(keys);

    }
    public static void click(String type, String value){
        getElement(type,value).click();
    }
    public static WebElement getElement(String type, String value){
        if(type.equalsIgnoreCase("xpath")){
            return driver.findElement(By.xpath(value));
        }
        else if(type.equalsIgnoreCase("id")){
            return driver.findElement(new By.ById(value));
        }
        else if(type.equalsIgnoreCase("css")){
            return driver.findElement(By.cssSelector(value));
        }
        else if(type.equalsIgnoreCase("link")){
            return driver.findElement(By.linkText(value));
        }
        else if(type.equalsIgnoreCase("plink")){
            return driver.findElement(By.partialLinkText(value));
        }
        return driver.findElement(By.xpath(""));

    }
}

