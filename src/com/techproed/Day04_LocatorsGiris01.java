package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsGiris01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com/");
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement eMail = driver.findElement(By.id("session_email"));
        eMail.sendKeys("testtechproed@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!");

        WebElement signInbutton = driver.findElement(By.name("commit"));
        signInbutton.click();
    }
}
