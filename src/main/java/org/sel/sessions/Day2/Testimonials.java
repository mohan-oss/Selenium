package org.sel.sessions.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Testimonials {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://tekion.com/testimonials");
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        for(int i=1;i<16;i++){
            System.out.println(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div["+i+"]//b")).getText()+"-"+driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[\"+i+\"]//p")).getText());

        }
        Thread.sleep(5000);
        driver.close();
    }
}
