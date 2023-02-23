package org.example;
import org.openqa.selenium.WebDriver;
import org.sel.frame.*;
public class Gmail {
    public static void main(String[] args) throws InterruptedException {
        Base.setUp();
        WebDriver driver=Base.getDriver();
        driver.get("https://gmail.com");
        Thread.sleep(1000);
        Base.sendKeys("xpath","//input[@type='email']","mohansurendar.mullapudi");
        Thread.sleep(1000);
        Base.click("xpath","//span[text()='Next']");
        Thread.sleep(1000);
        Base.sendKeys("xpath","//span[text()='Next']","@M1o2h3a4n53");
        driver.quit();
    }
}
