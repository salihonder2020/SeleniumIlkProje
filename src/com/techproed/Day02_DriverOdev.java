package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver'ımızı ekranı kaplayacak şekilde kullanalım.
        // 1 - ilk önce google.com'a gidelim.
        // 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
        // 3 - daha sonra youtube.com'a gidelim.
        // 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
        // 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
        // 6 - driver'ımızı kapatalım.

        driver.manage().window().maximize();
        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        System.out.println(googleTitle);
        String googleUrl = driver.getCurrentUrl();
        System.out.println(googleUrl);
        driver.navigate().to("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        System.out.println(youtubeTitle);
        String youtubeUrl1 = driver.getCurrentUrl();
        System.out.println(youtubeUrl1);
        driver.navigate().back();

        driver.quit();
    }



}
