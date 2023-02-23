package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// print top 10 computers and tablets prices.
public class Main {
    static WebDriver d;
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","/Users/mmsurendar/Downloads/chromedriver_mac64/chromedriver");

//        int val=1;
//        for(int i=val;i<30;i+=3){
//            System.out.println(d.findElement(By.xpath("//*[@id=\"hnmain\"]/tbody/tr[3]/td/table/tbody/tr["+i+"]")).getText());
//        }
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://amazon.com");
        d.findElement(By.className("hm-icon-label")).click();
        Thread.sleep(1000);
        xpathclick("//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a");
        xpathclick("//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a");
        Thread.sleep(1000);
        xpathclick("//*[@id=\"hmenu-content\"]/ul[6]/li[5]/a");
        int sum=0;
        for(int i=1;i<10;i++){
            int y=Integer.parseInt(d.findElement(By.xpath("//div[@data-component-type='s-search-result']["+i+"]//span[@class='a-price-whole']")).getText());
            System.out.println(y);
            sum+=y;
        }

    }

    static void xpathclick(String xpath) {
        d.findElement(By.xpath(xpath)).click();
    }

}
