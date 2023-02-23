package org.sel.sessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Day1 {
    public static void main(String[] args) throws InterruptedException {
        String browser= String.valueOf(Browsers.chrome);
        WebDriverManager wd=DriversManager.getWebDriverManager(browser);
        wd.setup();
        WebDriver driver= DriversManager.getDriver(browser);
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/documentation/webdriver/\"]")).click();

    }
}
