package org.sel.sessions.Day3.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sel.sessions.Day2.chrome;

public class ConfirmAlert {
    public static void main(String[] args) {
        chrome.setUp();
        WebDriver driver = chrome.getDriver();
        driver.findElement(By.cssSelector("#confirm")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
