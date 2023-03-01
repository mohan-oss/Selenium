package org.sel.sessions.Day3.Alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.sel.sessions.Day2.chrome;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class SweetAlert {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver =chrome.getDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        //driver.findElement(By.cssSelector("#modern")).click();
        Alert alert=driver.switchTo().alert();
        driver.findElement(By.xpath("//button[@aria-label=\"close\"]")).click();
        Thread.sleep(5000);
        driver.close();
    }
}