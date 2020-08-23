package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailKutusu = driver.findElement(By.xpath("//input[@type = 'email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@type = 'password']"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement signInButonu = driver.findElement(By.xpath("//input[@type = 'submit']"));
        signInButonu.click();

        WebElement welcomeYazisi = driver.findElement(By.xpath("//h1"));
        System.out.println(welcomeYazisi.getText());

    }
}
