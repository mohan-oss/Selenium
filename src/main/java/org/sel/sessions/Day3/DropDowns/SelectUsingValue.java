package org.sel.sessions.Day3.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sel.sessions.Day2.chrome;

public class SelectUsingValue {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.get("https://letcode.in/dropdowns");
        WebElement element=driver.findElement(By.cssSelector("#country"));
        Select select=new Select(element);
        select.selectByVisibleText("India");
        Thread.sleep(5000);
        driver.quit();
    }
}
