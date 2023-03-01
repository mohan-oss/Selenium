package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://news.ycombinator.com/");
        WebElement input=driver.findElement(By.tagName("input"));
        input.sendKeys("linux");
        input.submit();

        //Search
        WebElement search=driver.findElement(By.xpath("//*[@class=\"SearchFilters_filters\"]/span[1]/div"));
        search.click();
        search.findElement(By.xpath("//li[1]")).click();
        //by
        WebElement by=driver.findElement(By.xpath("//*[@class=\"SearchFilters_filters\"]/span[2]/div"));
        by.click();
        by.findElement(By.xpath("//li[1]")).click();
        //for
        WebElement forEl=driver.findElement(By.xpath("//*[@class=\"SearchFilters_filters\"]/span[3]/div"));
        forEl.click();
        forEl.findElement(By.xpath("//li[6]")).click();
        driver.findElement(By.xpath("//span[@tabindex=\"0\"][1]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/span[3]/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//span[@tabindex=\"0\"][2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/span[3]/div[2]/div/div/div/div[2]/div/div[3]/div[5]/div[3]")).click();
        driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();


    }
}
