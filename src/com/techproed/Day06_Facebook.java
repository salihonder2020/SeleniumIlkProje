package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://facebook.com/");

        //1. Adım (4 dk)
// email kutusuna techproed@gmail.com yazdıralım.
// <input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
// data-testid="royal_email" placeholder="Email address or phone number"
// autofocus="1" aria-label="Email address or phone number">
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");
// 2. Adım (3 dk)
// şifre kutusuna Test1234 yazdıralım.
//<input type="password" class="inputtext _55r1 _6luy" name="pass" id="pass"
// data-testid="royal_pass" placeholder="Password" aria-label="Password">
     WebElement sifreKutusu = driver.findElement(By.xpath("//*[@type='password']"));
     sifreKutusu.sendKeys("Test1234");
//sifreKutusu.submit();
// 3. Adım (2 dk)
// login butonunu bulalım
// <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"
// name="login" data-testid="royal_login_button" type="submit" id="u_0_b">Log In</button>
        //////Burasi calismadi   ///  WebElement loginButonu = driver.findElement(By.tagName("u_0_d"));
      ////  loginButonu.click();
        WebElement loginButonu = driver.findElement(By.id("u_0_d"));
        loginButonu.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        String url = driver.getCurrentUrl();
        if(url.contains("facebook.com/login/")){
            System.out.println("Giriş Başarısız !");
        }else{
            System.out.println("Giriş Başarılı !");
        }


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.quit();


    }


}
