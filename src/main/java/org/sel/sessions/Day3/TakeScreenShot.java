package org.sel.sessions.Day3;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.sel.sessions.Day2.chrome;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class TakeScreenShot {
    public static void main(String[] args) throws InterruptedException, IOException {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.get("https://letcode.in/game");
        driver.findElement(By.className("start-button")).click();
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f,new File("//Users/mmsurendar/Documents/SeleniumScreenShots/Snake.png"));
        Thread.sleep(5000);
        driver.close();
    }
}
