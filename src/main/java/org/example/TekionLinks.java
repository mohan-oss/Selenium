package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jsoup.helper.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
//Print all a tag links of tekion website.
public class TekionLinks{
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://tekion.com");
        List<WebElement> e=driver.findElements(new By.ByTagName("a"));
        System.out.println(e.size());
        int c=0;
        for(WebElement l:e){
            System.out.println(++c+" "+l.getAttribute("href"));
        }
        driver.quit();
    }

}
