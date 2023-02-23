package org.sel.frame;

import org.openqa.selenium.WebDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Base.setUp();
        WebDriver driver=Base.getDriver();
        driver.get("https://tekion.com");
        Thread.sleep(1000);
        Base.click("xpath","//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div/button/div/div/div");
    }
}
