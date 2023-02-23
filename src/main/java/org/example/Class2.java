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
//Test all links in tekion website.
public class Class2 {
    static WebDriver driver;
    static HttpURLConnection con;
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://tekion.com");
        List<WebElement> e=driver.findElements(new By.ByTagName("a"));
        System.out.println(e.size());
        int c=0;
        for(WebElement l:e){
            String endpoint=l.getAttribute("href");
            try{
                URL url=new URL(endpoint);
                con=(HttpURLConnection)url.openConnection();
                con.connect();
            }
            catch(Exception exception){
                System.out.println(endpoint+" is not correct URL");
            }
            System.out.print(++c+" ");
            if( con.getResponseCode()==200){

                System.out.println(endpoint+" working");
            }
            else{
                System.out.println(con.getResponseCode());
                System.out.println(endpoint+" Not working");
            }
        }
        driver.quit();
    }

}
