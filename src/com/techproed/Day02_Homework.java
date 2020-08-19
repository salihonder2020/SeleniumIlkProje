package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Clock;

public class Day02_Homework {
//1. Yeni bir class oluşturun :Homework
//2. ChromeDriver’ı kullanarak facebook’a gidin ve sayfa başlığının(Page Title) “facebook” olup olmadığını doğrulayın, Değilse, doğru başlığı(Actual title) yazdırın.
//3. Sayfa URL’sinin facebook içerip içermediğini(contains), Değilse doğru URL’yi(Actual url) yazdırın.
//4. Ardından Navigate to https://www.walmart.com/
//5. Walmart sayfa başlığının “Walmart.com” içerip içermediğini(contains) doğrulayın
//6. Navigate back to facebook
//7. Sayfayı yenileyin(refresh)
//8. Maximize the window
//9. Close the browser (bearbeitet)

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        String faceTitle = driver.getTitle();
        System.out.println(faceTitle);
        if(faceTitle.contains("Facebook")){
            System.out.println("Facebook Iceriyor");
        }else{
            System.out.println("faceTitle");
        }

        String faceUrl = driver.getCurrentUrl();
        System.out.println(faceUrl);
        if(faceUrl.contains("facebook")){
            System.out.println("facebook Iceriyor");
        }else{
            System.out.println("faceUrl");
        }

        driver.navigate().to("https://www.walmart.com");

        String walmartTitle = driver.getTitle();
        System.out.println(faceTitle);
        if(walmartTitle.contains("Walmart.com")){
            System.out.println("Walmart.com Iceriyor");
        }else{
            System.out.println(walmartTitle);
        }
        driver.navigate().back();
        driver.navigate().refresh();

        driver.manage().window().maximize();



        driver.quit();

    }


}
