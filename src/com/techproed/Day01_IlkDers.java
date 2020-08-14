package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        //Java Projemize chromedrivere tanittik

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herr\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //selenium ile ilgili ilk kodumuz
        //webDriver nesnesi olusturarak, chromedriver kullanilabilir hale getirdik

        WebDriver webDriver = new ChromeDriver();


        webDriver.get("https://www.google.com");
        //webDriver.close(); acik olan pencereyi kapatir
        //webDriver.close();

        //webDriver.quit(); acik olan butun pencereleri kapatir
       // webDriver.quit();






    }




}
