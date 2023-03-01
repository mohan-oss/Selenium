package org.sel.sessions.Day2;

import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sel.frame.Base;

public class Input {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver= chrome.getDriver();
        driver.get("https://letcode.in/edit");
        driver.findElement(new By.ById("fullName")).sendKeys("mohan surendar");
        driver.findElement(new By.ById("join")).sendKeys(" append", Keys.TAB);
        System.out.println(driver.findElement(new By.ById("getMe")).getAttribute("value"));;
        driver.findElement(new By.ById("clearMe")).clear();
        System.out.println("Enabled: "+driver.findElement(new By.ById("noEdit")).isEnabled());;
        Thread.sleep(5000);
        driver.close();

    }

}

