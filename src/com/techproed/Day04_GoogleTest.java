package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("cty bikes");
        aramaKutusu.submit();

        WebElement sonucSaysi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSaysi.getText());

        WebElement alisverisLinki = driver.findElement(By.partialLinkText("Shopping"));
        alisverisLinki.click();




    }
}
