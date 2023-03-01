package org.sel.sessions.Day3.Tables;
import java.util.*;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sel.sessions.Day2.chrome;

public class ShoppingTable {
    public static void main(String[] args) {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.get("https://letcode.in/table");
        WebElement table=driver.findElement(By.xpath("//table[@id=\"shopping\"]//tbody"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        int sum=0;
        int total=Integer.parseInt(driver.findElement(By.xpath("//table[@id=\"shopping\"]//b")).getText());
        for(WebElement e:rows){
            List<WebElement> row=e.findElements(By.tagName("td"));
            try{
                sum+=Integer.parseInt(row.get(1).getText());
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        System.out.println(sum+" "+total);
        if(total==sum){
            System.out.println("Valid");
            return;
        }
        System.out.println("Not valid");

    }
}
