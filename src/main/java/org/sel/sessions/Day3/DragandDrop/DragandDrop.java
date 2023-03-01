package org.sel.sessions.Day3.DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sel.sessions.Day2.chrome;

import java.util.concurrent.TimeUnit;

public class DragandDrop {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.get("https://letcode.in/dropable");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element1=driver.findElement(By.id("draggable"));
        WebElement element2=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(element1,element2).perform();
        Thread.sleep(5000);
        driver.close();
    }
}
