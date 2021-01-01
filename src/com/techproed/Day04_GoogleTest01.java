package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://google.com");
        //WebElement alertKutusu = driver.findElement(By.xpath("//span[@class='ZFr60d CeoRYc']");
      //alertKutusu.click();
        WebElement aramaKutusu = driver.findElement(By.id("realbox"));
        aramaKutusu.sendKeys("Baby Kleider");
        aramaKutusu.submit();
    }
}
