package org.sel.sessions.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Implicit_Wait {
    public static void main(String[] args) {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
