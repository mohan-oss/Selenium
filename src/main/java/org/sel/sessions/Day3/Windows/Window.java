package org.sel.sessions.Day3.Windows;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sel.sessions.Day2.chrome;

import java.util.List;

public class Window {
    public static void main(String[] args) {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.get("https://letcode.in/windows");
        driver.findElement(By.xpath("//button[@id='home']")).click();
        Set<String> set= driver.getWindowHandles();
        List<String> windowHandles=new ArrayList<>(set);
        driver.switchTo().window(windowHandles.get(1));
        driver.close();
        Set<String> set3= driver.getWindowHandles();
        List<String> windowHandles3=new ArrayList<>(set3);
        driver.switchTo().window(windowHandles.get(0));
        driver.findElement(By.cssSelector("#multi")).click();


    }
}
