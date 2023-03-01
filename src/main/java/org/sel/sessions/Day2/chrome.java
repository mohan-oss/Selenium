package org.sel.sessions.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome{
    private static WebDriver driver;
    public static WebDriver getDriver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
    }
}