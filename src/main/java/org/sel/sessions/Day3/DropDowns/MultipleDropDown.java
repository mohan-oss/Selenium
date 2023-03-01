package org.sel.sessions.Day3.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sel.sessions.Day2.chrome;

import java.util.List;

public class MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.get("https://letcode.in/dropdowns");
        WebElement element=driver.findElement(By.cssSelector("#superheros"));
        Select s=new Select(element);
        List<WebElement> l=s.getOptions();
        for(WebElement e:l){
            System.out.println(e.getText());
        }

        if(s.isMultiple()){
            s.selectByIndex(1);
            s.selectByIndex(3);
            s.selectByIndex(5);
        }
        Thread.sleep(5000);
        driver.close();
    }
}
