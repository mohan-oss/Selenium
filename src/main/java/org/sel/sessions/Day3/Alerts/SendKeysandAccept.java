package org.sel.sessions.Day3.Alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sel.sessions.Day2.chrome;

public class SendKeysandAccept {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver =chrome.getDriver();
        driver.get("https://letcode.in/alert");
        driver.findElement(By.cssSelector("#prompt")).click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("mohan");
        Thread.sleep(5000);
        alert.accept();
        Thread.sleep(5000);
        driver.close();
    }

}
