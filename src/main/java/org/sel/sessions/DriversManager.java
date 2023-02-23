package org.sel.sessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.sql.Driver;

public class DriversManager {
    static WebDriverManager wdm;
    static WebDriver driver;
    public static WebDriverManager getWebDriverManager(String driverName){
       if(driverName.equalsIgnoreCase("safari")){
            return wdm.safaridriver();
        }
        else if(driverName.equalsIgnoreCase("firefox")){
            return wdm.firefoxdriver();
        }
        return wdm.chromedriver();
    }
    public static WebDriver getDriver(String d){

        if(d.equalsIgnoreCase("safari")){
            driver=new SafariDriver();
            return driver;
        }
        else if(d.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
            return driver;
        }
        driver=new ChromeDriver();
        return driver;
    }
}
