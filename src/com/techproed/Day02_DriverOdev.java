package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        // driver'ımızı ekranı kaplayacak şekilde kullanalım.
        // 1 - ilk önce google.com'a gidelim.
        // 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
        // 3 - daha sonra youtube.com'a gidelim.
        // 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
        // 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
        // 6 - driver'ımızı kapatalım.

        webdriver.manage().window().maximize();
        webdriver.get("http://google.com");
        String googleTitle = webdriver.getTitle();
        System.out.println(googleTitle);
        String googleUrl = webdriver.getCurrentUrl();
        System.out.println(googleUrl);
        webdriver.navigate().to("http://youtube.com");
        String youtubeTitle = webdriver.getTitle();
        System.out.println(youtubeTitle);
        String youtubeUrl1 = webdriver.getCurrentUrl();
        System.out.println(youtubeUrl1);
        webdriver.navigate().back();

        webdriver.quit();
    }



}
