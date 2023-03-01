package org.sel.sessions.Day3.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sel.sessions.Day2.chrome;

import java.util.List;

public class SelectLast {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver = chrome.getDriver();
        driver.get("https://letcode.in/dropdowns");
        WebElement element=driver.findElement(By.cssSelector("#lang"));
        Select select=new Select(element);
        List<WebElement> list=select.getOptions();
        select.selectByIndex(list.size()-1);
        list.stream().map(el->el.getText()).forEach(System.out::println);
        Thread.sleep(5000);
        driver.close();


    }
}
