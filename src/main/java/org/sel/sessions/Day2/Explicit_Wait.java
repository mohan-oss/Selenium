package org.sel.sessions.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
    public static void main(String[] args) {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.get("https://letcode.in/edit");
        WebElement element= driver.findElement(new By.ById("home"));
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
