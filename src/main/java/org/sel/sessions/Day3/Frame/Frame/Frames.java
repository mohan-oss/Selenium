package org.sel.sessions.Day3.Frame.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sel.sessions.Day2.chrome;

//frames are inner html elements, driver cannot find them, so we need to switch to frames by id name or xpath.
public class Frames {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver =chrome.getDriver();
        driver.get("https://letcode.in/frame");
        driver.switchTo().frame("firstFr");
        driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("mohan");
        driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("surendar");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("surendar@gmail.com");
        Thread.sleep(5000);
        driver.close();
    }
}
