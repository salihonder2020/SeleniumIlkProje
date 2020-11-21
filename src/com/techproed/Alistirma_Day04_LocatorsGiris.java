package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alistirma_Day04_LocatorsGiris {
    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement signInButonu = driver.findElement(By.id("sign-in"));
        signInButonu.click();
        /*
        <input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
         */

        WebElement emailKutusu = driver.findElement(By.id("session_email"));

        emailKutusu.sendKeys("testtechproed@gmail.com");

        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">

        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");








    }

}
