package org.sel.sessions.Day3.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sel.sessions.Day2.chrome;

public class SimpleAlert {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver =chrome.getDriver();
        driver.get("https://letcode.in/alert");
        driver.findElement(By.cssSelector("#accept")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(5000);
        driver.quit();

    }
}
