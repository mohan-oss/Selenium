package org.sel.sessions.Day3.Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sel.sessions.Day2.chrome;

import java.util.List;

public class Tables {
    public static void main(String[] args) {
        chrome.setUp();
        WebDriver driver=chrome.getDriver();
        driver.get("https://letcode.in/table");
        WebElement table=driver.findElement(By.xpath("//table[@id=\"simpletable\"]//tbody"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        for(WebElement e:rows){
            List<WebElement> row=e.findElements(By.tagName("td"));
            //row.stream().map(el->el.getText()).forEach(System.out::println);
            if(row.get(0).getText().equalsIgnoreCase("Iron")){
                System.out.println("working");
                row.get(3).findElement(By.tagName("input")).click();
                break;
            }
        }
    }
}
