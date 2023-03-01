package org.sel.sessions.Day3.DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sel.sessions.Day2.chrome;

import java.util.concurrent.TimeUnit;

public class Drag {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://letcode.in/draggable");
        //driver.switchTo().frame(0);
        WebElement element=driver.findElement(By.cssSelector("#sample-box"));
        Point p=element.getLocation();
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(element,30,40).perform();
        Thread.sleep(5000);
        driver.close();
    }
}
