package org.sel.sessions.Day2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class Buttons {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver =chrome.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/buttons");
        driver.findElement(new By.ById("home")).click();
        driver.navigate().back();
        Thread.sleep(1000);
//        driver.navigate().forward();
        //for getting position of WebElement 
        Point p=driver.findElement(new By.ById("position")).getLocation();
        System.out.println("location is: x->"+p.getX()+" y->"+p.getY());
        System.out.println("color: "+driver.findElement(new By.ById("color")).getCssValue("color"));
        Rectangle rect=driver.findElement(new By.ById("property")).getRect();
        System.out.println("Height: "+rect.getHeight()+"   width:"+rect.getWidth());
        System.out.println(driver.findElement(new By.ById("isDisabled")).isEnabled());


        //Click and hold Element in selenium using Actions class;
        WebElement element=driver.findElement(By.tagName("h2"));
        Actions actions =new Actions(driver);
        actions.clickAndHold(element).build().perform();
        Thread.sleep(10000);
        driver.close();
    }
}
