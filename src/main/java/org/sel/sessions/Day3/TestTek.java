package org.sel.sessions.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sel.sessions.Day2.chrome;

public class TestTek {
    public static void main(String[] args) {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.get("https://codepen.io/linda-shum-ebflute/pen/jXyddz");
        boolean b=driver.findElement(By.xpath("/html/body/form/div[1]/label")).isSelected();
        System.out.println(b);
    }
}
